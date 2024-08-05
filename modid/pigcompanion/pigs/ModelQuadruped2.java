package modid.pigcompanion.pigs;

import org.lwjgl.opengl.GL11;

public class ModelQuadruped2 extends bbo {
   public bcu head;
   public bcu body;
   public bcu leg1;
   public bcu leg2;
   public bcu leg3;
   public bcu leg4;
   bcu Shape1;
   bcu Shape2;
   bcu Shape3;
   bcu Shape4;
   bcu Shape5;
   bcu Shape7;
   bcu Shape8;
   bcu Shape9;
   bcu Shape10;
   bcu Shape11;
   bcu Shape12;
   protected float field_40331_g;
   protected float field_40332_n;

   public ModelQuadruped2(int par1, float par2) {
      this.t = 64;
      this.u = 64;
      this.field_40331_g = 8.0F;
      this.field_40332_n = 4.0F;
      this.head = new bcu(this, 0, 0);
      this.head.a(-4.0F, -4.0F, -8.0F, 8, 8, 8, par2);
      this.head.a(0.0F, (float)(18 - par1), -6.0F);
      this.body = new bcu(this, 28, 8);
      this.body.a(-5.0F, -10.0F, -7.0F, 10, 16, 8, par2);
      this.body.a(0.0F, (float)(17 - par1), 2.0F);
      this.leg1 = new bcu(this, 0, 16);
      this.leg1.a(-2.0F, 0.0F, -2.0F, 4, par1, 4, par2);
      this.leg1.a(-3.0F, (float)(24 - par1), 7.0F);
      this.leg2 = new bcu(this, 0, 16);
      this.leg2.a(-2.0F, 0.0F, -2.0F, 4, par1, 4, par2);
      this.leg2.a(3.0F, (float)(24 - par1), 7.0F);
      this.leg3 = new bcu(this, 0, 16);
      this.leg3.a(-2.0F, 0.0F, -2.0F, 4, par1, 4, par2);
      this.leg3.a(-3.0F, (float)(24 - par1), -5.0F);
      this.leg4 = new bcu(this, 0, 16);
      this.leg4.a(-2.0F, 0.0F, -2.0F, 4, par1, 4, par2);
      this.leg4.a(3.0F, (float)(24 - par1), -5.0F);
      this.Shape1 = new bcu(this, 0, 32);
      this.Shape1.a(0.0F, 0.0F, 0.0F, 10, 3, 1);
      this.Shape1.a(-5.0F, 7.0F, -15.0F);
      this.Shape1.b(64, 64);
      this.Shape1.i = true;
      this.Shape2 = new bcu(this, 23, 50);
      this.Shape2.a(0.0F, 0.0F, 0.0F, 2, 2, 1);
      this.Shape2.a(-1.0F, 10.0F, -15.0F);
      this.Shape2.b(64, 64);
      this.Shape2.i = true;
      this.Shape3 = new bcu(this, 0, 51);
      this.Shape3.a(0.0F, 0.0F, 0.0F, 1, 3, 10);
      this.Shape3.a(4.0F, 7.0F, -15.0F);
      this.Shape3.b(64, 64);
      this.Shape3.i = true;
      this.Shape4 = new bcu(this, 24, 32);
      this.Shape4.a(0.0F, 0.0F, 0.0F, 10, 3, 1);
      this.Shape4.a(-5.0F, 7.0F, -6.0F);
      this.Shape4.b(64, 64);
      this.Shape4.i = true;
      this.Shape5 = new bcu(this, 0, 37);
      this.Shape5.a(0.0F, 0.0F, 0.0F, 1, 3, 10);
      this.Shape5.a(-5.0F, 7.0F, -15.0F);
      this.Shape5.b(64, 64);
      this.Shape5.i = true;
      this.Shape7 = new bcu(this, 16, 16);
      this.Shape7.a(0.0F, 0.0F, 0.0F, 4, 3, 1);
      this.Shape7.a(-2.0F, 12.0F, -15.0F);
      this.Shape7.b(64, 64);
      this.Shape7.i = true;
      this.Shape8 = new bcu(this, 23, 37);
      this.Shape8.a(0.0F, 0.0F, 0.0F, 10, 1, 10);
      this.Shape8.a(-5.0F, 7.0F, -15.0F);
      this.Shape8.b(64, 64);
      this.Shape8.i = true;
      this.Shape9 = new bcu(this, 23, 54);
      this.Shape9.a(0.0F, 0.0F, 0.0F, 1, 1, 5);
      this.Shape9.a(-5.0F, 10.0F, -13.0F);
      this.Shape9.b(64, 64);
      this.Shape9.i = true;
      this.Shape10 = new bcu(this, 31, 50);
      this.Shape10.a(0.0F, 0.0F, 0.0F, 1, 1, 2);
      this.Shape10.a(-5.0F, 11.0F, -10.0F);
      this.Shape10.b(64, 64);
      this.Shape10.i = true;
      this.Shape11 = new bcu(this, 23, 54);
      this.Shape11.a(0.0F, 0.0F, 0.0F, 1, 1, 5);
      this.Shape11.a(4.0F, 10.0F, -13.0F);
      this.Shape11.b(64, 64);
      this.Shape11.i = true;
      this.Shape12 = new bcu(this, 31, 50);
      this.Shape12.a(0.0F, 0.0F, 0.0F, 1, 1, 2);
      this.Shape12.a(4.0F, 11.0F, -10.0F);
      this.Shape12.b(64, 64);
      this.Shape12.i = true;
   }

