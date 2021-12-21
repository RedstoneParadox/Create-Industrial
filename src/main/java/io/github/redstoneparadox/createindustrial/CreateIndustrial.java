package io.github.redstoneparadox.createindustrial;

import io.github.redstoneparadox.createindustrial.creative.CreateIndustrialTab;
import io.github.redstoneparadox.createindustrial.init.BlocksInit;
import io.github.redstoneparadox.createindustrial.init.ItemsInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("createindustrial")
public class CreateIndustrial {
	private static final Logger LOGGER = LogManager.getLogger();
	public static final String ID = "createindustrial";
	public static final CreativeModeTab CREATIVE_TAB = new CreateIndustrialTab("tab");

	public CreateIndustrial() {
		BlocksInit.register();
		ItemsInit.register();
	}
}
