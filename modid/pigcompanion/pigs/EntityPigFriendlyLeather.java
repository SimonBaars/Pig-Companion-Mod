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

public class EntityPigFriendlyLeather extends EntityMob {
   private final EntityAIControlledByPlayer aiControlledByPlayer;

   public EntityPigFriendlyLeather(World par1World) {
      super(par1World);
      this.func_70105_a(0.9F, 0.9F);
      this.func_70661_as().func_75491_a(true);
      float f = 0.25F;
      this.field_70714_bg.func_75776_a(0, new EntityAISwimming(this));
      this.field_70714_bg.func_75776_a(1, new EntityAIPanic(this, 0.3799999952316284D));
      this.field_70714_bg.func_75776_a(2, this.aiControlledByPlayer = new EntityAIControlledByPlayer(this, 0.5F));
      this.field_70714_bg.func_75776_a(3, new EntityAITempt(this, 0.4000000059604645D, Items.field_151015_O, false));
      this.field_70714_bg.func_75776_a(4, new EntityAITempt(this, 0.30000001192092896D, PigCompanionMod.potatoOnAStick, false));
      this.field_70714_bg.func_75776_a(4, new EntityAITempt(this, 0.30000001192092896D, Items.field_151174_bG, false));
      this.field_70714_bg.func_75776_a(5, new EntityAIWander(this, (double)f));
      this.field_70714_bg.func_75776_a(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
      this.field_70714_bg.func_75776_a(7, new EntityAILookIdle(this));
      this.field_70714_bg.func_75776_a(8, new EntityAIOpenDoor(this, true));
      this.field_70714_bg.func_75776_a(9, new EntityAIAttackOnCollide(this, EntityEnderman.class, 1.0D, true));
      this.field_70714_bg.func_75776_a(10, new EntityAIAttackOnCollide(this, EntityPigZombie.class, 1.0D, true));
      this.field_70714_bg.func_75776_a(11, new EntityAIAttackOnCollide(this, EntityBlaze.class, 1.0D, true));
      this.field_70714_bg.func_75776_a(12, new EntityAIAttackOnCollide(this, EntityCaveSpider.class, 1.0D, true));
      this.field_70714_bg.func_75776_a(13, new EntityAIAttackOnCollide(this, EntityCreeper.class, 1.0D, true));
      this.field_70714_bg.func_75776_a(14, new EntityAIAttackOnCollide(this, EntityGhast.class, 1.0D, true));
      this.field_70714_bg.func_75776_a(15, new EntityAIAttackOnCollide(this, EntityMagmaCube.class, 1.0D, true));
      this.field_70714_bg.func_75776_a(16, new EntityAIAttackOnCollide(this, EntitySilverfish.class, 1.0D, true));
      this.field_70714_bg.func_75776_a(17, new EntityAIAttackOnCollide(this, EntitySkeleton.class, 1.0D, true));
      this.field_70714_bg.func_75776_a(18, new EntityAIAttackOnCollide(this, EntitySlime.class, 1.0D, true));
      this.field_70714_bg.func_75776_a(19, new EntityAIAttackOnCollide(this, EntitySpider.class, 1.0D, true));
      this.field_70714_bg.func_75776_a(20, new EntityAIAttackOnCollide(this, EntityZombie.class, 1.0D, true));
      this.field_70714_bg.func_75776_a(21, new EntityAIAttackOnCollide(this, EntityBat.class, 1.0D, true));
      this.field_70714_bg.func_75776_a(22, new EntityAIAttackOnCollide(this, EntityWither.class, 1.0D, true));
      this.field_70714_bg.func_75776_a(23, new EntityAIAttackOnCollide(this, EntityWitch.class, 1.0D, true));
      this.field_70715_bh.func_75776_a(1, new EntityAINearestAttackableTarget(this, EntityEnderman.class, 0, false));
      this.field_70715_bh.func_75776_a(2, new EntityAINearestAttackableTarget(this, EntityPigZombie.class, 0, false));
      this.field_70715_bh.func_75776_a(3, new EntityAINearestAttackableTarget(this, EntityBlaze.class, 0, false));
      this.field_70715_bh.func_75776_a(4, new EntityAINearestAttackableTarget(this, EntityCaveSpider.class, 0, false));
      this.field_70715_bh.func_75776_a(5, new EntityAINearestAttackableTarget(this, EntityCreeper.class, 0, false));
      this.field_70715_bh.func_75776_a(6, new EntityAINearestAttackableTarget(this, EntityGhast.class, 0, false));
      this.field_70715_bh.func_75776_a(7, new EntityAINearestAttackableTarget(this, EntityMagmaCube.class, 0, false));
      this.field_70715_bh.func_75776_a(8, new EntityAINearestAttackableTarget(this, EntitySilverfish.class, 0, false));
      this.field_70715_bh.func_75776_a(9, new EntityAINearestAttackableTarget(this, EntitySkeleton.class, 0, false));
      this.field_70715_bh.func_75776_a(10, new EntityAINearestAttackableTarget(this, EntitySlime.class, 0, false));
      this.field_70715_bh.func_75776_a(11, new EntityAINearestAttackableTarget(this, EntitySpider.class, 0, false));
      this.field_70715_bh.func_75776_a(12, new EntityAINearestAttackableTarget(this, EntityZombie.class, 0, false));
      this.field_70715_bh.func_75776_a(13, new EntityAINearestAttackableTarget(this, EntityBat.class, 0, false));
      this.field_70715_bh.func_75776_a(14, new EntityAINearestAttackableTarget(this, EntityWither.class, 0, false));
      this.field_70715_bh.func_75776_a(15, new EntityAINearestAttackableTarget(this, EntityWitch.class, 0, false));
   }

   public int func_82193_c(Entity par1Entity) {
      return 6;
   }

   public boolean func_70650_aV() {
      return true;
   }

   public EntityPigFriendlyLeather spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
      return new EntityPigFriendlyLeather(this.field_70170_p);
   }

