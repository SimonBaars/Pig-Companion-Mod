package modid.pigcompanion.pigs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderPig2 extends RenderLiving
{
	private static final ResourceLocation field_110888_a = new ResourceLocation("textures/entity/pig/pig_saddle.png");
    private static final ResourceLocation field_110887_f = new ResourceLocation("textures/pigs/pig.png");
	
    public RenderPig2(ModelBase par1ModelBase, ModelBase par2ModelBase, float par3)
    {
        super(par1ModelBase, par3);
        setRenderPassModel(par2ModelBase);
    }

    protected int renderSaddledPig(EntityPig2 par1EntityPig, int par2, float par3)
    {
        if (par2 == 0 && par1EntityPig.getSaddled())
        {
            this.bindTexture(field_110888_a);
            return 1;
        }
        else
        {
            return -1;
        }
    }

    protected ResourceLocation func_110886_a(EntityPig2 par1EntityPig)
    {
        return field_110887_f;
    }

    public void func_40286_a(EntityPig2 par1EntityPig, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRender(par1EntityPig, par2, par4, par6, par8, par9);
    }

    /**
     * Queries whether should render the specified pass or not.
     */
    protected int shouldRenderPass(EntityLiving par1EntityLiving, int par2, float par3)
    {
        return renderSaddledPig((EntityPig2)par1EntityLiving, par2, par3);
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        func_40286_a((EntityPig2)par1EntityLiving, par2, par4, par6, par8, par9);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        func_40286_a((EntityPig2)par1Entity, par2, par4, par6, par8, par9);
    }
	
	protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.func_110886_a((EntityPig2)par1Entity);
    }
}
