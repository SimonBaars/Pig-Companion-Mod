package modid.pigcompanion.pigs;

import modid.pigcompanion.core.PigCompanionMod;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.EntityAIControlledByPlayer;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.AchievementList;
import net.minecraft.world.World;

public class EntityPigDiamond extends EntityAnimal {
   private final EntityAIControlledByPlayer aiControlledByPlayer;

   public EntityPigDiamond(World par1World) {
      super(par1World);
      this.func_70105_a(0.9F, 0.9F);
      this.func_70661_as().func_75491_a(true);
      float f = 0.25F;
      this.field_70714_bg.func_75776_a(0, new EntityAISwimming(this));
      this.field_70714_bg.func_75776_a(4, new EntityAITempt(this, 0.30000001192092896D, PigCompanionMod.potatoOnAStick, false));
      this.field_70714_bg.func_75776_a(4, new EntityAITempt(this, 0.30000001192092896D, Items.field_151174_bG, false));
      this.field_70714_bg.func_75776_a(1, new EntityAIPanic(this, 0.3799999952316284D));
      this.field_70714_bg.func_75776_a(2, this.aiControlledByPlayer = new EntityAIControlledByPlayer(this, 0.34F));
      this.field_70714_bg.func_75776_a(2, new EntityAIMate(this, (double)f));
      this.field_70714_bg.func_75776_a(3, new EntityAITempt(this, 0.4000000059604645D, Items.field_151015_O, false));
      this.field_70714_bg.func_75776_a(4, new EntityAIFollowParent(this, 0.2800000011920929D));
      this.field_70714_bg.func_75776_a(5, new EntityAIWander(this, (double)f));
      this.field_70714_bg.func_75776_a(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
      this.field_70714_bg.func_75776_a(7, new EntityAILookIdle(this));
   }

   public boolean func_70650_aV() {
      return true;
   }

   protected void func_70088_a() {
      super.func_70088_a();
      this.field_70180_af.func_75682_a(16, (byte)0);
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
      if (itemstack != null && itemstack.func_77973_b() == Items.field_151014_N) {
         this.func_70106_y();
         if (!this.field_70170_p.field_72995_K) {
            EntityPigFriendlyDiamond var3 = new EntityPigFriendlyDiamond(this.field_70170_p);
            var3.func_70012_b(this.field_70165_t, this.field_70163_u, this.field_70161_v, this.field_70177_z, this.field_70125_A);
            par1EntityPlayer.field_71071_by.func_146026_a(Items.field_151014_N);
            var3.field_70761_aq = this.field_70761_aq;
            this.field_70170_p.func_72838_d(var3);
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

   public EntityPigDiamond spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
      return new EntityPigDiamond(this.field_70170_p);
   }

   public EntityAgeable func_90011_a(EntityAgeable par1EntityAgeable) {
      return this.spawnBabyAnimal(par1EntityAgeable);
   }

   public EntityAIControlledByPlayer getAIControlledByPlayer() {
      return this.aiControlledByPlayer;
   }
}
