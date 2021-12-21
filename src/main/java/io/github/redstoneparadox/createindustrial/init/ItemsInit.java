package io.github.redstoneparadox.createindustrial.init;

import io.github.redstoneparadox.createindustrial.CreateIndustrial;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemsInit {
	private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreateIndustrial.ID);

	public static RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(properties()));
	public static RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", () -> new Item(properties()));
	public static RegistryObject<Item> STEEL_BLOCK = ITEMS.register("steel_block", () -> new BlockItem(BlocksInit.STEEL_BLOCK.get(), properties()));
	public static RegistryObject<Item> STEEL_SHEET = ITEMS.register("steel_sheet", () -> new Item(properties()));
	public static RegistryObject<Item> RAW_STEEL = ITEMS.register("raw_steel", () -> new Item(properties()));

	public static RegistryObject<Item> COAL_COKE = ITEMS.register("coal_coke", () -> new Item(properties()));
	public static RegistryObject<Item> QUICKLIME = ITEMS.register("quicklime", () -> new Item(properties()));

	public static void register() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}

	private static Item.Properties properties() {
		return new Item.Properties().tab(CreateIndustrial.CREATIVE_TAB);
	}
}
