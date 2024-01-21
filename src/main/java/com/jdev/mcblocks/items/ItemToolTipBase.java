package com.jdev.mcblocks.items;

import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ItemToolTipBase extends BlockItem {
    String descriptionKey;
    public ItemToolTipBase(Block block, String descriptionKey) {
        super(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64));
        this.descriptionKey = descriptionKey;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new TranslationTextComponent("tooltip.mcblocks." + descriptionKey));
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