   public void a(nn par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) {
      this.setRotationAngles(par2, par3, par4, par5, par6, par7);
      if (this.s) {
         float f = 2.0F;
         GL11.glPushMatrix();
         GL11.glTranslatef(0.0F, this.field_40331_g * par7, this.field_40332_n * par7);
         this.head.a(par7);
         GL11.glPopMatrix();
         GL11.glPushMatrix();
         GL11.glScalef(1.0F / f, 1.0F / f, 1.0F / f);
         GL11.glTranslatef(0.0F, 24.0F * par7, 0.0F);
         this.body.a(par7);
         this.leg1.a(par7);
         this.leg2.a(par7);
         this.leg3.a(par7);
         this.leg4.a(par7);
         this.Shape1.a(par7);
         this.Shape2.a(par7);
         this.Shape3.a(par7);
         this.Shape4.a(par7);
         this.Shape5.a(par7);
         this.Shape7.a(par7);
         this.Shape8.a(par7);
         this.Shape9.a(par7);
         this.Shape10.a(par7);
         this.Shape11.a(par7);
         this.Shape12.a(par7);
         GL11.glPopMatrix();
      } else {
         this.head.a(par7);
         this.body.a(par7);
         this.leg1.a(par7);
         this.leg2.a(par7);
         this.leg3.a(par7);
         this.leg4.a(par7);
         this.Shape1.a(par7);
         this.Shape2.a(par7);
         this.Shape3.a(par7);
         this.Shape4.a(par7);
         this.Shape5.a(par7);
         this.Shape7.a(par7);
         this.Shape8.a(par7);
         this.Shape9.a(par7);
         this.Shape10.a(par7);
         this.Shape11.a(par7);
         this.Shape12.a(par7);
      }

   }

   public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6) {
      this.body.f = 1.5707964F;
      this.leg1.f = ls.b(par1 * 0.6662F) * 1.4F * par2;
      this.leg2.f = ls.b(par1 * 0.6662F + 3.1415927F) * 1.4F * par2;
      this.leg3.f = ls.b(par1 * 0.6662F + 3.1415927F) * 1.4F * par2;
      this.leg4.f = ls.b(par1 * 0.6662F) * 1.4F * par2;
   }
}
