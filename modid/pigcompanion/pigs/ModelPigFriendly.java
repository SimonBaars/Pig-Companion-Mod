package modid.pigcompanion.pigs;

public class ModelPigFriendly extends ModelQuadruped3
{
    public ModelPigFriendly()
    {
        this(0.0F);
    }

    public ModelPigFriendly(float par1)
    {
        super(6, par1);
        head.setTextureOffset(16, 16).addBox(-2F, 0.0F, -9F, 4, 3, 1, par1);
        field_40331_g = 4F;
    }
}
