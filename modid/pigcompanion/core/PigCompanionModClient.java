package modid.pigcompanion.core;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import modid.pigcompanion.pigs.EntityPig2;
import modid.pigcompanion.pigs.EntityPigDiamond;
import modid.pigcompanion.pigs.EntityPigFriendlyDiamond;
import modid.pigcompanion.pigs.EntityPigFriendlyGold;
import modid.pigcompanion.pigs.EntityPigFriendlyIron;
import modid.pigcompanion.pigs.EntityPigFriendlyLeather;
import modid.pigcompanion.pigs.EntityPigGold;
import modid.pigcompanion.pigs.EntityPigIron;
import modid.pigcompanion.pigs.EntityPigLeather;
import modid.pigcompanion.pigs.ModelPigArmor;
import modid.pigcompanion.pigs.ModelPigFriendly;
import modid.pigcompanion.pigs.RenderPig2;
import modid.pigcompanion.pigs.RenderPigDiamond;
import modid.pigcompanion.pigs.RenderPigFriendlyDiamond;
import modid.pigcompanion.pigs.RenderPigFriendlyGold;
import modid.pigcompanion.pigs.RenderPigFriendlyIron;
import modid.pigcompanion.pigs.RenderPigFriendlyLeather;
import modid.pigcompanion.pigs.RenderPigGold;
import modid.pigcompanion.pigs.RenderPigIron;
import modid.pigcompanion.pigs.RenderPigLeather;

public class PigCompanionModClient extends PigCompanionModProxy {
   @SideOnly(Side.CLIENT)
   public void registerRenderInformation() {
      RenderingRegistry.instance();
      RenderingRegistry.registerEntityRenderingHandler(EntityPigLeather.class, new RenderPigLeather(new ModelPigArmor(), new ModelPigArmor(0.5F), 0.7F));
      RenderingRegistry.instance();
      RenderingRegistry.registerEntityRenderingHandler(EntityPigIron.class, new RenderPigIron(new ModelPigArmor(), new ModelPigArmor(0.5F), 0.7F));
      RenderingRegistry.instance();
      RenderingRegistry.registerEntityRenderingHandler(EntityPigGold.class, new RenderPigGold(new ModelPigArmor(), new ModelPigArmor(0.5F), 0.7F));
      RenderingRegistry.instance();
      RenderingRegistry.registerEntityRenderingHandler(EntityPigDiamond.class, new RenderPigDiamond(new ModelPigArmor(), new ModelPigArmor(0.5F), 0.7F));
      RenderingRegistry.instance();
      RenderingRegistry.registerEntityRenderingHandler(EntityPigFriendlyLeather.class, new RenderPigFriendlyLeather(new ModelPigFriendly(), new ModelPigFriendly(0.5F), 0.7F));
      RenderingRegistry.instance();
      RenderingRegistry.registerEntityRenderingHandler(EntityPigFriendlyIron.class, new RenderPigFriendlyIron(new ModelPigFriendly(), new ModelPigFriendly(0.5F), 0.7F));
      RenderingRegistry.instance();
      RenderingRegistry.registerEntityRenderingHandler(EntityPigFriendlyGold.class, new RenderPigFriendlyGold(new ModelPigFriendly(), new ModelPigFriendly(0.5F), 0.7F));
      RenderingRegistry.instance();
      RenderingRegistry.registerEntityRenderingHandler(EntityPigFriendlyDiamond.class, new RenderPigFriendlyDiamond(new ModelPigFriendly(), new ModelPigFriendly(0.5F), 0.7F));
      RenderingRegistry.instance();
      RenderingRegistry.registerEntityRenderingHandler(EntityPig2.class, new RenderPig2(new bbr(), new bbr(0.5F), 0.7F));
   }
}
