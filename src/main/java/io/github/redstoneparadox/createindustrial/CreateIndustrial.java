package io.github.redstoneparadox.createindustrial;

import io.github.redstoneparadox.createindustrial.init.ItemsInit;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("createindustrial")
public class CreateIndustrial {
	private static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "createindustrial";

	public CreateIndustrial() {
		ItemsInit.register();
	}
}
