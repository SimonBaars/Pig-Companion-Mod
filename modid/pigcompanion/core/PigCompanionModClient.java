package modid.pigcompanion.core;

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
import net.minecraft.client.model.ModelPig;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PigCompanionModClient extends PigCompanionModProxy {
	
	@SideOnly(Side.CLIENT)
	 public void registerRenderInformation()
	        {
		 		RenderingRegistry.instance().registerEntityRenderingHandler(EntityPigLeather.class, new RenderPigLeather(new ModelPigArmor(), new ModelPigArmor(0.5F), 0.7F));
				RenderingRegistry.instance().registerEntityRenderingHandler(EntityPigIron.class, new RenderPigIron(new ModelPigArmor(), new ModelPigArmor(0.5F), 0.7F));
				RenderingRegistry.instance().registerEntityRenderingHandler(EntityPigGold.class, new RenderPigGold(new ModelPigArmor(), new ModelPigArmor(0.5F), 0.7F));
				RenderingRegistry.instance().registerEntityRenderingHandler(EntityPigDiamond.class, new RenderPigDiamond(new ModelPigArmor(), new ModelPigArmor(0.5F), 0.7F));
				RenderingRegistry.instance().registerEntityRenderingHandler(EntityPigFriendlyLeather.class, new RenderPigFriendlyLeather(new ModelPigFriendly(), new ModelPigFriendly(0.5F), 0.7F));
				RenderingRegistry.instance().registerEntityRenderingHandler(EntityPigFriendlyIron.class, new RenderPigFriendlyIron(new ModelPigFriendly(), new ModelPigFriendly(0.5F), 0.7F));
				RenderingRegistry.instance().registerEntityRenderingHandler(EntityPigFriendlyGold.class, new RenderPigFriendlyGold(new ModelPigFriendly(), new ModelPigFriendly(0.5F), 0.7F));
				RenderingRegistry.instance().registerEntityRenderingHandler(EntityPigFriendlyDiamond.class, new RenderPigFriendlyDiamond(new ModelPigFriendly(), new ModelPigFriendly(0.5F), 0.7F));
				RenderingRegistry.instance().registerEntityRenderingHandler(EntityPig2.class, new RenderPig2(new ModelPig(), new ModelPig(0.5F), 0.7F));
	        }


}
