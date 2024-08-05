package modid.pigcompanion.pigs;

import modid.pigcompanion.core.PigCompanionMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIControlledByPlayer;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityExpBottle;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.AchievementList;
import net.minecraft.world.World;

public class EntityPigFriendlyGold extends EntityMob
{

private final EntityAIControlledByPlayer aiControlledByPlayer;
    public EntityPigFriendlyGold(World par1World)
    {
        super(par1World);
        //texture = "/pigs/pigfriendlygold.png";
        setSize(0.9F, 0.9F);
        getNavigator().setAvoidsWater(true);
        float f = 0.25F;
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 0.38F));
        //tasks.addTask(2, new EntityAIMate(this, f));
		this.tasks.addTask(2, this.aiControlledByPlayer = new EntityAIControlledByPlayer(this, 0.5F));
        this.tasks.addTask(3, new EntityAITempt(this, 0.4F, Items.wheat, false));
        //tasks.addTask(4, new EntityAIFollowParent(this, 0.28F));
        this.tasks.addTask(5, new EntityAIWander(this, f));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
		this.tasks.addTask(4, new EntityAITempt(this, 0.3F, PigCompanionMod.potatoOnAStick, false));
        this.tasks.addTask(4, new EntityAITempt(this, 0.3F, Items.potato, false));
		this.tasks.addTask(8, new EntityAIOpenDoor(this, true));
		this.tasks.addTask(9, new EntityAIAttackOnCollide(this, EntityEnderman.class, 1.0D, true));
		this.tasks.addTask(10, new EntityAIAttackOnCollide(this, EntityPigZombie.class, 1.0D, true));
		this.tasks.addTask(11, new EntityAIAttackOnCollide(this, EntityBlaze.class, 1.0D, true));
		this.tasks.addTask(12, new EntityAIAttackOnCollide(this, EntityCaveSpider.class, 1.0D, true));
		this.tasks.addTask(13, new EntityAIAttackOnCollide(this, EntityCreeper.class, 1.0D, true));
		this.tasks.addTask(14, new EntityAIAttackOnCollide(this, EntityGhast.class, 1.0D, true));
		this.tasks.addTask(15, new EntityAIAttackOnCollide(this, EntityMagmaCube.class, 1.0D, true));
		this.tasks.addTask(16, new EntityAIAttackOnCollide(this, EntitySilverfish.class, 1.0D, true));
		this.tasks.addTask(17, new EntityAIAttackOnCollide(this, EntitySkeleton.class, 1.0D, true));
		this.tasks.addTask(18, new EntityAIAttackOnCollide(this, EntitySlime.class, 1.0D, true));
		this.tasks.addTask(19, new EntityAIAttackOnCollide(this, EntitySpider.class, 1.0D, true));
		this.tasks.addTask(20, new EntityAIAttackOnCollide(this, EntityZombie.class, 1.0D, true));
		this.tasks.addTask(21, new EntityAIAttackOnCollide(this, EntityBat.class, 1.0D, true));
		this.tasks.addTask(22, new EntityAIAttackOnCollide(this, EntityWither.class, 1.0D, true));
		this.tasks.addTask(23, new EntityAIAttackOnCollide(this, EntityWitch.class, 1.0D, true));
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityEnderman.class, 0, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPigZombie.class, 0, false));
		this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityBlaze.class, 0, false));
		this.targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, EntityCaveSpider.class, 0, false));
		this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityCreeper.class, 0, false));
		this.targetTasks.addTask(6, new EntityAINearestAttackableTarget(this, EntityGhast.class, 0, false));
		this.targetTasks.addTask(7, new EntityAINearestAttackableTarget(this, EntityMagmaCube.class, 0, false));
		this.targetTasks.addTask(8, new EntityAINearestAttackableTarget(this, EntitySilverfish.class, 0, false));
		this.targetTasks.addTask(9, new EntityAINearestAttackableTarget(this, EntitySkeleton.class, 0, false));
		this.targetTasks.addTask(10, new EntityAINearestAttackableTarget(this, EntitySlime.class, 0, false));
		this.targetTasks.addTask(11, new EntityAINearestAttackableTarget(this, EntitySpider.class, 0, false));
		this.targetTasks.addTask(12, new EntityAINearestAttackableTarget(this, EntityZombie.class, 0, false));
		this.targetTasks.addTask(13, new EntityAINearestAttackableTarget(this, EntityBat.class, 0, false));
		this.targetTasks.addTask(14, new EntityAINearestAttackableTarget(this, EntityWither.class, 0, false));
		this.targetTasks.addTask(15, new EntityAINearestAttackableTarget(this, EntityWitch.class, 0, false));
		//attackStrength = 4;
    }
