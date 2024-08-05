package modid.pigcompanion.pigs;

public class ModelPigArmor extends ModelQuadruped2 {
   public ModelPigArmor() {
      this(0.0F);
   }

   public ModelPigArmor(float par1) {
      super(6, par1);
      this.head.a(16, 16).a(-2.0F, 0.0F, -9.0F, 4, 3, 1, par1);
      this.field_40331_g = 4.0F;
   }
}
