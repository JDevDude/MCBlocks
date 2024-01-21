package com.jdev.mcblocks;

import com.jdev.mcblocks.items.BlockItemBase;
import com.jdev.mcblocks.items.ItemToolTipBase;
import com.jdev.mcblocks.items.ModItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MainMod.MOD_ID);

    public static final RegistryObject<Item> AMETHYST_BLOCK = ITEMS.register("amethyst_block",
        () -> new BlockItemBase(ModBlocks.AMETHYST_BLOCK.get()));
    public static final RegistryObject<Item> CALCITE = ITEMS.register("calcite_block",
            () -> new BlockItemBase(ModBlocks.CALCITE.get()));
    public static final RegistryObject<Item> TUFF = ITEMS.register("tuff_block",
            () -> new BlockItemBase(ModBlocks.TUFF.get()));
    public static final RegistryObject<Item> COBBLED_DEEPSLATE = ITEMS.register("cobbled_deepslate",
            () -> new BlockItemBase(ModBlocks.COBBLED_DEEPSLATE.get()));
    public static final RegistryObject<Item> DEEPSLATE = ITEMS.register("deepslate_block",
            () -> new BlockItemBase(ModBlocks.DEEPSLATE.get()));
    public static final RegistryObject<Item> CHISELED_DEEPSLATE = ITEMS.register("chiseled_deepslate",
            () -> new BlockItemBase(ModBlocks.CHISELED_DEEPSLATE.get()));
    public static final RegistryObject<Item> POLISHED_DEEPSLATE = ITEMS.register("polished_deepslate",
            () -> new BlockItemBase(ModBlocks.POLISHED_DEEPSLATE.get()));
    public static final RegistryObject<Item> DEEPSLATE_BRICKS = ITEMS.register("deepslate_bricks",
            () -> new BlockItemBase(ModBlocks.DEEPSLATE_BRICKS.get()));
    public static final RegistryObject<Item> DEEPSLATE_TILES = ITEMS.register("deepslate_tiles",
            () -> new BlockItemBase(ModBlocks.DEEPSLATE_TILES.get()));
    public static final RegistryObject<Item> CRACKED_DEEPSLTE_BRICKS = ITEMS.register("cracked_deepslate_bricks",
            () -> new BlockItemBase(ModBlocks.CRACKED_DEEPSLATE_BRICKS.get()));
    public static final RegistryObject<Item> CRACKED_DEEPSLATE_TILES = ITEMS.register("cracked_deepslate_tiles",
            () -> new BlockItemBase(ModBlocks.CRACKED_DEEPSLATE_TILES.get()));

    public static final RegistryObject<Item> MUD_BLOCK = ITEMS.register("mud_block",
            () -> new ItemToolTipBase(ModBlocks.MUD_BLOCK.get(), "mud_block"));
    public static final RegistryObject<Item> PACKED_MUD = ITEMS.register("packed_mud",
            () -> new ItemToolTipBase(ModBlocks.PACKED_MUD.get(), "packed_mud"));
    public static final RegistryObject<Item> MUD_BRICKS = ITEMS.register("mud_bricks",
            () -> new BlockItemBase(ModBlocks.MUD_BRICKS.get()));

    public static final RegistryObject<Item> MOSS_BLOCK = ITEMS.register("moss_block",
            () -> new BlockItemBase(ModBlocks.MOSS_BLOCK.get()));


    public static final RegistryObject<Item> AMETHYST_SHARD = ITEMS.register("amethyst_shard", ModItemBase::new);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
