package modid.pigcompanion.pigs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelQuadruped2 extends ModelBase {
   public ModelRenderer head;
   public ModelRenderer body;
   public ModelRenderer leg1;
   public ModelRenderer leg2;
   public ModelRenderer leg3;
   public ModelRenderer leg4;
   ModelRenderer Shape1;
   ModelRenderer Shape2;
   ModelRenderer Shape3;
   ModelRenderer Shape4;
   ModelRenderer Shape5;
   ModelRenderer Shape7;
   ModelRenderer Shape8;
   ModelRenderer Shape9;
   ModelRenderer Shape10;
   ModelRenderer Shape11;
   ModelRenderer Shape12;
   protected float field_40331_g;
   protected float field_40332_n;

   public ModelQuadruped2(int par1, float par2) {
      this.field_78090_t = 64;
      this.field_78089_u = 64;
      this.field_40331_g = 8.0F;
      this.field_40332_n = 4.0F;
      this.head = new ModelRenderer(this, 0, 0);
      this.head.func_78790_a(-4.0F, -4.0F, -8.0F, 8, 8, 8, par2);
      this.head.func_78793_a(0.0F, (float)(18 - par1), -6.0F);
      this.body = new ModelRenderer(this, 28, 8);
      this.body.func_78790_a(-5.0F, -10.0F, -7.0F, 10, 16, 8, par2);
      this.body.func_78793_a(0.0F, (float)(17 - par1), 2.0F);
      this.leg1 = new ModelRenderer(this, 0, 16);
      this.leg1.func_78790_a(-2.0F, 0.0F, -2.0F, 4, par1, 4, par2);
      this.leg1.func_78793_a(-3.0F, (float)(24 - par1), 7.0F);
      this.leg2 = new ModelRenderer(this, 0, 16);
      this.leg2.func_78790_a(-2.0F, 0.0F, -2.0F, 4, par1, 4, par2);
      this.leg2.func_78793_a(3.0F, (float)(24 - par1), 7.0F);
      this.leg3 = new ModelRenderer(this, 0, 16);
      this.leg3.func_78790_a(-2.0F, 0.0F, -2.0F, 4, par1, 4, par2);
      this.leg3.func_78793_a(-3.0F, (float)(24 - par1), -5.0F);
      this.leg4 = new ModelRenderer(this, 0, 16);
      this.leg4.func_78790_a(-2.0F, 0.0F, -2.0F, 4, par1, 4, par2);
      this.leg4.func_78793_a(3.0F, (float)(24 - par1), -5.0F);
      this.Shape1 = new ModelRenderer(this, 0, 32);
      this.Shape1.func_78789_a(0.0F, 0.0F, 0.0F, 10, 3, 1);
      this.Shape1.func_78793_a(-5.0F, 7.0F, -15.0F);
      this.Shape1.func_78787_b(64, 64);
      this.Shape1.field_78809_i = true;
      this.Shape2 = new ModelRenderer(this, 23, 50);
      this.Shape2.func_78789_a(0.0F, 0.0F, 0.0F, 2, 2, 1);
      this.Shape2.func_78793_a(-1.0F, 10.0F, -15.0F);
      this.Shape2.func_78787_b(64, 64);
      this.Shape2.field_78809_i = true;
      this.Shape3 = new ModelRenderer(this, 0, 51);
      this.Shape3.func_78789_a(0.0F, 0.0F, 0.0F, 1, 3, 10);
      this.Shape3.func_78793_a(4.0F, 7.0F, -15.0F);
      this.Shape3.func_78787_b(64, 64);
      this.Shape3.field_78809_i = true;
      this.Shape4 = new ModelRenderer(this, 24, 32);
      this.Shape4.func_78789_a(0.0F, 0.0F, 0.0F, 10, 3, 1);
      this.Shape4.func_78793_a(-5.0F, 7.0F, -6.0F);
      this.Shape4.func_78787_b(64, 64);
      this.Shape4.field_78809_i = true;
      this.Shape5 = new ModelRenderer(this, 0, 37);
      this.Shape5.func_78789_a(0.0F, 0.0F, 0.0F, 1, 3, 10);
      this.Shape5.func_78793_a(-5.0F, 7.0F, -15.0F);
      this.Shape5.func_78787_b(64, 64);
      this.Shape5.field_78809_i = true;
      this.Shape7 = new ModelRenderer(this, 16, 16);
      this.Shape7.func_78789_a(0.0F, 0.0F, 0.0F, 4, 3, 1);
      this.Shape7.func_78793_a(-2.0F, 12.0F, -15.0F);
      this.Shape7.func_78787_b(64, 64);
      this.Shape7.field_78809_i = true;
      this.Shape8 = new ModelRenderer(this, 23, 37);
      this.Shape8.func_78789_a(0.0F, 0.0F, 0.0F, 10, 1, 10);
      this.Shape8.func_78793_a(-5.0F, 7.0F, -15.0F);
      this.Shape8.func_78787_b(64, 64);
      this.Shape8.field_78809_i = true;
      this.Shape9 = new ModelRenderer(this, 23, 54);
      this.Shape9.func_78789_a(0.0F, 0.0F, 0.0F, 1, 1, 5);
      this.Shape9.func_78793_a(-5.0F, 10.0F, -13.0F);
      this.Shape9.func_78787_b(64, 64);
      this.Shape9.field_78809_i = true;
      this.Shape10 = new ModelRenderer(this, 31, 50);
      this.Shape10.func_78789_a(0.0F, 0.0F, 0.0F, 1, 1, 2);
      this.Shape10.func_78793_a(-5.0F, 11.0F, -10.0F);
      this.Shape10.func_78787_b(64, 64);
      this.Shape10.field_78809_i = true;
      this.Shape11 = new ModelRenderer(this, 23, 54);
      this.Shape11.func_78789_a(0.0F, 0.0F, 0.0F, 1, 1, 5);
      this.Shape11.func_78793_a(4.0F, 10.0F, -13.0F);
      this.Shape11.func_78787_b(64, 64);
      this.Shape11.field_78809_i = true;
      this.Shape12 = new ModelRenderer(this, 31, 50);
      this.Shape12.func_78789_a(0.0F, 0.0F, 0.0F, 1, 1, 2);
      this.Shape12.func_78793_a(4.0F, 11.0F, -10.0F);
      this.Shape12.func_78787_b(64, 64);
      this.Shape12.field_78809_i = true;
   }

   public void func_78088_a(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) {
      this.setRotationAngles(par2, par3, par4, par5, par6, par7);
      if (this.field_78091_s) {
         float f = 2.0F;
         GL11.glPushMatrix();
         GL11.glTranslatef(0.0F, this.field_40331_g * par7, this.field_40332_n * par7);
         this.head.func_78785_a(par7);
         GL11.glPopMatrix();
         GL11.glPushMatrix();
         GL11.glScalef(1.0F / f, 1.0F / f, 1.0F / f);
         GL11.glTranslatef(0.0F, 24.0F * par7, 0.0F);
         this.body.func_78785_a(par7);
         this.leg1.func_78785_a(par7);
         this.leg2.func_78785_a(par7);
         this.leg3.func_78785_a(par7);
         this.leg4.func_78785_a(par7);
         this.Shape1.func_78785_a(par7);
         this.Shape2.func_78785_a(par7);
         this.Shape3.func_78785_a(par7);
         this.Shape4.func_78785_a(par7);
         this.Shape5.func_78785_a(par7);
         this.Shape7.func_78785_a(par7);
         this.Shape8.func_78785_a(par7);
         this.Shape9.func_78785_a(par7);
         this.Shape10.func_78785_a(par7);
         this.Shape11.func_78785_a(par7);
         this.Shape12.func_78785_a(par7);
         GL11.glPopMatrix();
      } else {
         this.head.func_78785_a(par7);
         this.body.func_78785_a(par7);
         this.leg1.func_78785_a(par7);
         this.leg2.func_78785_a(par7);
         this.leg3.func_78785_a(par7);
         this.leg4.func_78785_a(par7);
         this.Shape1.func_78785_a(par7);
         this.Shape2.func_78785_a(par7);
         this.Shape3.func_78785_a(par7);
         this.Shape4.func_78785_a(par7);
         this.Shape5.func_78785_a(par7);
         this.Shape7.func_78785_a(par7);
         this.Shape8.func_78785_a(par7);
         this.Shape9.func_78785_a(par7);
         this.Shape10.func_78785_a(par7);
         this.Shape11.func_78785_a(par7);
         this.Shape12.func_78785_a(par7);
      }

   }

   public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6) {
      this.body.field_78795_f = 1.5707964F;
      this.leg1.field_78795_f = MathHelper.func_76134_b(par1 * 0.6662F) * 1.4F * par2;
      this.leg2.field_78795_f = MathHelper.func_76134_b(par1 * 0.6662F + 3.1415927F) * 1.4F * par2;
      this.leg3.field_78795_f = MathHelper.func_76134_b(par1 * 0.6662F + 3.1415927F) * 1.4F * par2;
      this.leg4.field_78795_f = MathHelper.func_76134_b(par1 * 0.6662F) * 1.4F * par2;
   }
}
