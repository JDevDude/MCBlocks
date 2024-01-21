package com.jdev.mcblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CustomBlockBase extends Block {
    public CustomBlockBase(Material material, float hardness, float resistance, SoundType soundType, int harvestLevel, ToolType harvestTool){
        super(Properties.create(material)
                .hardnessAndResistance(hardness, resistance)
                .sound(soundType)
                .harvestLevel(harvestLevel)
                .harvestTool(harvestTool));
    }
}
