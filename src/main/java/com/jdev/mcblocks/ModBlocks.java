package com.jdev.mcblocks;

import com.jdev.mcblocks.blocks.CustomBlockBase;
import com.jdev.mcblocks.blocks.EarthBlockBase;
import com.jdev.mcblocks.blocks.StoneBlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MainMod.MOD_ID);

    public static final RegistryObject<Block> AMETHYST_BLOCK = BLOCKS.register("amethyst_block",
            () -> new StoneBlockBase(0.75f, 0.75f));
    public static final RegistryObject<Block> CALCITE = BLOCKS.register("calcite_block",
            () -> new StoneBlockBase(0.75f, 0.75f));
    public static final RegistryObject<Block> TUFF = BLOCKS.register("tuff_block",
            () -> new StoneBlockBase(1.5f, 6.0f));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE = BLOCKS.register("cobbled_deepslate",
            () -> new StoneBlockBase(3.5f, 6.0f));
    public static final RegistryObject<Block> DEEPSLATE = BLOCKS.register("deepslate_block",
            () -> new StoneBlockBase(3.0f, 6.0f));
    public static final RegistryObject<Block> CHISELED_DEEPSLATE = BLOCKS.register("chiseled_deepslate",
            () -> new StoneBlockBase(3.0f, 6.0f));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE = BLOCKS.register("polished_deepslate",
            () -> new StoneBlockBase(3.5f, 6.0f));
    public static final RegistryObject<Block> DEEPSLATE_BRICKS = BLOCKS.register("deepslate_bricks",
            () -> new StoneBlockBase(3.5f, 6.0f));
    public static final RegistryObject<Block> DEEPSLATE_TILES = BLOCKS.register("deepslate_tiles",
            () -> new StoneBlockBase(3.5f, 6.0f));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICKS = BLOCKS.register("cracked_deepslate_bricks",
            () -> new StoneBlockBase(3.5f, 6.0f));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILES = BLOCKS.register("cracked_deepslate_tiles",
            () -> new StoneBlockBase(3.5f, 6.0f));

    public static final RegistryObject<Block> MUD_BLOCK = BLOCKS.register("mud_block",
            () -> new EarthBlockBase(0.5f, 0.5f));
    public static final RegistryObject<Block> PACKED_MUD = BLOCKS.register("packed_mud",
            () -> new StoneBlockBase(1.0f, 3.0f));
    public static final RegistryObject<Block> MUD_BRICKS = BLOCKS.register("mud_bricks",
            () -> new StoneBlockBase(1.5f, 3.0f));

    public static final RegistryObject<Block> MOSS_BLOCK = BLOCKS.register("moss_block",
            () -> new CustomBlockBase(Material.EARTH, 0.1f, 0.1f, SoundType.GROUND, 0, ToolType.HOE));


    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
