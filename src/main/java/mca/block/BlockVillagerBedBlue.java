/*******************************************************************************
 * BlockVillagerBedBlue.java
 * Copyright (c) 2014 WildBamaBoy.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the MCA Minecraft Mod license.
 ******************************************************************************/

package mca.block;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockVillagerBedBlue extends BlockVillagerBed
{
	public BlockVillagerBedBlue()
	{
		super();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		textureTop = new IIcon[] { iconRegister.registerIcon("mca:VillagerBed-Feet-Top-Blue"), iconRegister.registerIcon("mca:VillagerBed-Head-Top-Blue") };
		textureEnd = new IIcon[] { iconRegister.registerIcon("mca:VillagerBed-Feet-End-Blue"), iconRegister.registerIcon("mca:VillagerBed-Head-End") };
		textureSide = new IIcon[] { iconRegister.registerIcon("mca:VillagerBed-Feet-Side-Blue"), iconRegister.registerIcon("mca:VillagerBed-Head-Side-Blue") };
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
	{
		return Items.bed;
	}
}
