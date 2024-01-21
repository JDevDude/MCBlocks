package com.jdev.mcblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class StoneBlockBase extends Block {
    public StoneBlockBase(float hardness, float resistance) {
        super(Properties.create(Material.IRON)
            .hardnessAndResistance(hardness, resistance)
            .sound(SoundType.STONE)
            .harvestLevel(0)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool());

    }
}
