package io.github.redstoneparadox.createindustrial.creative;

import io.github.redstoneparadox.createindustrial.CreateIndustrial;
import io.github.redstoneparadox.createindustrial.init.BlocksInit;
import io.github.redstoneparadox.createindustrial.init.ItemsInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class CreateIndustrialTab extends CreativeModeTab {

	public CreateIndustrialTab(String id) {
		super(getGroupCountSafe(), CreateIndustrial.ID + "." + id);
	}

	@Override
	public @NotNull ItemStack makeIcon() {
		return new ItemStack(ItemsInit.STEEL_BLOCK.get(), 1);
	}
}
