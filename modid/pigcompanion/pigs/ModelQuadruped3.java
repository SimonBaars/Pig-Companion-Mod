package modid.pigcompanion.pigs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

public class ModelQuadruped3 extends ModelBase
{
    public ModelRenderer head;
    public ModelRenderer body;
    public ModelRenderer leg1;
    public ModelRenderer leg2;
    public ModelRenderer leg3;
    public ModelRenderer leg4;
	public ModelRenderer Shape1;
    public ModelRenderer Shape2;
    public ModelRenderer Shape3;
    public ModelRenderer Shape4;
    public ModelRenderer Shape5;
    public ModelRenderer Shape7;
    public ModelRenderer Shape8;
    public ModelRenderer Shape9;
    public ModelRenderer Shape10;
    public ModelRenderer Shape11;
    public ModelRenderer Shape12;
    public ModelRenderer Shape13;
    public ModelRenderer Shape14;
    public ModelRenderer Shape15;
    protected float field_40331_g;
    protected float field_40332_n;

    public ModelQuadruped3(int par1, float par2)
    {
		textureWidth = 64;
    textureHeight = 64;
        field_40331_g = 8F;
        field_40332_n = 4F;
        head = new ModelRenderer(this, 0, 0);
        head.addBox(-4F, -4F, -8F, 8, 8, 8, par2);
        head.setRotationPoint(0.0F, 18 - par1, -6F);
        body = new ModelRenderer(this, 28, 8);
        body.addBox(-5F, -10F, -7F, 10, 16, 8, par2);
        body.setRotationPoint(0.0F, 17 - par1, 2.0F);
        leg1 = new ModelRenderer(this, 0, 16);
        leg1.addBox(-2F, 0.0F, -2F, 4, par1, 4, par2);
        leg1.setRotationPoint(-3F, 24 - par1, 7F);
        leg2 = new ModelRenderer(this, 0, 16);
        leg2.addBox(-2F, 0.0F, -2F, 4, par1, 4, par2);
        leg2.setRotationPoint(3F, 24 - par1, 7F);
        leg3 = new ModelRenderer(this, 0, 16);
        leg3.addBox(-2F, 0.0F, -2F, 4, par1, 4, par2);
        leg3.setRotationPoint(-3F, 24 - par1, -5F);
        leg4 = new ModelRenderer(this, 0, 16);
        leg4.addBox(-2F, 0.0F, -2F, 4, par1, 4, par2);
        leg4.setRotationPoint(3F, 24 - par1, -5F);
		Shape1 = new ModelRenderer(this, 0, 32);
      Shape1.addBox(0F, 0F, 0F, 10, 3, 1);
      Shape1.setRotationPoint(-5F, 7F, -15F);
      Shape1.setTextureSize(64, 64);
      Shape1.mirror = true;
      Shape2 = new ModelRenderer(this, 23, 50);
      Shape2.addBox(0F, 0F, 0F, 2, 2, 1);
      Shape2.setRotationPoint(-1F, 10F, -15F);
      Shape2.setTextureSize(64, 64);
      Shape2.mirror = true;
      Shape3 = new ModelRenderer(this, 0, 51);
      Shape3.addBox(0F, 0F, 0F, 1, 3, 10);
      Shape3.setRotationPoint(4F, 7F, -15F);
      Shape3.setTextureSize(64, 64);
      Shape3.mirror = true;
      Shape4 = new ModelRenderer(this, 24, 32);
      Shape4.addBox(0F, 0F, 0F, 10, 3, 1);
      Shape4.setRotationPoint(-5F, 7F, -6F);
      Shape4.setTextureSize(64, 64);
      Shape4.mirror = true;
      Shape5 = new ModelRenderer(this, 0, 37);
      Shape5.addBox(0F, 0F, 0F, 1, 3, 10);
      Shape5.setRotationPoint(-5F, 7F, -15F);
      Shape5.setTextureSize(64, 64);
      Shape5.mirror = true;
      Shape7 = new ModelRenderer(this, 16, 16);
      Shape7.addBox(0F, 0F, 0F, 4, 3, 1);
      Shape7.setRotationPoint(-2F, 12F, -15F);
      Shape7.setTextureSize(64, 64);
      Shape7.mirror = true;
      Shape8 = new ModelRenderer(this, 23, 37);
      Shape8.addBox(0F, 0F, 0F, 10, 1, 10);
      Shape8.setRotationPoint(-5F, 7F, -15F);
      Shape8.setTextureSize(64, 64);
      Shape8.mirror = true;
      Shape9 = new ModelRenderer(this, 23, 54);
      Shape9.addBox(0F, 0F, 0F, 1, 1, 5);
      Shape9.setRotationPoint(-5F, 10F, -13F);
      Shape9.setTextureSize(64, 64);
      Shape9.mirror = true;
      Shape10 = new ModelRenderer(this, 31, 50);
      Shape10.addBox(0F, 0F, 0F, 1, 1, 2);
      Shape10.setRotationPoint(-5F, 11F, -10F);
      Shape10.setTextureSize(64, 64);
      Shape10.mirror = true;
      Shape11 = new ModelRenderer(this, 23, 54);
      Shape11.addBox(0F, 0F, 0F, 1, 1, 5);
      Shape11.setRotationPoint(4F, 10F, -13F);
      Shape11.setTextureSize(64, 64);
      Shape11.mirror = true;
      Shape12 = new ModelRenderer(this, 31, 50);
      Shape12.addBox(0F, 0F, 0F, 1, 1, 2);
      Shape12.setRotationPoint(4F, 11F, -10F);
      Shape12.setTextureSize(64, 64);
      Shape12.mirror = true;
      Shape13 = new ModelRenderer(this, 38, 58);
      Shape13.addBox(0F, 0F, 0F, 2, 1, 0);
      Shape13.setRotationPoint(-3F, 18F, -8F);
      Shape13.setTextureSize(64, 64);
      Shape13.mirror = true;
      Shape14 = new ModelRenderer(this, 38, 58);
      Shape14.addBox(0F, 0F, 0F, 2, 1, 0);
      Shape14.setRotationPoint(1F, 18F, -8F);
      Shape14.setTextureSize(64, 64);
      Shape14.mirror = true;
      Shape15 = new ModelRenderer(this, 42, 58);
      Shape15.addBox(0F, 0F, 0F, 2, 2, 1);
      Shape15.setRotationPoint(-1F, 18F, -9F);
      Shape15.setTextureSize(64, 64);
      Shape15.mirror = true;
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
    {
        setRotationAngles(par2, par3, par4, par5, par6, par7);

        if (isChild)
        {
            float f = 2.0F;
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0F, field_40331_g * par7, field_40332_n * par7);
            head.render(par7);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(1.0F / f, 1.0F / f, 1.0F / f);
            GL11.glTranslatef(0.0F, 24F * par7, 0.0F);
            body.render(par7);
            leg1.render(par7);
            leg2.render(par7);
            leg3.render(par7);
            leg4.render(par7);
			Shape1.render(par7);
    Shape2.render(par7);
    Shape3.render(par7);
    Shape4.render(par7);
    Shape5.render(par7);
    Shape7.render(par7);
    Shape8.render(par7);
    Shape9.render(par7);
    Shape10.render(par7);
    Shape11.render(par7);
    Shape12.render(par7);
	Shape13.render(par7);
    Shape14.render(par7);
    Shape15.render(par7);
            GL11.glPopMatrix();
        }
        else
        {
            head.render(par7);
            body.render(par7);
            leg1.render(par7);
            leg2.render(par7);
            leg3.render(par7);
            leg4.render(par7);
    Shape1.render(par7);
    Shape2.render(par7);
    Shape3.render(par7);
    Shape4.render(par7);
    Shape5.render(par7);
    Shape7.render(par7);
    Shape8.render(par7);
    Shape9.render(par7);
    Shape10.render(par7);
    Shape11.render(par7);
    Shape12.render(par7);
	Shape13.render(par7);
    Shape14.render(par7);
    Shape15.render(par7);
        }
    }

    /**
     * Sets the models various rotation angles.
     */
    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6)
    {
        body.rotateAngleX = ((float)Math.PI / 2F);
        leg1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
        leg2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
        leg3.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
        leg4.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
    }
}
