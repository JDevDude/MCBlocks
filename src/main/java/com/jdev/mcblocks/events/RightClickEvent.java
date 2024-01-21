package com.jdev.mcblocks.events;

import com.jdev.mcblocks.MainMod;
import com.jdev.mcblocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MainMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class RightClickEvent {
    @SubscribeEvent
    public static void onRightClick(PlayerInteractEvent.RightClickBlock event){
        if(event.getWorld().isRemote){
            return;
        }

        BlockPos pos = event.getPos();
        World world = event.getWorld();
        PlayerEntity player = event.getPlayer();
        ItemStack heldItem = player.getHeldItem(event.getHand());

        if(heldItem.getItem() == Items.CLAY_BALL){
            BlockState blockState = world.getBlockState(pos);
            if(blockState.getBlock() == Blocks.DIRT){
                event.setCanceled(true);

                // Replace dirt with mud block
                world.setBlockState(pos, ModBlocks.MUD_BLOCK.get().getDefaultState());

                // Use up one clay ball during the conversion process, doesn't apply to creative.
                if (!player.isCreative()){
                    heldItem.shrink(1);
                }

                playConversionSoundMud(world, player, pos);

                spawnWaterParticles(world, pos);
            }
        }

        if(heldItem.getItem() == Items.WHEAT){
            BlockState blockState = world.getBlockState(pos);
            if(blockState.getBlock() == ModBlocks.MUD_BLOCK.get()){
                event.setCanceled(true);

                world.setBlockState(pos, ModBlocks.PACKED_MUD.get().getDefaultState());

                if (!player.isCreative()){
                    heldItem.shrink(1);
                }

                playConversionSoundPacked(world, player, pos);
            }
        }
    }

    private static void playConversionSoundMud(World world, PlayerEntity player, BlockPos pos){
        if (world instanceof ServerWorld){
            ServerWorld serverWorld = (ServerWorld) world;

            serverWorld.playSound(null, pos, SoundEvents.ENTITY_PLAYER_SWIM, SoundCategory.PLAYERS, 1.0f, 1.0f);
        }
    }

    private static void playConversionSoundPacked(World world, PlayerEntity player, BlockPos pos){
        if (world instanceof ServerWorld){
            ServerWorld serverWorld = (ServerWorld) world;

            serverWorld.playSound(null, pos, SoundEvents.BLOCK_COMPOSTER_FILL_SUCCESS, SoundCategory.PLAYERS, 1.0f, 1.0f);
        }
    }

    private static void spawnWaterParticles(World world, BlockPos pos) {
        if (world instanceof ServerWorld) {
            ServerWorld serverWorld = (ServerWorld) world;

            // Adjust particle spawning as needed
            double x = pos.getX() + 0.7;
            double y = pos.getY() + 0.7;
            double z = pos.getZ() + 0.7;

            // Spawn water particles in a localized area around the block
            for (int i = 0; i < 10; i++) {
                double offsetX = world.rand.nextDouble() - 0.7;
                double offsetY = world.rand.nextDouble() - 0.7;
                double offsetZ = world.rand.nextDouble() - 0.7;

                serverWorld.spawnParticle(ParticleTypes.DRIPPING_WATER, x + offsetX, y + offsetY, z + offsetZ, 1, 0.1, 0.1, 0.1, 0.1);
            }
        }
    }
}
