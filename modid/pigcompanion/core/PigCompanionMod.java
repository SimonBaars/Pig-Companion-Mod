package modid.pigcompanion.core;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
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
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;

@Mod(
   modid = "PigCompanionMod",
   name = "PigCompanionMod",
   version = "1.6.4"
)
public class PigCompanionMod {
   public static String modid = "morewolvesmod";
   @SidedProxy(
      clientSide = "modid.pigcompanion.core.PigCompanionModClient",
      serverSide = "modid.pigcompanion.core.PigCompanionModProxy"
   )
   public static PigCompanionModProxy proxy;
   public static Item potatoOnAStick;
   public static Item saddle2;

   @EventHandler
   public void preInit(FMLPreInitializationEvent e) {
      saddle2 = (new ItemSaddle2()).func_77655_b("saddle2").func_77637_a(CreativeTabs.field_78029_e).func_111206_d("saddle2");
      GameRegistry.registerItem(saddle2, "saddle2");
   }

   @EventHandler
   public void load(FMLInitializationEvent event) {
      proxy.registerRenderInformation();
      EntityRegistry.registerGlobalEntityID(EntityPigLeather.class, "Leather Armored Pig", EntityRegistry.findGlobalUniqueEntityId(), 15771042, 6371339);
      EntityRegistry.addSpawn(EntityPigLeather.class, 0, 0, 0, EnumCreatureType.creature, new BiomeGenBase[]{BiomeGenBase.field_76769_d, BiomeGenBase.field_76770_e, BiomeGenBase.field_76767_f, BiomeGenBase.field_76778_j, BiomeGenBase.field_76782_w, BiomeGenBase.field_76768_g, BiomeGenBase.field_76780_h, BiomeGenBase.field_76772_c, BiomeGenBase.field_76787_r});
      LanguageRegistry.instance().addStringLocalization("entity.EntityPigLeather.name", "Leather Armored Pig");
      EntityRegistry.registerGlobalEntityID(EntityPigIron.class, "Iron Armored Pig", EntityRegistry.findGlobalUniqueEntityId(), 15771042, 12434877);
      EntityRegistry.addSpawn(EntityPigIron.class, 0, 0, 0, EnumCreatureType.creature, new BiomeGenBase[]{BiomeGenBase.field_76769_d, BiomeGenBase.field_76770_e, BiomeGenBase.field_76767_f, BiomeGenBase.field_76778_j, BiomeGenBase.field_76782_w, BiomeGenBase.field_76768_g, BiomeGenBase.field_76780_h, BiomeGenBase.field_76772_c, BiomeGenBase.field_76787_r});
      LanguageRegistry.instance().addStringLocalization("entity.EntityPigIron.name", "Iron Armored Pig");
      EntityRegistry.registerGlobalEntityID(EntityPigGold.class, "Gold Armored Pig", EntityRegistry.findGlobalUniqueEntityId(), 15771042, 16776960);
      EntityRegistry.addSpawn(EntityPigGold.class, 0, 0, 0, EnumCreatureType.creature, new BiomeGenBase[]{BiomeGenBase.field_76769_d, BiomeGenBase.field_76770_e, BiomeGenBase.field_76767_f, BiomeGenBase.field_76778_j, BiomeGenBase.field_76782_w, BiomeGenBase.field_76768_g, BiomeGenBase.field_76780_h, BiomeGenBase.field_76772_c, BiomeGenBase.field_76787_r});
      LanguageRegistry.instance().addStringLocalization("entity.EntityPigGold.name", "Gold Armored Pig");
      EntityRegistry.registerGlobalEntityID(EntityPigDiamond.class, "Diamond Armored Pig", EntityRegistry.findGlobalUniqueEntityId(), 15771042, 65535);
      EntityRegistry.addSpawn(EntityPigDiamond.class, 0, 0, 0, EnumCreatureType.creature, new BiomeGenBase[]{BiomeGenBase.field_76769_d, BiomeGenBase.field_76770_e, BiomeGenBase.field_76767_f, BiomeGenBase.field_76778_j, BiomeGenBase.field_76782_w, BiomeGenBase.field_76768_g, BiomeGenBase.field_76780_h, BiomeGenBase.field_76772_c, BiomeGenBase.field_76787_r});
      LanguageRegistry.instance().addStringLocalization("entity.EntityPigDiamond.name", "Diamond Armored Pig");
      EntityRegistry.registerGlobalEntityID(EntityPigFriendlyLeather.class, "Leather Pig Companion", EntityRegistry.findGlobalUniqueEntityId(), 15771042, 6371339);
      EntityRegistry.addSpawn(EntityPigFriendlyLeather.class, 0, 0, 0, EnumCreatureType.creature, new BiomeGenBase[]{BiomeGenBase.field_76769_d, BiomeGenBase.field_76770_e, BiomeGenBase.field_76767_f, BiomeGenBase.field_76778_j, BiomeGenBase.field_76782_w, BiomeGenBase.field_76768_g, BiomeGenBase.field_76780_h, BiomeGenBase.field_76772_c, BiomeGenBase.field_76787_r});
      LanguageRegistry.instance().addStringLocalization("entity.EntityPigFriendlyLeather.name", "Leather Pig Companion");
      EntityRegistry.registerGlobalEntityID(EntityPigFriendlyIron.class, "Iron Pig Companion", EntityRegistry.findGlobalUniqueEntityId(), 15771042, 12434877);
      EntityRegistry.addSpawn(EntityPigFriendlyIron.class, 0, 0, 0, EnumCreatureType.creature, new BiomeGenBase[]{BiomeGenBase.field_76769_d, BiomeGenBase.field_76770_e, BiomeGenBase.field_76767_f, BiomeGenBase.field_76778_j, BiomeGenBase.field_76782_w, BiomeGenBase.field_76768_g, BiomeGenBase.field_76780_h, BiomeGenBase.field_76772_c, BiomeGenBase.field_76787_r});
      LanguageRegistry.instance().addStringLocalization("entity.EntityPigFriendlyIron.name", "Iron Pig Companion");
      EntityRegistry.registerGlobalEntityID(EntityPigFriendlyGold.class, "Gold Pig Companion", EntityRegistry.findGlobalUniqueEntityId(), 15771042, 16776960);
      EntityRegistry.addSpawn(EntityPigFriendlyGold.class, 0, 0, 0, EnumCreatureType.creature, new BiomeGenBase[]{BiomeGenBase.field_76769_d, BiomeGenBase.field_76770_e, BiomeGenBase.field_76767_f, BiomeGenBase.field_76778_j, BiomeGenBase.field_76782_w, BiomeGenBase.field_76768_g, BiomeGenBase.field_76780_h, BiomeGenBase.field_76772_c, BiomeGenBase.field_76787_r});
      LanguageRegistry.instance().addStringLocalization("entity.EntityPigFriendlyGold.name", "Gold Pig Companion");
      EntityRegistry.registerGlobalEntityID(EntityPigFriendlyDiamond.class, "Diamond Pig Companion", EntityRegistry.findGlobalUniqueEntityId(), 15771042, 65535);
      EntityRegistry.addSpawn(EntityPigFriendlyDiamond.class, 0, 0, 0, EnumCreatureType.creature, new BiomeGenBase[]{BiomeGenBase.field_76769_d, BiomeGenBase.field_76770_e, BiomeGenBase.field_76767_f, BiomeGenBase.field_76778_j, BiomeGenBase.field_76782_w, BiomeGenBase.field_76768_g, BiomeGenBase.field_76780_h, BiomeGenBase.field_76772_c, BiomeGenBase.field_76787_r});
      LanguageRegistry.instance().addStringLocalization("entity.EntityPigFriendlyDiamond.name", "Diamond Pig Companion");
      EntityRegistry.registerGlobalEntityID(EntityPig2.class, "SuperPig", EntityRegistry.findGlobalUniqueEntityId(), 15771042, 14377823);
      EntityRegistry.addSpawn(EntityPig2.class, 50, 2, 6, EnumCreatureType.creature, new BiomeGenBase[]{BiomeGenBase.field_76770_e, BiomeGenBase.field_76767_f, BiomeGenBase.field_76778_j, BiomeGenBase.field_76782_w, BiomeGenBase.field_76768_g, BiomeGenBase.field_76780_h, BiomeGenBase.field_76772_c, BiomeGenBase.field_76787_r});
      LanguageRegistry.instance().addStringLocalization("entity.SuperPig.name", "SuperPig");
      GameRegistry.addRecipe(new ItemStack(potatoOnAStick, 1), new Object[]{"O ", " T", 'T', Items.field_151174_bG, 'O', Items.field_151112_aM});
      GameRegistry.addShapelessRecipe(new ItemStack(saddle2, 1), new Object[]{new ItemStack(Items.field_151141_av)});
   }
}
