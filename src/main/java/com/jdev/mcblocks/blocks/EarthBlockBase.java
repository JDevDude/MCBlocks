package com.jdev.mcblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class EarthBlockBase extends Block {
    public EarthBlockBase(float hardness, float resistance) {
        super(Properties.create(Material.EARTH)
            .hardnessAndResistance(hardness, resistance)
            .sound(SoundType.GROUND)
            .harvestLevel(0)
            .harvestTool(ToolType.SHOVEL));
    }
}
