package modid.pigcompanion.pigs;

public class RenderPigFriendlyGold extends bhe {
   private static final bjo field_110888_a = new bjo("textures/entity/pig/pig_saddle.png");
   private static final bjo field_110887_f = new bjo("textures/pigs/pigfriendlygold.png");

   public RenderPigFriendlyGold(bbo par1ModelBase, bbo par2ModelBase, float par3) {
      super(par1ModelBase, par3);
      this.a(par2ModelBase);
   }

   protected int renderSaddledPig(EntityPigFriendlyGold par1EntityPig, int par2, float par3) {
      if (par2 == 0 && par1EntityPig.getSaddled()) {
         this.a(field_110888_a);
         return 1;
      } else {
         return -1;
      }
   }

   protected bjo func_110886_a(EntityPigFriendlyGold par1EntityPig) {
      return field_110887_f;
   }

   public void func_40286_a(EntityPigFriendlyGold par1EntityPig, double par2, double par4, double par6, float par8, float par9) {
      super.a(par1EntityPig, par2, par4, par6, par8, par9);
   }

   protected int shouldRenderPass(og par1EntityLiving, int par2, float par3) {
      return this.renderSaddledPig((EntityPigFriendlyGold)par1EntityLiving, par2, par3);
   }

   public void a(og par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
      this.func_40286_a((EntityPigFriendlyGold)par1EntityLiving, par2, par4, par6, par8, par9);
   }

   public void a(nn par1Entity, double par2, double par4, double par6, float par8, float par9) {
      this.func_40286_a((EntityPigFriendlyGold)par1Entity, par2, par4, par6, par8, par9);
   }

   protected bjo a(nn par1Entity) {
      return this.func_110886_a((EntityPigFriendlyGold)par1Entity);
   }
}
