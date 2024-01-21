package com.jdev.mcblocks.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ModItemBase extends Item {
    public ModItemBase() {
        super(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64));
    }
}
