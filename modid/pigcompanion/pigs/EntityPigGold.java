package modid.pigcompanion.pigs;

import modid.pigcompanion.core.PigCompanionMod;

public class EntityPigGold extends rp {
   private final pl aiControlledByPlayer;

   public EntityPigGold(abw par1World) {
      super(par1World);
      this.a(0.9F, 0.9F);
      this.k().a(true);
      float f = 0.25F;
      this.c.a(0, new pp(this));
      this.c.a(4, new qu(this, 0.30000001192092896D, PigCompanionMod.potatoOnAStick.cv, false));
      this.c.a(4, new qu(this, 0.30000001192092896D, yc.bN.cv, false));
      this.c.a(1, new qj(this, 0.3799999952316284D));
      this.c.a(2, this.aiControlledByPlayer = new pl(this, 0.34F));
      this.c.a(2, new pk(this, (double)f));
      this.c.a(3, new qu(this, 0.4000000059604645D, yc.V.cv, false));
      this.c.a(4, new pr(this, 0.2800000011920929D));
      this.c.a(5, new qm(this, (double)f));
      this.c.a(6, new px(this, uf.class, 6.0F));
      this.c.a(7, new ql(this));
   }

   public boolean bf() {
      return true;
   }

   public boolean by() {
      ye var1 = ((uf)this.n).aZ();
      return var1 != null && var1.d == PigCompanionMod.potatoOnAStick.cv;
   }

   public pl getAIControlledByPlayer() {
      return this.aiControlledByPlayer;
   }

   protected void a() {
      super.a();
      this.ah.a(16, (byte)0);
   }

   public void b(by par1NBTTagCompound) {
      super.b(par1NBTTagCompound);
      par1NBTTagCompound.a("Saddle", this.getSaddled());
   }

   public void a(by par1NBTTagCompound) {
      super.a(par1NBTTagCompound);
      this.setSaddled(par1NBTTagCompound.n("Saddle"));
   }

   protected String r() {
      return "mob.pig";
   }

   protected String aO() {
      return "mob.pig";
   }

   protected String aP() {
      return "mob.pigdeath";
   }

   public boolean a(uf par1EntityPlayer) {
      ye var2 = par1EntityPlayer.bn.h();
      if (var2 != null && var2.d == yc.U.cv && this.b() >= 0) {
         this.x();
         if (!this.q.I) {
            EntityPigFriendlyGold var3 = new EntityPigFriendlyGold(this.q);
            var3.b(this.u, this.v, this.w, this.A, this.B);
            par1EntityPlayer.bn.d(yc.U.cv);
            var3.aN = this.aN;
            this.q.d(var3);
         }

         return true;
      } else if (super.a(par1EntityPlayer)) {
         return true;
      } else if (!this.getSaddled() || this.q.I || this.n != null && this.n != par1EntityPlayer) {
         return false;
      } else {
         par1EntityPlayer.a(this);
         return true;
      }
   }

   protected int s() {
      return this.af() ? yc.at.cv : yc.as.cv;
   }

   public boolean getSaddled() {
      return (this.ah.a(16) & 1) != 0;
   }

   public void setSaddled(boolean par1) {
      if (par1) {
         this.ah.b(16, (byte)1);
      } else {
         this.ah.b(16, (byte)0);
      }

   }

   public void a(sp par1EntityLightningBolt) {
      if (!this.q.I) {
         tn entitypigzombie = new tn(this.q);
         entitypigzombie.b(this.u, this.v, this.w, this.A, this.B);
         this.q.d(entitypigzombie);
         this.x();
      }
   }

   protected void b(float par1) {
      super.b(par1);
      if (par1 > 5.0F && this.n instanceof uf) {
         ((uf)this.n).a(kp.u);
      }

   }

   public EntityPigGold spawnBabyAnimal(nk par1EntityAgeable) {
      return new EntityPigGold(this.q);
   }

   public nk a(nk par1EntityAgeable) {
      return this.spawnBabyAnimal(par1EntityAgeable);
   }
}
