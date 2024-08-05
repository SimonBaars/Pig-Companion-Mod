package modid.pigcompanion.pigs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderPigFriendlyLeather extends RenderLiving {
   private static final ResourceLocation field_110888_a = new ResourceLocation("textures/entity/pig/pig_saddle.png");
   private static final ResourceLocation field_110887_f = new ResourceLocation("textures/pigs/pigfriendlyleather.png");

   public RenderPigFriendlyLeather(ModelBase par1ModelBase, ModelBase par2ModelBase, float par3) {
      super(par1ModelBase, par3);
      this.func_77042_a(par2ModelBase);
   }

   protected int renderSaddledPig(EntityPigFriendlyLeather par1EntityPig, int par2, float par3) {
      if (par2 == 0 && par1EntityPig.getSaddled()) {
         this.func_110776_a(field_110888_a);
         return 1;
      } else {
         return -1;
      }
   }

   protected ResourceLocation func_110886_a(EntityPigFriendlyLeather par1EntityPig) {
      return field_110887_f;
   }

   public void func_40286_a(EntityPigFriendlyLeather par1EntityPig, double par2, double par4, double par6, float par8, float par9) {
      super.func_76986_a(par1EntityPig, par2, par4, par6, par8, par9);
   }

   protected int shouldRenderPass(EntityLiving par1EntityLiving, int par2, float par3) {
      return this.renderSaddledPig((EntityPigFriendlyLeather)par1EntityLiving, par2, par3);
   }

   public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
      this.func_40286_a((EntityPigFriendlyLeather)par1EntityLiving, par2, par4, par6, par8, par9);
   }

   public void func_76986_a(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
      this.func_40286_a((EntityPigFriendlyLeather)par1Entity, par2, par4, par6, par8, par9);
   }

   protected ResourceLocation func_110775_a(Entity par1Entity) {
      return this.func_110886_a((EntityPigFriendlyLeather)par1Entity);
   }
}
