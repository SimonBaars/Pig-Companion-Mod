package modid.pigcompanion.core;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
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

@Mod(
   modid = "PigCompanionMod",
   name = "PigCompanionMod",
   version = "1.6.4"
)
@NetworkMod(
   clientSideRequired = true,
   serverSideRequired = false
)
public class PigCompanionMod {
   public static String modid = "morewolvesmod";
   @SidedProxy(
      clientSide = "modid.pigcompanion.core.PigCompanionModClient",
      serverSide = "modid.pigcompanion.core.PigCompanionModProxy"
   )
   public static PigCompanionModProxy proxy;
   public static yc potatoOnAStick = (new ItemCarrotOnAStick2(1235)).b("potatoOnAStick").d("potato_on_a_stick");
   public static yc saddle2 = (new ItemSaddle2(1234)).b("saddle2").d("saddle2");

   @EventHandler
   public void load(FMLInitializationEvent event) {
      proxy.registerRenderInformation();
      EntityRegistry.registerGlobalEntityID(EntityPigLeather.class, "Leather Armored Pig", EntityRegistry.findGlobalUniqueEntityId(), 15771042, 6371339);
      EntityRegistry.addSpawn(EntityPigLeather.class, 0, 0, 0, oh.b, new acq[]{acq.d, acq.e, acq.f, acq.j, acq.w, acq.g, acq.h, acq.c, acq.r});
      LanguageRegistry.instance().addStringLocalization("entity.EntityPigLeather.name", "Leather Armored Pig");
      EntityRegistry.registerGlobalEntityID(EntityPigIron.class, "Iron Armored Pig", EntityRegistry.findGlobalUniqueEntityId(), 15771042, 12434877);
      EntityRegistry.addSpawn(EntityPigIron.class, 0, 0, 0, oh.b, new acq[]{acq.d, acq.e, acq.f, acq.j, acq.w, acq.g, acq.h, acq.c, acq.r});
      LanguageRegistry.instance().addStringLocalization("entity.EntityPigIron.name", "Iron Armored Pig");
      EntityRegistry.registerGlobalEntityID(EntityPigGold.class, "Gold Armored Pig", EntityRegistry.findGlobalUniqueEntityId(), 15771042, 16776960);
      EntityRegistry.addSpawn(EntityPigGold.class, 0, 0, 0, oh.b, new acq[]{acq.d, acq.e, acq.f, acq.j, acq.w, acq.g, acq.h, acq.c, acq.r});
      LanguageRegistry.instance().addStringLocalization("entity.EntityPigGold.name", "Gold Armored Pig");
      EntityRegistry.registerGlobalEntityID(EntityPigDiamond.class, "Diamond Armored Pig", EntityRegistry.findGlobalUniqueEntityId(), 15771042, 65535);
      EntityRegistry.addSpawn(EntityPigDiamond.class, 0, 0, 0, oh.b, new acq[]{acq.d, acq.e, acq.f, acq.j, acq.w, acq.g, acq.h, acq.c, acq.r});
      LanguageRegistry.instance().addStringLocalization("entity.EntityPigDiamond.name", "Diamond Armored Pig");
      EntityRegistry.registerGlobalEntityID(EntityPigFriendlyLeather.class, "Leather Pig Companion", EntityRegistry.findGlobalUniqueEntityId(), 15771042, 6371339);
      EntityRegistry.addSpawn(EntityPigFriendlyLeather.class, 0, 0, 0, oh.b, new acq[]{acq.d, acq.e, acq.f, acq.j, acq.w, acq.g, acq.h, acq.c, acq.r});
      LanguageRegistry.instance().addStringLocalization("entity.EntityPigFriendlyLeather.name", "Leather Pig Companion");
      EntityRegistry.registerGlobalEntityID(EntityPigFriendlyIron.class, "Iron Pig Companion", EntityRegistry.findGlobalUniqueEntityId(), 15771042, 12434877);
      EntityRegistry.addSpawn(EntityPigFriendlyIron.class, 0, 0, 0, oh.b, new acq[]{acq.d, acq.e, acq.f, acq.j, acq.w, acq.g, acq.h, acq.c, acq.r});
      LanguageRegistry.instance().addStringLocalization("entity.EntityPigFriendlyIron.name", "Iron Pig Companion");
      EntityRegistry.registerGlobalEntityID(EntityPigFriendlyGold.class, "Gold Pig Companion", EntityRegistry.findGlobalUniqueEntityId(), 15771042, 16776960);
      EntityRegistry.addSpawn(EntityPigFriendlyGold.class, 0, 0, 0, oh.b, new acq[]{acq.d, acq.e, acq.f, acq.j, acq.w, acq.g, acq.h, acq.c, acq.r});
      LanguageRegistry.instance().addStringLocalization("entity.EntityPigFriendlyGold.name", "Gold Pig Companion");
      EntityRegistry.registerGlobalEntityID(EntityPigFriendlyDiamond.class, "Diamond Pig Companion", EntityRegistry.findGlobalUniqueEntityId(), 15771042, 65535);
      EntityRegistry.addSpawn(EntityPigFriendlyDiamond.class, 0, 0, 0, oh.b, new acq[]{acq.d, acq.e, acq.f, acq.j, acq.w, acq.g, acq.h, acq.c, acq.r});
      LanguageRegistry.instance().addStringLocalization("entity.EntityPigFriendlyDiamond.name", "Diamond Pig Companion");
      EntityRegistry.registerGlobalEntityID(EntityPig2.class, "SuperPig", EntityRegistry.findGlobalUniqueEntityId(), 15771042, 14377823);
      EntityRegistry.addSpawn(EntityPig2.class, 50, 2, 6, oh.b, new acq[]{acq.e, acq.f, acq.j, acq.w, acq.g, acq.h, acq.c, acq.r});
      LanguageRegistry.instance().addStringLocalization("entity.SuperPig.name", "SuperPig");
      LanguageRegistry.addName(potatoOnAStick, "Potato on a Stick");
      LanguageRegistry.addName(saddle2, "Upgraded Saddle");
      GameRegistry.addRecipe(new ye(potatoOnAStick, 1), new Object[]{"O ", " T", 'T', yc.bN, 'O', yc.aT});
      GameRegistry.addShapelessRecipe(new ye(saddle2, 1), new Object[]{new ye(yc.aC)});
   }
}