public int func_82193_c(Entity par1Entity)
    {
        return 6;
    }
    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }
	public boolean canBeSteered()
    {
        ItemStack var1 = ((EntityPlayer)this.riddenByEntity).getHeldItem();
        return var1 != null && var1.itemID == PigCompanionMod.potatoOnAStick;
    }

	public EntityPigFriendlyGold spawnBabyAnimal(EntityAgeable par1EntityAgeable)
    {
        return new EntityPigFriendlyGold(this.worldObj);
    }
/**
    public int getMaxHealth()
    {
        return 30;
    }
    */
	public EntityAIControlledByPlayer getAIControlledByPlayer()
    {
        return this.aiControlledByPlayer;
    }

    protected void entityInit()
    {
        super.entityInit();
        dataWatcher.addObject(16, Byte.valueOf((byte)0));
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.writeEntityToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setBoolean("Saddle", getSaddled());
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.readEntityFromNBT(par1NBTTagCompound);
        setSaddled(par1NBTTagCompound.getBoolean("Saddle"));
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.pig";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.pig";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.pigdeath";
    }

    /**
     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
     */
    public boolean interact(EntityPlayer par1EntityPlayer)
    {
    	
    	ItemStack var2 = par1EntityPlayer.inventory.getCurrentItem();

        if (var2 != null && var2.itemID == Items.gunpowder)
        {
            //this.setDead();

            if (!this.worldObj.isRemote)
            {
            	//blokje 0 10
                EntityTNTPrimed var3 = new EntityTNTPrimed(this.worldObj);
                var3.setLocationAndAngles(this.posX, this.posY+1, this.posZ+10, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var3);
                
              //blokje 1 10
                EntityTNTPrimed var4 = new EntityTNTPrimed(this.worldObj);
                var4.setLocationAndAngles(this.posX+1, this.posY+1, this.posZ+10, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var4);
                
              //blokje 2 10
                EntityTNTPrimed var5 = new EntityTNTPrimed(this.worldObj);
                var5.setLocationAndAngles(this.posX+2, this.posY+1, this.posZ+10, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var5);
                
              //blokje 3 10
                EntityTNTPrimed var6 = new EntityTNTPrimed(this.worldObj);
                var6.setLocationAndAngles(this.posX+3, this.posY+1, this.posZ+10, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var6);
                
              //blokje 4 10
                EntityTNTPrimed var7 = new EntityTNTPrimed(this.worldObj);
                var7.setLocationAndAngles(this.posX+4, this.posY+1, this.posZ+9, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var7);
                
              //blokje 5 10
                EntityTNTPrimed var8 = new EntityTNTPrimed(this.worldObj);
                var8.setLocationAndAngles(this.posX+5, this.posY+1, this.posZ+9, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var8);
                
              //blokje 6 10
                EntityTNTPrimed var9 = new EntityTNTPrimed(this.worldObj);
                var9.setLocationAndAngles(this.posX+6, this.posY+1, this.posZ+8, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var9);
                
              //blokje 7 10
                EntityTNTPrimed var10 = new EntityTNTPrimed(this.worldObj);
                var10.setLocationAndAngles(this.posX+7, this.posY+1, this.posZ+7, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var10);
                
              //blokje 7 10
                EntityTNTPrimed var11 = new EntityTNTPrimed(this.worldObj);
                var11.setLocationAndAngles(this.posX+8, this.posY+1, this.posZ+6, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var11);
                
              //blokje 7 10
                EntityTNTPrimed var12 = new EntityTNTPrimed(this.worldObj);
                var12.setLocationAndAngles(this.posX+9, this.posY+1, this.posZ+5, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var12);
                
              //blokje 7 10
                EntityTNTPrimed var13 = new EntityTNTPrimed(this.worldObj);
                var13.setLocationAndAngles(this.posX+9, this.posY+1, this.posZ+4, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var13);
                
              //blokje 7 10
                EntityTNTPrimed var14 = new EntityTNTPrimed(this.worldObj);
                var14.setLocationAndAngles(this.posX+10, this.posY+3, this.posZ+3, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var14);
                
              //blokje 7 10
                EntityTNTPrimed var15 = new EntityTNTPrimed(this.worldObj);
                var15.setLocationAndAngles(this.posX+10, this.posY+1, this.posZ+2, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var15);
                
              //blokje 7 10
                EntityTNTPrimed var16 = new EntityTNTPrimed(this.worldObj);
                var16.setLocationAndAngles(this.posX+10, this.posY+1, this.posZ+1, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var16);
                
              //blokje 7 10
                EntityTNTPrimed var17 = new EntityTNTPrimed(this.worldObj);
                var17.setLocationAndAngles(this.posX+10, this.posY+1, this.posZ+0, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var17);
                
              //blokje 7 10
                EntityTNTPrimed var18 = new EntityTNTPrimed(this.worldObj);
                var18.setLocationAndAngles(this.posX+10, this.posY+1, this.posZ+-1, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var18);
                
              //blokje 7 10
                EntityTNTPrimed var19 = new EntityTNTPrimed(this.worldObj);
                var19.setLocationAndAngles(this.posX+10, this.posY+1, this.posZ+-2, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var19);
                
              //blokje 7 10
                EntityTNTPrimed var20 = new EntityTNTPrimed(this.worldObj);
                var20.setLocationAndAngles(this.posX+9, this.posY+1, this.posZ+-4, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var20);
                
              //blokje 7 10
                EntityTNTPrimed var21 = new EntityTNTPrimed(this.worldObj);
                var21.setLocationAndAngles(this.posX+9, this.posY+1, this.posZ+-5, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var21);
                
              //blokje 7 10
                EntityTNTPrimed var22 = new EntityTNTPrimed(this.worldObj);
                var22.setLocationAndAngles(this.posX+8, this.posY+1, this.posZ+-6, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var22);
                
              //blokje 7 10
                EntityTNTPrimed var23 = new EntityTNTPrimed(this.worldObj);
                var23.setLocationAndAngles(this.posX+7, this.posY+1, this.posZ+-7, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var23);
                
              //blokje 7 10
                EntityTNTPrimed var24 = new EntityTNTPrimed(this.worldObj);
                var24.setLocationAndAngles(this.posX+6, this.posY+1, this.posZ+-8, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var24);
                
              //blokje 7 10
                EntityTNTPrimed var25 = new EntityTNTPrimed(this.worldObj);
                var25.setLocationAndAngles(this.posX+5, this.posY+1, this.posZ+-9, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var25);
                
              //blokje 7 10
                EntityTNTPrimed var26 = new EntityTNTPrimed(this.worldObj);
                var26.setLocationAndAngles(this.posX+4, this.posY+1, this.posZ+-9, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var26);
                
              //blokje 7 10
                EntityTNTPrimed var27 = new EntityTNTPrimed(this.worldObj);
                var27.setLocationAndAngles(this.posX+3, this.posY+1, this.posZ+-10, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var27);
                
              //blokje 7 10
                EntityTNTPrimed var28 = new EntityTNTPrimed(this.worldObj);
                var28.setLocationAndAngles(this.posX+2, this.posY+1, this.posZ+-10, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var28);
                
              //blokje 7 10
                EntityTNTPrimed var29 = new EntityTNTPrimed(this.worldObj);
                var29.setLocationAndAngles(this.posX+1, this.posY+1, this.posZ+-10, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var29);
                
              //blokje 7 10
                EntityTNTPrimed var30 = new EntityTNTPrimed(this.worldObj);
                var30.setLocationAndAngles(this.posX+0, this.posY+1, this.posZ+-10, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var30);
                
                //blokje 6 10
                EntityTNTPrimed var31 = new EntityTNTPrimed(this.worldObj);
                var31.setLocationAndAngles(this.posX+-1, this.posY+1, this.posZ+-10, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var31);
                
                //blokje 6 10
                EntityTNTPrimed var32 = new EntityTNTPrimed(this.worldObj);
                var32.setLocationAndAngles(this.posX+-2, this.posY+1, this.posZ+-10, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var32);
                
                //blokje 6 10
                EntityTNTPrimed var33 = new EntityTNTPrimed(this.worldObj);
                var33.setLocationAndAngles(this.posX+-3, this.posY+1, this.posZ+-10, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var33);
                
                //blokje 6 10
                EntityTNTPrimed var34 = new EntityTNTPrimed(this.worldObj);
                var34.setLocationAndAngles(this.posX+-4, this.posY+1, this.posZ+-9, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var34);
                
                //blokje 6 10
                EntityTNTPrimed var35 = new EntityTNTPrimed(this.worldObj);
                var35.setLocationAndAngles(this.posX+-5, this.posY+1, this.posZ+-9, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var35);
                
                //blokje 6 10
                EntityTNTPrimed var36 = new EntityTNTPrimed(this.worldObj);
                var36.setLocationAndAngles(this.posX+-6, this.posY+1, this.posZ+-8, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var36);
                
                //blokje 6 10
                EntityTNTPrimed var37 = new EntityTNTPrimed(this.worldObj);
                var37.setLocationAndAngles(this.posX+-7, this.posY+1, this.posZ+-7, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var37);
                
                //blokje 6 10
                EntityTNTPrimed var38 = new EntityTNTPrimed(this.worldObj);
                var38.setLocationAndAngles(this.posX+-8, this.posY+1, this.posZ+-6, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var38);
                
                //blokje 6 10
                EntityTNTPrimed var39 = new EntityTNTPrimed(this.worldObj);
                var39.setLocationAndAngles(this.posX+-9, this.posY+1, this.posZ+-5, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var39);
                
                //blokje 6 10
                EntityTNTPrimed var40 = new EntityTNTPrimed(this.worldObj);
                var40.setLocationAndAngles(this.posX+-9, this.posY+1, this.posZ+-4, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var40);
                
                //blokje 6 10
                EntityTNTPrimed var41 = new EntityTNTPrimed(this.worldObj);
                var41.setLocationAndAngles(this.posX+-10, this.posY+1, this.posZ+-3, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var41);
                
                //blokje 6 10
                EntityTNTPrimed var42 = new EntityTNTPrimed(this.worldObj);
                var42.setLocationAndAngles(this.posX+-10, this.posY+1, this.posZ+-2, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var42);
                
                //blokje 6 10
                EntityTNTPrimed var43 = new EntityTNTPrimed(this.worldObj);
                var43.setLocationAndAngles(this.posX+-10, this.posY+1, this.posZ+-1, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var43);
                
                //blokje 6 10
                EntityTNTPrimed var44 = new EntityTNTPrimed(this.worldObj);
                var44.setLocationAndAngles(this.posX+-10, this.posY+1, this.posZ+0, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var44);
                
                //blokje 6 10
                EntityTNTPrimed var45 = new EntityTNTPrimed(this.worldObj);
                var45.setLocationAndAngles(this.posX+-10, this.posY+1, this.posZ+1, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var45);
                
                //blokje 6 10
                EntityTNTPrimed var46 = new EntityTNTPrimed(this.worldObj);
                var46.setLocationAndAngles(this.posX+-10, this.posY+1, this.posZ+2, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var46);
                
                //blokje 6 10
                EntityTNTPrimed var47 = new EntityTNTPrimed(this.worldObj);
                var47.setLocationAndAngles(this.posX+-10, this.posY+1, this.posZ+3, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var47);
                
                //blokje 6 10
                EntityTNTPrimed var48 = new EntityTNTPrimed(this.worldObj);
                var48.setLocationAndAngles(this.posX+-9, this.posY+1, this.posZ+4, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var48);
                
                //blokje 6 10
                EntityTNTPrimed var49 = new EntityTNTPrimed(this.worldObj);
                var49.setLocationAndAngles(this.posX+-9, this.posY+1, this.posZ+5, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var49);
                
                //blokje 6 10
                EntityTNTPrimed var50 = new EntityTNTPrimed(this.worldObj);
                var50.setLocationAndAngles(this.posX+-8, this.posY+1, this.posZ+6, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var50);
                
                //blokje 6 10
                EntityTNTPrimed var51 = new EntityTNTPrimed(this.worldObj);
                var51.setLocationAndAngles(this.posX+-7, this.posY+1, this.posZ+7, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var51);
                
                //blokje 6 10
                EntityTNTPrimed var52 = new EntityTNTPrimed(this.worldObj);
                var52.setLocationAndAngles(this.posX+-6, this.posY+1, this.posZ+8, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var52);
                
                //blokje 6 10
                EntityTNTPrimed var53 = new EntityTNTPrimed(this.worldObj);
                var53.setLocationAndAngles(this.posX+-5, this.posY+1, this.posZ+9, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var53);
                
                //blokje 6 10
                EntityTNTPrimed var54 = new EntityTNTPrimed(this.worldObj);
                var54.setLocationAndAngles(this.posX+-4, this.posY+1, this.posZ+9, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var54);
                
                //blokje 6 10
                EntityTNTPrimed var55 = new EntityTNTPrimed(this.worldObj);
                var55.setLocationAndAngles(this.posX+-3, this.posY+1, this.posZ+10, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var55);
                
                //blokje 6 10
                EntityTNTPrimed var56 = new EntityTNTPrimed(this.worldObj);
                var56.setLocationAndAngles(this.posX+-2, this.posY+1, this.posZ+10, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var56);
                
                //blokje 6 10
                EntityTNTPrimed var57 = new EntityTNTPrimed(this.worldObj);
                var57.setLocationAndAngles(this.posX+-1, this.posY+1, this.posZ+10, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var57);
                
				par1EntityPlayer.inventory.consumeInventoryItem(Items.gunpowder);
				par1EntityPlayer.inventory.consumeInventoryItem(Items.gunpowder);
				par1EntityPlayer.inventory.consumeInventoryItem(Items.gunpowder);
				par1EntityPlayer.inventory.consumeInventoryItem(Items.gunpowder);
				par1EntityPlayer.inventory.consumeInventoryItem(Items.gunpowder);
				par1EntityPlayer.inventory.consumeInventoryItem(Items.gunpowder);
				par1EntityPlayer.inventory.consumeInventoryItem(Items.gunpowder);
				par1EntityPlayer.inventory.consumeInventoryItem(Items.gunpowder);
				par1EntityPlayer.inventory.consumeInventoryItem(Items.gunpowder);
                //var3.setEntityHealth(this.getHealth());
                //var3.renderYawOffset = this.renderYawOffset;
            }

            return true;
        }
        
        if (var2 != null && var2.itemID == Items.feather)
        {
            //this.setDead();

            if (!this.worldObj.isRemote)
            {
            	double RandNumber = (Math.random()*100);        	
				par1EntityPlayer.inventory.consumeInventoryItem(Items.feather);
				if (RandNumber < 25) 
				{
					this.motionX += 5.0;
				}
				else if (RandNumber < 50) 
				{
					this.motionX -= 5.0;
				}
				else if (RandNumber < 75) 
				{
					this.motionZ += 5.0;
				}
				else
				{
					this.motionZ -= 5.0;
				}
                //var3.setEntityHealth(this.getHealth());
                //var3.renderYawOffset = this.renderYawOffset;
            }

            return true;
        }
        
        
        if (var2 != null && var2.itemID == Items.experience_bottle)
        {
            //this.setDead();

            if (!this.worldObj.isRemote)
            {
            		
				par1EntityPlayer.inventory.consumeInventoryItem(Items.experience_bottle);
				par1EntityPlayer.inventory.consumeInventoryItem(Items.experience_bottle);
				par1EntityPlayer.inventory.consumeInventoryItem(Items.experience_bottle);
				par1EntityPlayer.inventory.consumeInventoryItem(Items.experience_bottle);
				par1EntityPlayer.inventory.consumeInventoryItem(Items.experience_bottle);
				
					
				//blokje 0 10
                EntityExpBottle var3 = new EntityExpBottle(this.worldObj);
                var3.setLocationAndAngles(this.posX, this.posY+1, this.posZ+10, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var3);
                
              //blokje 1 10
                EntityExpBottle var4 = new EntityExpBottle(this.worldObj);
                var4.setLocationAndAngles(this.posX+1, this.posY+1, this.posZ+10, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var4);
                
              //blokje 2 10
                EntityExpBottle var5 = new EntityExpBottle(this.worldObj);
                var5.setLocationAndAngles(this.posX+2, this.posY+1, this.posZ+10, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var5);
                
              //blokje 3 10
                EntityExpBottle var6 = new EntityExpBottle(this.worldObj);
                var6.setLocationAndAngles(this.posX+3, this.posY+1, this.posZ+10, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var6);
                
              //blokje 4 10
                EntityExpBottle var7 = new EntityExpBottle(this.worldObj);
                var7.setLocationAndAngles(this.posX+4, this.posY+1, this.posZ+9, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var7);
                
              //blokje 5 10
                EntityExpBottle var8 = new EntityExpBottle(this.worldObj);
                var8.setLocationAndAngles(this.posX+5, this.posY+1, this.posZ+9, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var8);
                
              //blokje 6 10
                EntityExpBottle var9 = new EntityExpBottle(this.worldObj);
                var9.setLocationAndAngles(this.posX+6, this.posY+1, this.posZ+8, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var9);
                
              //blokje 7 10
                EntityExpBottle var10 = new EntityExpBottle(this.worldObj);
                var10.setLocationAndAngles(this.posX+7, this.posY+1, this.posZ+7, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var10);
                
              //blokje 7 10
                EntityExpBottle var11 = new EntityExpBottle(this.worldObj);
                var11.setLocationAndAngles(this.posX+8, this.posY+1, this.posZ+6, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var11);
                
              //blokje 7 10
                EntityExpBottle var12 = new EntityExpBottle(this.worldObj);
                var12.setLocationAndAngles(this.posX+9, this.posY+1, this.posZ+5, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var12);
                
              //blokje 7 10
                EntityExpBottle var13 = new EntityExpBottle(this.worldObj);
                var13.setLocationAndAngles(this.posX+9, this.posY+1, this.posZ+4, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var13);
                
              //blokje 7 10
                EntityExpBottle var14 = new EntityExpBottle(this.worldObj);
                var14.setLocationAndAngles(this.posX+10, this.posY+3, this.posZ+3, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var14);
                
              //blokje 7 10
                EntityExpBottle var15 = new EntityExpBottle(this.worldObj);
                var15.setLocationAndAngles(this.posX+10, this.posY+1, this.posZ+2, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var15);
                
              //blokje 7 10
                EntityExpBottle var16 = new EntityExpBottle(this.worldObj);
                var16.setLocationAndAngles(this.posX+10, this.posY+1, this.posZ+1, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var16);
                
              //blokje 7 10
                EntityExpBottle var17 = new EntityExpBottle(this.worldObj);
                var17.setLocationAndAngles(this.posX+10, this.posY+1, this.posZ+0, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var17);
                
              //blokje 7 10
                EntityExpBottle var18 = new EntityExpBottle(this.worldObj);
                var18.setLocationAndAngles(this.posX+10, this.posY+1, this.posZ+-1, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var18);
                
              //blokje 7 10
                EntityExpBottle var19 = new EntityExpBottle(this.worldObj);
                var19.setLocationAndAngles(this.posX+10, this.posY+1, this.posZ+-2, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var19);
                
              //blokje 7 10
                EntityExpBottle var20 = new EntityExpBottle(this.worldObj);
                var20.setLocationAndAngles(this.posX+9, this.posY+1, this.posZ+-4, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var20);
                
              //blokje 7 10
                EntityExpBottle var21 = new EntityExpBottle(this.worldObj);
                var21.setLocationAndAngles(this.posX+9, this.posY+1, this.posZ+-5, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var21);
                
              //blokje 7 10
                EntityExpBottle var22 = new EntityExpBottle(this.worldObj);
                var22.setLocationAndAngles(this.posX+8, this.posY+1, this.posZ+-6, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var22);
                
              //blokje 7 10
                EntityExpBottle var23 = new EntityExpBottle(this.worldObj);
                var23.setLocationAndAngles(this.posX+7, this.posY+1, this.posZ+-7, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var23);
                
              //blokje 7 10
                EntityExpBottle var24 = new EntityExpBottle(this.worldObj);
                var24.setLocationAndAngles(this.posX+6, this.posY+1, this.posZ+-8, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var24);
                
              //blokje 7 10
                EntityExpBottle var25 = new EntityExpBottle(this.worldObj);
                var25.setLocationAndAngles(this.posX+5, this.posY+1, this.posZ+-9, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var25);
                
              //blokje 7 10
                EntityExpBottle var26 = new EntityExpBottle(this.worldObj);
                var26.setLocationAndAngles(this.posX+4, this.posY+1, this.posZ+-9, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var26);
                
              //blokje 7 10
                EntityExpBottle var27 = new EntityExpBottle(this.worldObj);
                var27.setLocationAndAngles(this.posX+3, this.posY+1, this.posZ+-10, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var27);
                
              //blokje 7 10
                EntityExpBottle var28 = new EntityExpBottle(this.worldObj);
                var28.setLocationAndAngles(this.posX+2, this.posY+1, this.posZ+-10, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var28);
                
              //blokje 7 10
                EntityExpBottle var29 = new EntityExpBottle(this.worldObj);
                var29.setLocationAndAngles(this.posX+1, this.posY+1, this.posZ+-10, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var29);
                
              //blokje 7 10
                EntityExpBottle var30 = new EntityExpBottle(this.worldObj);
                var30.setLocationAndAngles(this.posX+0, this.posY+1, this.posZ+-10, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var30);
                
                //blokje 6 10
                EntityExpBottle var31 = new EntityExpBottle(this.worldObj);
                var31.setLocationAndAngles(this.posX+-1, this.posY+1, this.posZ+-10, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var31);
                
                //blokje 6 10
                EntityExpBottle var32 = new EntityExpBottle(this.worldObj);
                var32.setLocationAndAngles(this.posX+-2, this.posY+1, this.posZ+-10, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var32);
                
                //blokje 6 10
                EntityExpBottle var33 = new EntityExpBottle(this.worldObj);
                var33.setLocationAndAngles(this.posX+-3, this.posY+1, this.posZ+-10, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var33);
                
                //blokje 6 10
                EntityExpBottle var34 = new EntityExpBottle(this.worldObj);
                var34.setLocationAndAngles(this.posX+-4, this.posY+1, this.posZ+-9, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var34);
                
                //blokje 6 10
                EntityExpBottle var35 = new EntityExpBottle(this.worldObj);
                var35.setLocationAndAngles(this.posX+-5, this.posY+1, this.posZ+-9, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var35);
                
                //blokje 6 10
                EntityExpBottle var36 = new EntityExpBottle(this.worldObj);
                var36.setLocationAndAngles(this.posX+-6, this.posY+1, this.posZ+-8, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var36);
                
                //blokje 6 10
                EntityExpBottle var37 = new EntityExpBottle(this.worldObj);
                var37.setLocationAndAngles(this.posX+-7, this.posY+1, this.posZ+-7, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var37);
                
                //blokje 6 10
                EntityExpBottle var38 = new EntityExpBottle(this.worldObj);
                var38.setLocationAndAngles(this.posX+-8, this.posY+1, this.posZ+-6, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var38);
                
                //blokje 6 10
                EntityExpBottle var39 = new EntityExpBottle(this.worldObj);
                var39.setLocationAndAngles(this.posX+-9, this.posY+1, this.posZ+-5, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var39);
                
                //blokje 6 10
                EntityExpBottle var40 = new EntityExpBottle(this.worldObj);
                var40.setLocationAndAngles(this.posX+-9, this.posY+1, this.posZ+-4, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var40);
                
                //blokje 6 10
                EntityExpBottle var41 = new EntityExpBottle(this.worldObj);
                var41.setLocationAndAngles(this.posX+-10, this.posY+1, this.posZ+-3, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var41);
                
                //blokje 6 10
                EntityExpBottle var42 = new EntityExpBottle(this.worldObj);
                var42.setLocationAndAngles(this.posX+-10, this.posY+1, this.posZ+-2, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var42);
                
                //blokje 6 10
                EntityExpBottle var43 = new EntityExpBottle(this.worldObj);
                var43.setLocationAndAngles(this.posX+-10, this.posY+1, this.posZ+-1, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var43);
                
                //blokje 6 10
                EntityExpBottle var44 = new EntityExpBottle(this.worldObj);
                var44.setLocationAndAngles(this.posX+-10, this.posY+1, this.posZ+0, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var44);
                
                //blokje 6 10
                EntityExpBottle var45 = new EntityExpBottle(this.worldObj);
                var45.setLocationAndAngles(this.posX+-10, this.posY+1, this.posZ+1, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var45);
                
                //blokje 6 10
                EntityExpBottle var46 = new EntityExpBottle(this.worldObj);
                var46.setLocationAndAngles(this.posX+-10, this.posY+1, this.posZ+2, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var46);
                
                //blokje 6 10
                EntityExpBottle var47 = new EntityExpBottle(this.worldObj);
                var47.setLocationAndAngles(this.posX+-10, this.posY+1, this.posZ+3, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var47);
                
                //blokje 6 10
                EntityExpBottle var48 = new EntityExpBottle(this.worldObj);
                var48.setLocationAndAngles(this.posX+-9, this.posY+1, this.posZ+4, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var48);
                
                //blokje 6 10
                EntityExpBottle var49 = new EntityExpBottle(this.worldObj);
                var49.setLocationAndAngles(this.posX+-9, this.posY+1, this.posZ+5, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var49);
                
                //blokje 6 10
                EntityExpBottle var50 = new EntityExpBottle(this.worldObj);
                var50.setLocationAndAngles(this.posX+-8, this.posY+1, this.posZ+6, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var50);
                
                //blokje 6 10
                EntityExpBottle var51 = new EntityExpBottle(this.worldObj);
                var51.setLocationAndAngles(this.posX+-7, this.posY+1, this.posZ+7, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var51);
                
                //blokje 6 10
                EntityExpBottle var52 = new EntityExpBottle(this.worldObj);
                var52.setLocationAndAngles(this.posX+-6, this.posY+1, this.posZ+8, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var52);
                
                //blokje 6 10
                EntityExpBottle var53 = new EntityExpBottle(this.worldObj);
                var53.setLocationAndAngles(this.posX+-5, this.posY+1, this.posZ+9, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var53);
                
                //blokje 6 10
                EntityExpBottle var54 = new EntityExpBottle(this.worldObj);
                var54.setLocationAndAngles(this.posX+-4, this.posY+1, this.posZ+9, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var54);
                
                //blokje 6 10
                EntityExpBottle var55 = new EntityExpBottle(this.worldObj);
                var55.setLocationAndAngles(this.posX+-3, this.posY+1, this.posZ+10, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var55);
                
                //blokje 6 10
                EntityExpBottle var56 = new EntityExpBottle(this.worldObj);
                var56.setLocationAndAngles(this.posX+-2, this.posY+1, this.posZ+10, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var56);
                
                //blokje 6 10
                EntityExpBottle var57 = new EntityExpBottle(this.worldObj);
                var57.setLocationAndAngles(this.posX+-1, this.posY+1, this.posZ+10, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var57);

                //var3.setEntityHealth(this.getHealth());
                //var3.renderYawOffset = this.renderYawOffset;
            }

            return true;
        }
        
        if (var2 != null && var2.itemID == Items.glowstone_dust)
        {
            //this.setDead();

            if (!this.worldObj.isRemote)
            {
            	
            	worldObj.spawnParticle("smoke", this.posX+1, this.posY + 0.5D, this.posZ, 0.0D, 0.0D, 0.0D);
            	worldObj.spawnParticle("snowballpoof", this.posX, this.posY + 0.5D, this.posZ+1, 0.0D, 0.0D, 0.0D);
            	worldObj.spawnParticle("splash", this.posX+1, this.posY + 0.5D, this.posZ-1, 0.0D, 0.0D, 0.0D);
                worldObj.spawnParticle("bubble", this.posX, this.posY + 0.5D, this.posZ, 0.0D, 0.0D, 0.0D);
            	worldObj.spawnParticle("townaura", this.posX-1, this.posY + 0.5D, this.posZ+1, 0.0D, 0.0D, 0.0D);
            	worldObj.spawnParticle("flame", this.posX, this.posY + 0.5D, this.posZ-1, 0.0D, 0.0D, 0.0D);
            	worldObj.spawnParticle("happyVillager", this.posX-1, this.posY + 0.5D, this.posZ, 0.0D, 0.0D, 0.0D);
            	worldObj.spawnParticle("reddust", this.posX, this.posY + 0.5D, this.posZ+1, 0.0D, 0.0D, 0.0D);
            	worldObj.spawnParticle("lava", this.posX+1, this.posY + 0.5D, this.posZ-1, 0.0D, 0.0D, 0.0D);
            	worldObj.spawnParticle("magicCrit", this.posX, this.posY + 0.5D, this.posZ, 0.0D, 0.0D, 0.0D);
				par1EntityPlayer.inventory.consumeInventoryItem(Items.glowstone_dust);
                //var3.setEntityHealth(this.getHealth());
                //var3.renderYawOffset = this.renderYawOffset;
            }

            return true;
        }
        
        
        if (!super.interact(par1EntityPlayer))
        {
            if (getSaddled() && !worldObj.isRemote && (riddenByEntity == null || riddenByEntity == par1EntityPlayer))
            {
                par1EntityPlayer.mountEntity(this);
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return true;
        }
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected Item getDropItemId()
    {
        if (isBurning())
        {
            return Items.cooked_porkchop;
        }
        else
        {
            return Items.porkchop;
        }
    }

    /**
     * Returns true if the pig is saddled.
     */
    public boolean getSaddled()
    {
        return (dataWatcher.getWatchableObjectByte(16) & 1) != 0;
    }

    /**
     * Set or remove the saddle of the pig.
     */
    public void setSaddled(boolean par1)
    {
        if (par1)
        {
            dataWatcher.updateObject(16, Byte.valueOf((byte)1));
        }
        else
        {
            dataWatcher.updateObject(16, Byte.valueOf((byte)0));
        }
    }

    /**
     * Called when a lightning bolt hits the entity.
     */
    public void onStruckByLightning(EntityLightningBolt par1EntityLightningBolt)
    {
        if (worldObj.isRemote)
        {
            return;
        }
        else
        {
            EntityPigZombie entitypigzombie = new EntityPigZombie(worldObj);
            entitypigzombie.setLocationAndAngles(posX, posY, posZ, rotationYaw, rotationPitch);
            worldObj.spawnEntityInWorld(entitypigzombie);
            setDead();
            return;
        }
    }

    /**
     * Called when the mob is falling. Calculates and applies fall damage.
     */
    protected void fall(float par1)
    {
        super.fall(par1);

        if (par1 > 5F && (riddenByEntity instanceof EntityPlayer))
        {
            ((EntityPlayer)riddenByEntity).triggerAchievement(AchievementList.flyPig);
        }
    }
}
