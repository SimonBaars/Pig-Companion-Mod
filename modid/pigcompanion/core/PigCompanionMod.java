package modid.pigcompanion.core;

import modid.pigcompanion.items.ItemCarrotOnAStick2;
import modid.pigcompanion.items.ItemSaddle2;
import modid.pigcompanion.pigs.EntityPig2;
import modid.pigcompanion.pigs.EntityPigDiamond;
import modid.pigcompanion.pigs.EntityPigFriendlyDiamond;
import modid.pigcompanion.pigs.EntityPigFriendlyGold;
import modid.pigcompanion.pigs.EntityPigFriendlyIron;
import modid.pigcompanion.pigs.EntityPigFriendlyLeather;
import modid.pigcompanion.pigs.EntityPigGold;
import modid.pigcompanion.pigs.EntityPigIron;
import modid.pigcompanion.pigs.EntityPigLeather;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
//import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod (modid = "PigCompanionMod",name = "PigCompanionMod", version = "1.6.4")
//@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class PigCompanionMod {
	
	public static String modid = "morewolvesmod";
	
	@SidedProxy(clientSide ="modid.pigcompanion.core.PigCompanionModClient", serverSide ="modid.pigcompanion.core.PigCompanionModProxy")
	  public static PigCompanionModProxy proxy;
	
	public static Item potatoOnAStick = (new ItemCarrotOnAStick2(1235)).setUnlocalizedName("potatoOnAStick").setTextureName("potato_on_a_stick");
	public static Item saddle2 = (new ItemSaddle2(1234)).setUnlocalizedName("saddle2").setTextureName("saddle2");

	@EventHandler
	public void load(FMLInitializationEvent event)
	{ 
		proxy.registerRenderInformation();
		
		EntityRegistry.registerGlobalEntityID(EntityPigLeather.class, "Leather Armored Pig", EntityRegistry.findGlobalUniqueEntityId(), 0xf0a5a2, 0x61380B);
	 	EntityRegistry.addSpawn(EntityPigLeather.class, 0/**hoeveelheid/rate*/, 0/**minimale hoeveelheid*/, 0/**maximale hoeveelheid*/, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.hell, BiomeGenBase.jungle, BiomeGenBase.taiga, BiomeGenBase.swampland, BiomeGenBase.plains, BiomeGenBase.beach });
	 	LanguageRegistry.instance().addStringLocalization("entity.EntityPigLeather.name", "Leather Armored Pig");
	 	
	 	EntityRegistry.registerGlobalEntityID(EntityPigIron.class, "Iron Armored Pig", EntityRegistry.findGlobalUniqueEntityId(), 0xf0a5a2, 0xBDBDBD);
	 	EntityRegistry.addSpawn(EntityPigIron.class, 0/**hoeveelheid/rate*/, 0/**minimale hoeveelheid*/, 0/**maximale hoeveelheid*/, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.hell, BiomeGenBase.jungle, BiomeGenBase.taiga, BiomeGenBase.swampland, BiomeGenBase.plains, BiomeGenBase.beach });
	 	LanguageRegistry.instance().addStringLocalization("entity.EntityPigIron.name", "Iron Armored Pig");
	 	
	 	EntityRegistry.registerGlobalEntityID(EntityPigGold.class, "Gold Armored Pig", EntityRegistry.findGlobalUniqueEntityId(), 0xf0a5a2, 0xFFFF00);
	 	EntityRegistry.addSpawn(EntityPigGold.class, 0/**hoeveelheid/rate*/, 0/**minimale hoeveelheid*/, 0/**maximale hoeveelheid*/, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.hell, BiomeGenBase.jungle, BiomeGenBase.taiga, BiomeGenBase.swampland, BiomeGenBase.plains, BiomeGenBase.beach });
	 	LanguageRegistry.instance().addStringLocalization("entity.EntityPigGold.name", "Gold Armored Pig");
	 	
	 	EntityRegistry.registerGlobalEntityID(EntityPigDiamond.class, "Diamond Armored Pig", EntityRegistry.findGlobalUniqueEntityId(), 0xf0a5a2, 0x00FFFF);
	 	EntityRegistry.addSpawn(EntityPigDiamond.class, 0/**hoeveelheid/rate*/, 0/**minimale hoeveelheid*/, 0/**maximale hoeveelheid*/, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.hell, BiomeGenBase.jungle, BiomeGenBase.taiga, BiomeGenBase.swampland, BiomeGenBase.plains, BiomeGenBase.beach });
	 	LanguageRegistry.instance().addStringLocalization("entity.EntityPigDiamond.name", "Diamond Armored Pig");
	 	
	 	//*******************************************************************************
	 	
	 	EntityRegistry.registerGlobalEntityID(EntityPigFriendlyLeather.class, "Leather Pig Companion", EntityRegistry.findGlobalUniqueEntityId(), 0xf0a5a2, 0x61380B);
	 	EntityRegistry.addSpawn(EntityPigFriendlyLeather.class, 0/**hoeveelheid/rate*/, 0/**minimale hoeveelheid*/, 0/**maximale hoeveelheid*/, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.hell, BiomeGenBase.jungle, BiomeGenBase.taiga, BiomeGenBase.swampland, BiomeGenBase.plains, BiomeGenBase.beach });
	 	LanguageRegistry.instance().addStringLocalization("entity.EntityPigFriendlyLeather.name", "Leather Pig Companion");
	 	
	 	EntityRegistry.registerGlobalEntityID(EntityPigFriendlyIron.class, "Iron Pig Companion", EntityRegistry.findGlobalUniqueEntityId(), 0xf0a5a2, 0xBDBDBD);
	 	EntityRegistry.addSpawn(EntityPigFriendlyIron.class, 0/**hoeveelheid/rate*/, 0/**minimale hoeveelheid*/, 0/**maximale hoeveelheid*/, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.hell, BiomeGenBase.jungle, BiomeGenBase.taiga, BiomeGenBase.swampland, BiomeGenBase.plains, BiomeGenBase.beach });
	 	LanguageRegistry.instance().addStringLocalization("entity.EntityPigFriendlyIron.name", "Iron Pig Companion");
	 	
	 	EntityRegistry.registerGlobalEntityID(EntityPigFriendlyGold.class, "Gold Pig Companion", EntityRegistry.findGlobalUniqueEntityId(), 0xf0a5a2, 0xFFFF00);
	 	EntityRegistry.addSpawn(EntityPigFriendlyGold.class, 0/**hoeveelheid/rate*/, 0/**minimale hoeveelheid*/, 0/**maximale hoeveelheid*/, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.hell, BiomeGenBase.jungle, BiomeGenBase.taiga, BiomeGenBase.swampland, BiomeGenBase.plains, BiomeGenBase.beach });
	 	LanguageRegistry.instance().addStringLocalization("entity.EntityPigFriendlyGold.name", "Gold Pig Companion");
	 	
	 	EntityRegistry.registerGlobalEntityID(EntityPigFriendlyDiamond.class, "Diamond Pig Companion", EntityRegistry.findGlobalUniqueEntityId(), 0xf0a5a2, 0x00FFFF);
	 	EntityRegistry.addSpawn(EntityPigFriendlyDiamond.class, 0/**hoeveelheid/rate*/, 0/**minimale hoeveelheid*/, 0/**maximale hoeveelheid*/, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.hell, BiomeGenBase.jungle, BiomeGenBase.taiga, BiomeGenBase.swampland, BiomeGenBase.plains, BiomeGenBase.beach });
	 	LanguageRegistry.instance().addStringLocalization("entity.EntityPigFriendlyDiamond.name", "Diamond Pig Companion");
	 	
	 	//*******************************************************************************
	 	
	 	EntityRegistry.registerGlobalEntityID(EntityPig2.class, "SuperPig", EntityRegistry.findGlobalUniqueEntityId(), 15771042, 14377823);
	 	EntityRegistry.addSpawn(EntityPig2.class, 50/**hoeveelheid/rate*/, 2/**minimale hoeveelheid*/, 6/**maximale hoeveelheid*/, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.hell, BiomeGenBase.jungle, BiomeGenBase.taiga, BiomeGenBase.swampland, BiomeGenBase.plains, BiomeGenBase.beach });
	 	LanguageRegistry.instance().addStringLocalization("entity.SuperPig.name", "SuperPig");
	 	
	 	LanguageRegistry.addName(PigCompanionMod.potatoOnAStick, "Potato on a Stick");
	 	LanguageRegistry.addName(PigCompanionMod.saddle2, "Upgraded Saddle");
	 	
	 	GameRegistry.addRecipe(new ItemStack(potatoOnAStick, 1),
	 			"O ",
	 			" T",
	 			'T', Items.potato, 'O',Items.fishing_rod);
	 	
	 	GameRegistry.addShapelessRecipe(new ItemStack(saddle2, 1), new ItemStack(Items.saddle));
		}

}