   protected void func_70088_a() {
      super.func_70088_a();
      this.field_70180_af.func_75682_a(16, (byte)0);
   }

   public EntityAIControlledByPlayer getAIControlledByPlayer() {
      return this.aiControlledByPlayer;
   }

   public void func_70014_b(NBTTagCompound par1NBTTagCompound) {
      super.func_70014_b(par1NBTTagCompound);
      par1NBTTagCompound.func_74757_a("Saddle", this.getSaddled());
   }

   public void func_70037_a(NBTTagCompound par1NBTTagCompound) {
      super.func_70037_a(par1NBTTagCompound);
      this.setSaddled(par1NBTTagCompound.func_74767_n("Saddle"));
   }

   protected String func_70639_aQ() {
      return "mob.pig";
   }

   protected String func_70621_aR() {
      return "mob.pig";
   }

   protected String func_70673_aS() {
      return "mob.pigdeath";
   }

   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
      ItemStack itemstack = par1EntityPlayer.field_71071_by.func_70448_g();
      if (itemstack != null && itemstack.func_77973_b() == Items.field_151016_H) {
         if (!this.field_70170_p.field_72995_K) {
            EntityTNTPrimed var3 = new EntityTNTPrimed(this.field_70170_p);
            var3.func_70012_b(this.field_70165_t, this.field_70163_u + 1.0D, this.field_70161_v + 10.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var3);
            EntityTNTPrimed var4 = new EntityTNTPrimed(this.field_70170_p);
            var4.func_70012_b(this.field_70165_t + 1.0D, this.field_70163_u + 1.0D, this.field_70161_v + 10.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var4);
            EntityTNTPrimed var5 = new EntityTNTPrimed(this.field_70170_p);
            var5.func_70012_b(this.field_70165_t + 2.0D, this.field_70163_u + 1.0D, this.field_70161_v + 10.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var5);
            EntityTNTPrimed var6 = new EntityTNTPrimed(this.field_70170_p);
            var6.func_70012_b(this.field_70165_t + 3.0D, this.field_70163_u + 1.0D, this.field_70161_v + 10.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var6);
            EntityTNTPrimed var7 = new EntityTNTPrimed(this.field_70170_p);
            var7.func_70012_b(this.field_70165_t + 4.0D, this.field_70163_u + 1.0D, this.field_70161_v + 9.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var7);
            EntityTNTPrimed var8 = new EntityTNTPrimed(this.field_70170_p);
            var8.func_70012_b(this.field_70165_t + 5.0D, this.field_70163_u + 1.0D, this.field_70161_v + 9.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var8);
            EntityTNTPrimed var9 = new EntityTNTPrimed(this.field_70170_p);
            var9.func_70012_b(this.field_70165_t + 6.0D, this.field_70163_u + 1.0D, this.field_70161_v + 8.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var9);
            EntityTNTPrimed var10 = new EntityTNTPrimed(this.field_70170_p);
            var10.func_70012_b(this.field_70165_t + 7.0D, this.field_70163_u + 1.0D, this.field_70161_v + 7.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var10);
            EntityTNTPrimed var11 = new EntityTNTPrimed(this.field_70170_p);
            var11.func_70012_b(this.field_70165_t + 8.0D, this.field_70163_u + 1.0D, this.field_70161_v + 6.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var11);
            EntityTNTPrimed var12 = new EntityTNTPrimed(this.field_70170_p);
            var12.func_70012_b(this.field_70165_t + 9.0D, this.field_70163_u + 1.0D, this.field_70161_v + 5.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var12);
            EntityTNTPrimed var13 = new EntityTNTPrimed(this.field_70170_p);
            var13.func_70012_b(this.field_70165_t + 9.0D, this.field_70163_u + 1.0D, this.field_70161_v + 4.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var13);
            EntityTNTPrimed var14 = new EntityTNTPrimed(this.field_70170_p);
            var14.func_70012_b(this.field_70165_t + 10.0D, this.field_70163_u + 3.0D, this.field_70161_v + 3.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var14);
            EntityTNTPrimed var15 = new EntityTNTPrimed(this.field_70170_p);
            var15.func_70012_b(this.field_70165_t + 10.0D, this.field_70163_u + 1.0D, this.field_70161_v + 2.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var15);
            EntityTNTPrimed var16 = new EntityTNTPrimed(this.field_70170_p);
            var16.func_70012_b(this.field_70165_t + 10.0D, this.field_70163_u + 1.0D, this.field_70161_v + 1.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var16);
            EntityTNTPrimed var17 = new EntityTNTPrimed(this.field_70170_p);
            var17.func_70012_b(this.field_70165_t + 10.0D, this.field_70163_u + 1.0D, this.field_70161_v + 0.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var17);
            EntityTNTPrimed var18 = new EntityTNTPrimed(this.field_70170_p);
            var18.func_70012_b(this.field_70165_t + 10.0D, this.field_70163_u + 1.0D, this.field_70161_v + -1.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var18);
            EntityTNTPrimed var19 = new EntityTNTPrimed(this.field_70170_p);
            var19.func_70012_b(this.field_70165_t + 10.0D, this.field_70163_u + 1.0D, this.field_70161_v + -2.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var19);
            EntityTNTPrimed var20 = new EntityTNTPrimed(this.field_70170_p);
            var20.func_70012_b(this.field_70165_t + 9.0D, this.field_70163_u + 1.0D, this.field_70161_v + -4.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var20);
            EntityTNTPrimed var21 = new EntityTNTPrimed(this.field_70170_p);
            var21.func_70012_b(this.field_70165_t + 9.0D, this.field_70163_u + 1.0D, this.field_70161_v + -5.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var21);
            EntityTNTPrimed var22 = new EntityTNTPrimed(this.field_70170_p);
            var22.func_70012_b(this.field_70165_t + 8.0D, this.field_70163_u + 1.0D, this.field_70161_v + -6.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var22);
            EntityTNTPrimed var23 = new EntityTNTPrimed(this.field_70170_p);
            var23.func_70012_b(this.field_70165_t + 7.0D, this.field_70163_u + 1.0D, this.field_70161_v + -7.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var23);
            EntityTNTPrimed var24 = new EntityTNTPrimed(this.field_70170_p);
            var24.func_70012_b(this.field_70165_t + 6.0D, this.field_70163_u + 1.0D, this.field_70161_v + -8.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var24);
            EntityTNTPrimed var25 = new EntityTNTPrimed(this.field_70170_p);
            var25.func_70012_b(this.field_70165_t + 5.0D, this.field_70163_u + 1.0D, this.field_70161_v + -9.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var25);
            EntityTNTPrimed var26 = new EntityTNTPrimed(this.field_70170_p);
            var26.func_70012_b(this.field_70165_t + 4.0D, this.field_70163_u + 1.0D, this.field_70161_v + -9.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var26);
            EntityTNTPrimed var27 = new EntityTNTPrimed(this.field_70170_p);
            var27.func_70012_b(this.field_70165_t + 3.0D, this.field_70163_u + 1.0D, this.field_70161_v + -10.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var27);
            EntityTNTPrimed var28 = new EntityTNTPrimed(this.field_70170_p);
            var28.func_70012_b(this.field_70165_t + 2.0D, this.field_70163_u + 1.0D, this.field_70161_v + -10.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var28);
            EntityTNTPrimed var29 = new EntityTNTPrimed(this.field_70170_p);
            var29.func_70012_b(this.field_70165_t + 1.0D, this.field_70163_u + 1.0D, this.field_70161_v + -10.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var29);
            EntityTNTPrimed var30 = new EntityTNTPrimed(this.field_70170_p);
            var30.func_70012_b(this.field_70165_t + 0.0D, this.field_70163_u + 1.0D, this.field_70161_v + -10.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var30);
            EntityTNTPrimed var31 = new EntityTNTPrimed(this.field_70170_p);
            var31.func_70012_b(this.field_70165_t + -1.0D, this.field_70163_u + 1.0D, this.field_70161_v + -10.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var31);
            EntityTNTPrimed var32 = new EntityTNTPrimed(this.field_70170_p);
            var32.func_70012_b(this.field_70165_t + -2.0D, this.field_70163_u + 1.0D, this.field_70161_v + -10.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var32);
            EntityTNTPrimed var33 = new EntityTNTPrimed(this.field_70170_p);
            var33.func_70012_b(this.field_70165_t + -3.0D, this.field_70163_u + 1.0D, this.field_70161_v + -10.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var33);
            EntityTNTPrimed var34 = new EntityTNTPrimed(this.field_70170_p);
            var34.func_70012_b(this.field_70165_t + -4.0D, this.field_70163_u + 1.0D, this.field_70161_v + -9.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var34);
            EntityTNTPrimed var35 = new EntityTNTPrimed(this.field_70170_p);
            var35.func_70012_b(this.field_70165_t + -5.0D, this.field_70163_u + 1.0D, this.field_70161_v + -9.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var35);
            EntityTNTPrimed var36 = new EntityTNTPrimed(this.field_70170_p);
            var36.func_70012_b(this.field_70165_t + -6.0D, this.field_70163_u + 1.0D, this.field_70161_v + -8.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var36);
            EntityTNTPrimed var37 = new EntityTNTPrimed(this.field_70170_p);
            var37.func_70012_b(this.field_70165_t + -7.0D, this.field_70163_u + 1.0D, this.field_70161_v + -7.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var37);
            EntityTNTPrimed var38 = new EntityTNTPrimed(this.field_70170_p);
            var38.func_70012_b(this.field_70165_t + -8.0D, this.field_70163_u + 1.0D, this.field_70161_v + -6.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var38);
            EntityTNTPrimed var39 = new EntityTNTPrimed(this.field_70170_p);
            var39.func_70012_b(this.field_70165_t + -9.0D, this.field_70163_u + 1.0D, this.field_70161_v + -5.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var39);
            EntityTNTPrimed var40 = new EntityTNTPrimed(this.field_70170_p);
            var40.func_70012_b(this.field_70165_t + -9.0D, this.field_70163_u + 1.0D, this.field_70161_v + -4.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var40);
            EntityTNTPrimed var41 = new EntityTNTPrimed(this.field_70170_p);
            var41.func_70012_b(this.field_70165_t + -10.0D, this.field_70163_u + 1.0D, this.field_70161_v + -3.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var41);
            EntityTNTPrimed var42 = new EntityTNTPrimed(this.field_70170_p);
            var42.func_70012_b(this.field_70165_t + -10.0D, this.field_70163_u + 1.0D, this.field_70161_v + -2.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var42);
            EntityTNTPrimed var43 = new EntityTNTPrimed(this.field_70170_p);
            var43.func_70012_b(this.field_70165_t + -10.0D, this.field_70163_u + 1.0D, this.field_70161_v + -1.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var43);
            EntityTNTPrimed var44 = new EntityTNTPrimed(this.field_70170_p);
            var44.func_70012_b(this.field_70165_t + -10.0D, this.field_70163_u + 1.0D, this.field_70161_v + 0.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var44);
            EntityTNTPrimed var45 = new EntityTNTPrimed(this.field_70170_p);
            var45.func_70012_b(this.field_70165_t + -10.0D, this.field_70163_u + 1.0D, this.field_70161_v + 1.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var45);
            EntityTNTPrimed var46 = new EntityTNTPrimed(this.field_70170_p);
            var46.func_70012_b(this.field_70165_t + -10.0D, this.field_70163_u + 1.0D, this.field_70161_v + 2.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var46);
            EntityTNTPrimed var47 = new EntityTNTPrimed(this.field_70170_p);
            var47.func_70012_b(this.field_70165_t + -10.0D, this.field_70163_u + 1.0D, this.field_70161_v + 3.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var47);
            EntityTNTPrimed var48 = new EntityTNTPrimed(this.field_70170_p);
            var48.func_70012_b(this.field_70165_t + -9.0D, this.field_70163_u + 1.0D, this.field_70161_v + 4.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var48);
            EntityTNTPrimed var49 = new EntityTNTPrimed(this.field_70170_p);
            var49.func_70012_b(this.field_70165_t + -9.0D, this.field_70163_u + 1.0D, this.field_70161_v + 5.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var49);
            EntityTNTPrimed var50 = new EntityTNTPrimed(this.field_70170_p);
            var50.func_70012_b(this.field_70165_t + -8.0D, this.field_70163_u + 1.0D, this.field_70161_v + 6.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var50);
            EntityTNTPrimed var51 = new EntityTNTPrimed(this.field_70170_p);
            var51.func_70012_b(this.field_70165_t + -7.0D, this.field_70163_u + 1.0D, this.field_70161_v + 7.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var51);
            EntityTNTPrimed var52 = new EntityTNTPrimed(this.field_70170_p);
            var52.func_70012_b(this.field_70165_t + -6.0D, this.field_70163_u + 1.0D, this.field_70161_v + 8.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var52);
            EntityTNTPrimed var53 = new EntityTNTPrimed(this.field_70170_p);
            var53.func_70012_b(this.field_70165_t + -5.0D, this.field_70163_u + 1.0D, this.field_70161_v + 9.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var53);
            EntityTNTPrimed var54 = new EntityTNTPrimed(this.field_70170_p);
            var54.func_70012_b(this.field_70165_t + -4.0D, this.field_70163_u + 1.0D, this.field_70161_v + 9.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var54);
            EntityTNTPrimed var55 = new EntityTNTPrimed(this.field_70170_p);
            var55.func_70012_b(this.field_70165_t + -3.0D, this.field_70163_u + 1.0D, this.field_70161_v + 10.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var55);
            EntityTNTPrimed var56 = new EntityTNTPrimed(this.field_70170_p);
            var56.func_70012_b(this.field_70165_t + -2.0D, this.field_70163_u + 1.0D, this.field_70161_v + 10.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var56);
            EntityTNTPrimed var57 = new EntityTNTPrimed(this.field_70170_p);
            var57.func_70012_b(this.field_70165_t + -1.0D, this.field_70163_u + 1.0D, this.field_70161_v + 10.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var57);
            par1EntityPlayer.field_71071_by.func_146026_a(Items.field_151016_H);
            par1EntityPlayer.field_71071_by.func_146026_a(Items.field_151016_H);
            par1EntityPlayer.field_71071_by.func_146026_a(Items.field_151016_H);
            par1EntityPlayer.field_71071_by.func_146026_a(Items.field_151016_H);
            par1EntityPlayer.field_71071_by.func_146026_a(Items.field_151016_H);
            par1EntityPlayer.field_71071_by.func_146026_a(Items.field_151016_H);
            par1EntityPlayer.field_71071_by.func_146026_a(Items.field_151016_H);
            par1EntityPlayer.field_71071_by.func_146026_a(Items.field_151016_H);
            par1EntityPlayer.field_71071_by.func_146026_a(Items.field_151016_H);
         }

         return true;
      } else if (itemstack != null && itemstack.func_77973_b() == Items.field_151008_G) {
         if (!this.field_70170_p.field_72995_K) {
            double RandNumber = Math.random() * 100.0D;
            par1EntityPlayer.field_71071_by.func_146026_a(Items.field_151008_G);
            if (RandNumber < 25.0D) {
               this.field_70159_w += 5.0D;
            } else if (RandNumber < 50.0D) {
               this.field_70159_w -= 5.0D;
            } else if (RandNumber < 75.0D) {
               this.field_70179_y += 5.0D;
            } else {
               this.field_70179_y -= 5.0D;
            }
         }

         return true;
      } else if (itemstack != null && itemstack.func_77973_b() == Items.field_151062_by) {
         if (!this.field_70170_p.field_72995_K) {
            par1EntityPlayer.field_71071_by.func_146026_a(Items.field_151062_by);
            par1EntityPlayer.field_71071_by.func_146026_a(Items.field_151062_by);
            par1EntityPlayer.field_71071_by.func_146026_a(Items.field_151062_by);
            par1EntityPlayer.field_71071_by.func_146026_a(Items.field_151062_by);
            par1EntityPlayer.field_71071_by.func_146026_a(Items.field_151062_by);
            EntityExpBottle var3 = new EntityExpBottle(this.field_70170_p);
            var3.func_70012_b(this.field_70165_t, this.field_70163_u + 1.0D, this.field_70161_v + 10.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var3);
            EntityExpBottle var4 = new EntityExpBottle(this.field_70170_p);
            var4.func_70012_b(this.field_70165_t + 1.0D, this.field_70163_u + 1.0D, this.field_70161_v + 10.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var4);
            EntityExpBottle var5 = new EntityExpBottle(this.field_70170_p);
            var5.func_70012_b(this.field_70165_t + 2.0D, this.field_70163_u + 1.0D, this.field_70161_v + 10.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var5);
            EntityExpBottle var6 = new EntityExpBottle(this.field_70170_p);
            var6.func_70012_b(this.field_70165_t + 3.0D, this.field_70163_u + 1.0D, this.field_70161_v + 10.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var6);
            EntityExpBottle var7 = new EntityExpBottle(this.field_70170_p);
            var7.func_70012_b(this.field_70165_t + 4.0D, this.field_70163_u + 1.0D, this.field_70161_v + 9.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var7);
            EntityExpBottle var8 = new EntityExpBottle(this.field_70170_p);
            var8.func_70012_b(this.field_70165_t + 5.0D, this.field_70163_u + 1.0D, this.field_70161_v + 9.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var8);
            EntityExpBottle var9 = new EntityExpBottle(this.field_70170_p);
            var9.func_70012_b(this.field_70165_t + 6.0D, this.field_70163_u + 1.0D, this.field_70161_v + 8.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var9);
            EntityExpBottle var10 = new EntityExpBottle(this.field_70170_p);
            var10.func_70012_b(this.field_70165_t + 7.0D, this.field_70163_u + 1.0D, this.field_70161_v + 7.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var10);
            EntityExpBottle var11 = new EntityExpBottle(this.field_70170_p);
            var11.func_70012_b(this.field_70165_t + 8.0D, this.field_70163_u + 1.0D, this.field_70161_v + 6.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var11);
            EntityExpBottle var12 = new EntityExpBottle(this.field_70170_p);
            var12.func_70012_b(this.field_70165_t + 9.0D, this.field_70163_u + 1.0D, this.field_70161_v + 5.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var12);
            EntityExpBottle var13 = new EntityExpBottle(this.field_70170_p);
            var13.func_70012_b(this.field_70165_t + 9.0D, this.field_70163_u + 1.0D, this.field_70161_v + 4.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var13);
            EntityExpBottle var14 = new EntityExpBottle(this.field_70170_p);
            var14.func_70012_b(this.field_70165_t + 10.0D, this.field_70163_u + 3.0D, this.field_70161_v + 3.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var14);
            EntityExpBottle var15 = new EntityExpBottle(this.field_70170_p);
            var15.func_70012_b(this.field_70165_t + 10.0D, this.field_70163_u + 1.0D, this.field_70161_v + 2.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var15);
            EntityExpBottle var16 = new EntityExpBottle(this.field_70170_p);
            var16.func_70012_b(this.field_70165_t + 10.0D, this.field_70163_u + 1.0D, this.field_70161_v + 1.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var16);
            EntityExpBottle var17 = new EntityExpBottle(this.field_70170_p);
            var17.func_70012_b(this.field_70165_t + 10.0D, this.field_70163_u + 1.0D, this.field_70161_v + 0.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var17);
            EntityExpBottle var18 = new EntityExpBottle(this.field_70170_p);
            var18.func_70012_b(this.field_70165_t + 10.0D, this.field_70163_u + 1.0D, this.field_70161_v + -1.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var18);
            EntityExpBottle var19 = new EntityExpBottle(this.field_70170_p);
            var19.func_70012_b(this.field_70165_t + 10.0D, this.field_70163_u + 1.0D, this.field_70161_v + -2.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var19);
            EntityExpBottle var20 = new EntityExpBottle(this.field_70170_p);
            var20.func_70012_b(this.field_70165_t + 9.0D, this.field_70163_u + 1.0D, this.field_70161_v + -4.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var20);
            EntityExpBottle var21 = new EntityExpBottle(this.field_70170_p);
            var21.func_70012_b(this.field_70165_t + 9.0D, this.field_70163_u + 1.0D, this.field_70161_v + -5.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var21);
            EntityExpBottle var22 = new EntityExpBottle(this.field_70170_p);
            var22.func_70012_b(this.field_70165_t + 8.0D, this.field_70163_u + 1.0D, this.field_70161_v + -6.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var22);
            EntityExpBottle var23 = new EntityExpBottle(this.field_70170_p);
            var23.func_70012_b(this.field_70165_t + 7.0D, this.field_70163_u + 1.0D, this.field_70161_v + -7.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var23);
            EntityExpBottle var24 = new EntityExpBottle(this.field_70170_p);
            var24.func_70012_b(this.field_70165_t + 6.0D, this.field_70163_u + 1.0D, this.field_70161_v + -8.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var24);
            EntityExpBottle var25 = new EntityExpBottle(this.field_70170_p);
            var25.func_70012_b(this.field_70165_t + 5.0D, this.field_70163_u + 1.0D, this.field_70161_v + -9.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var25);
            EntityExpBottle var26 = new EntityExpBottle(this.field_70170_p);
            var26.func_70012_b(this.field_70165_t + 4.0D, this.field_70163_u + 1.0D, this.field_70161_v + -9.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var26);
            EntityExpBottle var27 = new EntityExpBottle(this.field_70170_p);
            var27.func_70012_b(this.field_70165_t + 3.0D, this.field_70163_u + 1.0D, this.field_70161_v + -10.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var27);
            EntityExpBottle var28 = new EntityExpBottle(this.field_70170_p);
            var28.func_70012_b(this.field_70165_t + 2.0D, this.field_70163_u + 1.0D, this.field_70161_v + -10.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var28);
            EntityExpBottle var29 = new EntityExpBottle(this.field_70170_p);
            var29.func_70012_b(this.field_70165_t + 1.0D, this.field_70163_u + 1.0D, this.field_70161_v + -10.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var29);
            EntityExpBottle var30 = new EntityExpBottle(this.field_70170_p);
            var30.func_70012_b(this.field_70165_t + 0.0D, this.field_70163_u + 1.0D, this.field_70161_v + -10.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var30);
            EntityExpBottle var31 = new EntityExpBottle(this.field_70170_p);
            var31.func_70012_b(this.field_70165_t + -1.0D, this.field_70163_u + 1.0D, this.field_70161_v + -10.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var31);
            EntityExpBottle var32 = new EntityExpBottle(this.field_70170_p);
            var32.func_70012_b(this.field_70165_t + -2.0D, this.field_70163_u + 1.0D, this.field_70161_v + -10.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var32);
            EntityExpBottle var33 = new EntityExpBottle(this.field_70170_p);
            var33.func_70012_b(this.field_70165_t + -3.0D, this.field_70163_u + 1.0D, this.field_70161_v + -10.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var33);
            EntityExpBottle var34 = new EntityExpBottle(this.field_70170_p);
            var34.func_70012_b(this.field_70165_t + -4.0D, this.field_70163_u + 1.0D, this.field_70161_v + -9.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var34);
            EntityExpBottle var35 = new EntityExpBottle(this.field_70170_p);
            var35.func_70012_b(this.field_70165_t + -5.0D, this.field_70163_u + 1.0D, this.field_70161_v + -9.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var35);
            EntityExpBottle var36 = new EntityExpBottle(this.field_70170_p);
            var36.func_70012_b(this.field_70165_t + -6.0D, this.field_70163_u + 1.0D, this.field_70161_v + -8.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var36);
            EntityExpBottle var37 = new EntityExpBottle(this.field_70170_p);
            var37.func_70012_b(this.field_70165_t + -7.0D, this.field_70163_u + 1.0D, this.field_70161_v + -7.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var37);
            EntityExpBottle var38 = new EntityExpBottle(this.field_70170_p);
            var38.func_70012_b(this.field_70165_t + -8.0D, this.field_70163_u + 1.0D, this.field_70161_v + -6.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var38);
            EntityExpBottle var39 = new EntityExpBottle(this.field_70170_p);
            var39.func_70012_b(this.field_70165_t + -9.0D, this.field_70163_u + 1.0D, this.field_70161_v + -5.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var39);
            EntityExpBottle var40 = new EntityExpBottle(this.field_70170_p);
            var40.func_70012_b(this.field_70165_t + -9.0D, this.field_70163_u + 1.0D, this.field_70161_v + -4.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var40);
            EntityExpBottle var41 = new EntityExpBottle(this.field_70170_p);
            var41.func_70012_b(this.field_70165_t + -10.0D, this.field_70163_u + 1.0D, this.field_70161_v + -3.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var41);
            EntityExpBottle var42 = new EntityExpBottle(this.field_70170_p);
            var42.func_70012_b(this.field_70165_t + -10.0D, this.field_70163_u + 1.0D, this.field_70161_v + -2.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var42);
            EntityExpBottle var43 = new EntityExpBottle(this.field_70170_p);
            var43.func_70012_b(this.field_70165_t + -10.0D, this.field_70163_u + 1.0D, this.field_70161_v + -1.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var43);
            EntityExpBottle var44 = new EntityExpBottle(this.field_70170_p);
            var44.func_70012_b(this.field_70165_t + -10.0D, this.field_70163_u + 1.0D, this.field_70161_v + 0.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var44);
            EntityExpBottle var45 = new EntityExpBottle(this.field_70170_p);
            var45.func_70012_b(this.field_70165_t + -10.0D, this.field_70163_u + 1.0D, this.field_70161_v + 1.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var45);
            EntityExpBottle var46 = new EntityExpBottle(this.field_70170_p);
            var46.func_70012_b(this.field_70165_t + -10.0D, this.field_70163_u + 1.0D, this.field_70161_v + 2.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var46);
            EntityExpBottle var47 = new EntityExpBottle(this.field_70170_p);
            var47.func_70012_b(this.field_70165_t + -10.0D, this.field_70163_u + 1.0D, this.field_70161_v + 3.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var47);
            EntityExpBottle var48 = new EntityExpBottle(this.field_70170_p);
            var48.func_70012_b(this.field_70165_t + -9.0D, this.field_70163_u + 1.0D, this.field_70161_v + 4.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var48);
            EntityExpBottle var49 = new EntityExpBottle(this.field_70170_p);
            var49.func_70012_b(this.field_70165_t + -9.0D, this.field_70163_u + 1.0D, this.field_70161_v + 5.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var49);
            EntityExpBottle var50 = new EntityExpBottle(this.field_70170_p);
            var50.func_70012_b(this.field_70165_t + -8.0D, this.field_70163_u + 1.0D, this.field_70161_v + 6.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var50);
            EntityExpBottle var51 = new EntityExpBottle(this.field_70170_p);
            var51.func_70012_b(this.field_70165_t + -7.0D, this.field_70163_u + 1.0D, this.field_70161_v + 7.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var51);
            EntityExpBottle var52 = new EntityExpBottle(this.field_70170_p);
            var52.func_70012_b(this.field_70165_t + -6.0D, this.field_70163_u + 1.0D, this.field_70161_v + 8.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var52);
            EntityExpBottle var53 = new EntityExpBottle(this.field_70170_p);
            var53.func_70012_b(this.field_70165_t + -5.0D, this.field_70163_u + 1.0D, this.field_70161_v + 9.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var53);
            EntityExpBottle var54 = new EntityExpBottle(this.field_70170_p);
            var54.func_70012_b(this.field_70165_t + -4.0D, this.field_70163_u + 1.0D, this.field_70161_v + 9.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var54);
            EntityExpBottle var55 = new EntityExpBottle(this.field_70170_p);
            var55.func_70012_b(this.field_70165_t + -3.0D, this.field_70163_u + 1.0D, this.field_70161_v + 10.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var55);
            EntityExpBottle var56 = new EntityExpBottle(this.field_70170_p);
            var56.func_70012_b(this.field_70165_t + -2.0D, this.field_70163_u + 1.0D, this.field_70161_v + 10.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var56);
            EntityExpBottle var57 = new EntityExpBottle(this.field_70170_p);
            var57.func_70012_b(this.field_70165_t + -1.0D, this.field_70163_u + 1.0D, this.field_70161_v + 10.0D, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d(var57);
         }

         return true;
      } else if (itemstack != null && itemstack.func_77973_b() == Items.field_151114_aO) {
         if (!this.field_70170_p.field_72995_K) {
            this.field_70170_p.func_72869_a("smoke", this.field_70165_t + 1.0D, this.field_70163_u + 0.5D, this.field_70161_v, 0.0D, 0.0D, 0.0D);
            this.field_70170_p.func_72869_a("snowballpoof", this.field_70165_t, this.field_70163_u + 0.5D, this.field_70161_v + 1.0D, 0.0D, 0.0D, 0.0D);
            this.field_70170_p.func_72869_a("splash", this.field_70165_t + 1.0D, this.field_70163_u + 0.5D, this.field_70161_v - 1.0D, 0.0D, 0.0D, 0.0D);
            this.field_70170_p.func_72869_a("bubble", this.field_70165_t, this.field_70163_u + 0.5D, this.field_70161_v, 0.0D, 0.0D, 0.0D);
            this.field_70170_p.func_72869_a("townaura", this.field_70165_t - 1.0D, this.field_70163_u + 0.5D, this.field_70161_v + 1.0D, 0.0D, 0.0D, 0.0D);
            this.field_70170_p.func_72869_a("flame", this.field_70165_t, this.field_70163_u + 0.5D, this.field_70161_v - 1.0D, 0.0D, 0.0D, 0.0D);
            this.field_70170_p.func_72869_a("happyVillager", this.field_70165_t - 1.0D, this.field_70163_u + 0.5D, this.field_70161_v, 0.0D, 0.0D, 0.0D);
            this.field_70170_p.func_72869_a("reddust", this.field_70165_t, this.field_70163_u + 0.5D, this.field_70161_v + 1.0D, 0.0D, 0.0D, 0.0D);
            this.field_70170_p.func_72869_a("lava", this.field_70165_t + 1.0D, this.field_70163_u + 0.5D, this.field_70161_v - 1.0D, 0.0D, 0.0D, 0.0D);
            this.field_70170_p.func_72869_a("magicCrit", this.field_70165_t, this.field_70163_u + 0.5D, this.field_70161_v, 0.0D, 0.0D, 0.0D);
            par1EntityPlayer.field_71071_by.func_146026_a(Items.field_151114_aO);
         }

         return true;
      } else if (super.func_70085_c(par1EntityPlayer)) {
         return true;
      } else if (!this.getSaddled() || this.field_70170_p.field_72995_K || this.field_70153_n != null && this.field_70153_n != par1EntityPlayer) {
         return false;
      } else {
         par1EntityPlayer.func_70078_a(this);
         return true;
      }
   }

   protected Item getDropItemId() {
      return this.func_70027_ad() ? Items.field_151157_am : Items.field_151147_al;
   }

   public boolean getSaddled() {
      return (this.field_70180_af.func_75683_a(16) & 1) != 0;
   }

   public void setSaddled(boolean par1) {
      if (par1) {
         this.field_70180_af.func_75692_b(16, (byte)1);
      } else {
         this.field_70180_af.func_75692_b(16, (byte)0);
      }

   }

   public void func_70077_a(EntityLightningBolt par1EntityLightningBolt) {
      if (!this.field_70170_p.field_72995_K) {
         EntityPigZombie entitypigzombie = new EntityPigZombie(this.field_70170_p);
         entitypigzombie.func_70012_b(this.field_70165_t, this.field_70163_u, this.field_70161_v, this.field_70177_z, this.field_70125_A);
         this.field_70170_p.func_72838_d(entitypigzombie);
         this.func_70106_y();
      }
   }

   protected void func_70069_a(float par1) {
      super.func_70069_a(par1);
      if (par1 > 5.0F && this.field_70153_n instanceof EntityPlayer) {
         ((EntityPlayer)this.field_70153_n).func_71029_a(AchievementList.field_76021_u);
      }

   }
}
