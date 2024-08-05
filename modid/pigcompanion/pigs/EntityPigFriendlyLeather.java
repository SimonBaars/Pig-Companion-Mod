package modid.pigcompanion.pigs;

import modid.pigcompanion.core.PigCompanionMod;

public class EntityPigFriendlyLeather extends tm {
   private final pl aiControlledByPlayer;

   public EntityPigFriendlyLeather(abw par1World) {
      super(par1World);
      this.a(0.9F, 0.9F);
      this.k().a(true);
      float f = 0.25F;
      this.c.a(0, new pp(this));
      this.c.a(1, new qj(this, 0.3799999952316284D));
      this.c.a(2, this.aiControlledByPlayer = new pl(this, 0.5F));
      this.c.a(3, new qu(this, 0.4000000059604645D, yc.V.cv, false));
      this.c.a(4, new qu(this, 0.30000001192092896D, PigCompanionMod.potatoOnAStick.cv, false));
      this.c.a(4, new qu(this, 0.30000001192092896D, yc.bN.cv, false));
      this.c.a(5, new qm(this, (double)f));
      this.c.a(6, new px(this, uf.class, 6.0F));
      this.c.a(7, new ql(this));
      this.c.a(8, new qi(this, true));
      this.c.a(9, new qa(this, tg.class, 1.0D, true));
      this.c.a(10, new qa(this, tn.class, 1.0D, true));
      this.c.a(11, new qa(this, td.class, 1.0D, true));
      this.c.a(12, new qa(this, te.class, 1.0D, true));
      this.c.a(13, new qa(this, tf.class, 1.0D, true));
      this.c.a(14, new qa(this, tj.class, 1.0D, true));
      this.c.a(15, new qa(this, tl.class, 1.0D, true));
      this.c.a(16, new qa(this, tq.class, 1.0D, true));
      this.c.a(17, new qa(this, tr.class, 1.0D, true));
      this.c.a(18, new qa(this, ts.class, 1.0D, true));
      this.c.a(19, new qa(this, tt.class, 1.0D, true));
      this.c.a(20, new qa(this, tw.class, 1.0D, true));
      this.c.a(21, new qa(this, ro.class, 1.0D, true));
      this.c.a(22, new qa(this, sm.class, 1.0D, true));
      this.c.a(23, new qa(this, tv.class, 1.0D, true));
      this.d.a(1, new qy(this, tg.class, 0, false));
      this.d.a(2, new qy(this, tn.class, 0, false));
      this.d.a(3, new qy(this, td.class, 0, false));
      this.d.a(4, new qy(this, te.class, 0, false));
      this.d.a(5, new qy(this, tf.class, 0, false));
      this.d.a(6, new qy(this, tj.class, 0, false));
      this.d.a(7, new qy(this, tl.class, 0, false));
      this.d.a(8, new qy(this, tq.class, 0, false));
      this.d.a(9, new qy(this, tr.class, 0, false));
      this.d.a(10, new qy(this, ts.class, 0, false));
      this.d.a(11, new qy(this, tt.class, 0, false));
      this.d.a(12, new qy(this, tw.class, 0, false));
      this.d.a(13, new qy(this, ro.class, 0, false));
      this.d.a(14, new qy(this, sm.class, 0, false));
      this.d.a(15, new qy(this, tv.class, 0, false));
   }

   public int func_82193_c(nn par1Entity) {
      return 6;
   }

   public boolean bf() {
      return true;
   }

   public boolean by() {
      ye var1 = ((uf)this.n).aZ();
      return var1 != null && var1.d == PigCompanionMod.potatoOnAStick.cv;
   }

   public EntityPigFriendlyLeather spawnBabyAnimal(nk par1EntityAgeable) {
      return new EntityPigFriendlyLeather(this.q);
   }

   protected void a() {
      super.a();
      this.ah.a(16, (byte)0);
   }

   public pl getAIControlledByPlayer() {
      return this.aiControlledByPlayer;
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
      if (var2 != null && var2.d == yc.O.cv) {
         if (!this.q.I) {
            tc var3 = new tc(this.q);
            var3.b(this.u, this.v + 1.0D, this.w + 10.0D, this.A, this.B);
            this.q.d(var3);
            tc var4 = new tc(this.q);
            var4.b(this.u + 1.0D, this.v + 1.0D, this.w + 10.0D, this.A, this.B);
            this.q.d(var4);
            tc var5 = new tc(this.q);
            var5.b(this.u + 2.0D, this.v + 1.0D, this.w + 10.0D, this.A, this.B);
            this.q.d(var5);
            tc var6 = new tc(this.q);
            var6.b(this.u + 3.0D, this.v + 1.0D, this.w + 10.0D, this.A, this.B);
            this.q.d(var6);
            tc var7 = new tc(this.q);
            var7.b(this.u + 4.0D, this.v + 1.0D, this.w + 9.0D, this.A, this.B);
            this.q.d(var7);
            tc var8 = new tc(this.q);
            var8.b(this.u + 5.0D, this.v + 1.0D, this.w + 9.0D, this.A, this.B);
            this.q.d(var8);
            tc var9 = new tc(this.q);
            var9.b(this.u + 6.0D, this.v + 1.0D, this.w + 8.0D, this.A, this.B);
            this.q.d(var9);
            tc var10 = new tc(this.q);
            var10.b(this.u + 7.0D, this.v + 1.0D, this.w + 7.0D, this.A, this.B);
            this.q.d(var10);
            tc var11 = new tc(this.q);
            var11.b(this.u + 8.0D, this.v + 1.0D, this.w + 6.0D, this.A, this.B);
            this.q.d(var11);
            tc var12 = new tc(this.q);
            var12.b(this.u + 9.0D, this.v + 1.0D, this.w + 5.0D, this.A, this.B);
            this.q.d(var12);
            tc var13 = new tc(this.q);
            var13.b(this.u + 9.0D, this.v + 1.0D, this.w + 4.0D, this.A, this.B);
            this.q.d(var13);
            tc var14 = new tc(this.q);
            var14.b(this.u + 10.0D, this.v + 3.0D, this.w + 3.0D, this.A, this.B);
            this.q.d(var14);
            tc var15 = new tc(this.q);
            var15.b(this.u + 10.0D, this.v + 1.0D, this.w + 2.0D, this.A, this.B);
            this.q.d(var15);
            tc var16 = new tc(this.q);
            var16.b(this.u + 10.0D, this.v + 1.0D, this.w + 1.0D, this.A, this.B);
            this.q.d(var16);
            tc var17 = new tc(this.q);
            var17.b(this.u + 10.0D, this.v + 1.0D, this.w + 0.0D, this.A, this.B);
            this.q.d(var17);
            tc var18 = new tc(this.q);
            var18.b(this.u + 10.0D, this.v + 1.0D, this.w + -1.0D, this.A, this.B);
            this.q.d(var18);
            tc var19 = new tc(this.q);
            var19.b(this.u + 10.0D, this.v + 1.0D, this.w + -2.0D, this.A, this.B);
            this.q.d(var19);
            tc var20 = new tc(this.q);
            var20.b(this.u + 9.0D, this.v + 1.0D, this.w + -4.0D, this.A, this.B);
            this.q.d(var20);
            tc var21 = new tc(this.q);
            var21.b(this.u + 9.0D, this.v + 1.0D, this.w + -5.0D, this.A, this.B);
            this.q.d(var21);
            tc var22 = new tc(this.q);
            var22.b(this.u + 8.0D, this.v + 1.0D, this.w + -6.0D, this.A, this.B);
            this.q.d(var22);
            tc var23 = new tc(this.q);
            var23.b(this.u + 7.0D, this.v + 1.0D, this.w + -7.0D, this.A, this.B);
            this.q.d(var23);
            tc var24 = new tc(this.q);
            var24.b(this.u + 6.0D, this.v + 1.0D, this.w + -8.0D, this.A, this.B);
            this.q.d(var24);
            tc var25 = new tc(this.q);
            var25.b(this.u + 5.0D, this.v + 1.0D, this.w + -9.0D, this.A, this.B);
            this.q.d(var25);
            tc var26 = new tc(this.q);
            var26.b(this.u + 4.0D, this.v + 1.0D, this.w + -9.0D, this.A, this.B);
            this.q.d(var26);
            tc var27 = new tc(this.q);
            var27.b(this.u + 3.0D, this.v + 1.0D, this.w + -10.0D, this.A, this.B);
            this.q.d(var27);
            tc var28 = new tc(this.q);
            var28.b(this.u + 2.0D, this.v + 1.0D, this.w + -10.0D, this.A, this.B);
            this.q.d(var28);
            tc var29 = new tc(this.q);
            var29.b(this.u + 1.0D, this.v + 1.0D, this.w + -10.0D, this.A, this.B);
            this.q.d(var29);
            tc var30 = new tc(this.q);
            var30.b(this.u + 0.0D, this.v + 1.0D, this.w + -10.0D, this.A, this.B);
            this.q.d(var30);
            tc var31 = new tc(this.q);
            var31.b(this.u + -1.0D, this.v + 1.0D, this.w + -10.0D, this.A, this.B);
            this.q.d(var31);
            tc var32 = new tc(this.q);
            var32.b(this.u + -2.0D, this.v + 1.0D, this.w + -10.0D, this.A, this.B);
            this.q.d(var32);
            tc var33 = new tc(this.q);
            var33.b(this.u + -3.0D, this.v + 1.0D, this.w + -10.0D, this.A, this.B);
            this.q.d(var33);
            tc var34 = new tc(this.q);
            var34.b(this.u + -4.0D, this.v + 1.0D, this.w + -9.0D, this.A, this.B);
            this.q.d(var34);
            tc var35 = new tc(this.q);
            var35.b(this.u + -5.0D, this.v + 1.0D, this.w + -9.0D, this.A, this.B);
            this.q.d(var35);
            tc var36 = new tc(this.q);
            var36.b(this.u + -6.0D, this.v + 1.0D, this.w + -8.0D, this.A, this.B);
            this.q.d(var36);
            tc var37 = new tc(this.q);
            var37.b(this.u + -7.0D, this.v + 1.0D, this.w + -7.0D, this.A, this.B);
            this.q.d(var37);
            tc var38 = new tc(this.q);
            var38.b(this.u + -8.0D, this.v + 1.0D, this.w + -6.0D, this.A, this.B);
            this.q.d(var38);
            tc var39 = new tc(this.q);
            var39.b(this.u + -9.0D, this.v + 1.0D, this.w + -5.0D, this.A, this.B);
            this.q.d(var39);
            tc var40 = new tc(this.q);
            var40.b(this.u + -9.0D, this.v + 1.0D, this.w + -4.0D, this.A, this.B);
            this.q.d(var40);
            tc var41 = new tc(this.q);
            var41.b(this.u + -10.0D, this.v + 1.0D, this.w + -3.0D, this.A, this.B);
            this.q.d(var41);
            tc var42 = new tc(this.q);
            var42.b(this.u + -10.0D, this.v + 1.0D, this.w + -2.0D, this.A, this.B);
            this.q.d(var42);
            tc var43 = new tc(this.q);
            var43.b(this.u + -10.0D, this.v + 1.0D, this.w + -1.0D, this.A, this.B);
            this.q.d(var43);
            tc var44 = new tc(this.q);
            var44.b(this.u + -10.0D, this.v + 1.0D, this.w + 0.0D, this.A, this.B);
            this.q.d(var44);
            tc var45 = new tc(this.q);
            var45.b(this.u + -10.0D, this.v + 1.0D, this.w + 1.0D, this.A, this.B);
            this.q.d(var45);
            tc var46 = new tc(this.q);
            var46.b(this.u + -10.0D, this.v + 1.0D, this.w + 2.0D, this.A, this.B);
            this.q.d(var46);
            tc var47 = new tc(this.q);
            var47.b(this.u + -10.0D, this.v + 1.0D, this.w + 3.0D, this.A, this.B);
            this.q.d(var47);
            tc var48 = new tc(this.q);
            var48.b(this.u + -9.0D, this.v + 1.0D, this.w + 4.0D, this.A, this.B);
            this.q.d(var48);
            tc var49 = new tc(this.q);
            var49.b(this.u + -9.0D, this.v + 1.0D, this.w + 5.0D, this.A, this.B);
            this.q.d(var49);
            tc var50 = new tc(this.q);
            var50.b(this.u + -8.0D, this.v + 1.0D, this.w + 6.0D, this.A, this.B);
            this.q.d(var50);
            tc var51 = new tc(this.q);
            var51.b(this.u + -7.0D, this.v + 1.0D, this.w + 7.0D, this.A, this.B);
            this.q.d(var51);
            tc var52 = new tc(this.q);
            var52.b(this.u + -6.0D, this.v + 1.0D, this.w + 8.0D, this.A, this.B);
            this.q.d(var52);
            tc var53 = new tc(this.q);
            var53.b(this.u + -5.0D, this.v + 1.0D, this.w + 9.0D, this.A, this.B);
            this.q.d(var53);
            tc var54 = new tc(this.q);
            var54.b(this.u + -4.0D, this.v + 1.0D, this.w + 9.0D, this.A, this.B);
            this.q.d(var54);
            tc var55 = new tc(this.q);
            var55.b(this.u + -3.0D, this.v + 1.0D, this.w + 10.0D, this.A, this.B);
            this.q.d(var55);
            tc var56 = new tc(this.q);
            var56.b(this.u + -2.0D, this.v + 1.0D, this.w + 10.0D, this.A, this.B);
            this.q.d(var56);
            tc var57 = new tc(this.q);
            var57.b(this.u + -1.0D, this.v + 1.0D, this.w + 10.0D, this.A, this.B);
            this.q.d(var57);
            par1EntityPlayer.bn.d(yc.O.cv);
            par1EntityPlayer.bn.d(yc.O.cv);
            par1EntityPlayer.bn.d(yc.O.cv);
            par1EntityPlayer.bn.d(yc.O.cv);
            par1EntityPlayer.bn.d(yc.O.cv);
            par1EntityPlayer.bn.d(yc.O.cv);
            par1EntityPlayer.bn.d(yc.O.cv);
            par1EntityPlayer.bn.d(yc.O.cv);
            par1EntityPlayer.bn.d(yc.O.cv);
         }

         return true;
      } else if (var2 != null && var2.d == yc.N.cv) {
         if (!this.q.I) {
            double RandNumber = Math.random() * 100.0D;
            par1EntityPlayer.bn.d(yc.N.cv);
            if (RandNumber < 25.0D) {
               this.x += 5.0D;
            } else if (RandNumber < 50.0D) {
               this.x -= 5.0D;
            } else if (RandNumber < 75.0D) {
               this.z += 5.0D;
            } else {
               this.z -= 5.0D;
            }
         }

         return true;
      } else if (var2 != null && var2.d == yc.bF.cv) {
         if (!this.q.I) {
            par1EntityPlayer.bn.d(yc.bF.cv);
            par1EntityPlayer.bn.d(yc.bF.cv);
            par1EntityPlayer.bn.d(yc.bF.cv);
            par1EntityPlayer.bn.d(yc.bF.cv);
            par1EntityPlayer.bn.d(yc.bF.cv);
            ut var3 = new ut(this.q);
            var3.b(this.u, this.v + 1.0D, this.w + 10.0D, this.A, this.B);
            this.q.d(var3);
            ut var4 = new ut(this.q);
            var4.b(this.u + 1.0D, this.v + 1.0D, this.w + 10.0D, this.A, this.B);
            this.q.d(var4);
            ut var5 = new ut(this.q);
            var5.b(this.u + 2.0D, this.v + 1.0D, this.w + 10.0D, this.A, this.B);
            this.q.d(var5);
            ut var6 = new ut(this.q);
            var6.b(this.u + 3.0D, this.v + 1.0D, this.w + 10.0D, this.A, this.B);
            this.q.d(var6);
            ut var7 = new ut(this.q);
            var7.b(this.u + 4.0D, this.v + 1.0D, this.w + 9.0D, this.A, this.B);
            this.q.d(var7);
            ut var8 = new ut(this.q);
            var8.b(this.u + 5.0D, this.v + 1.0D, this.w + 9.0D, this.A, this.B);
            this.q.d(var8);
            ut var9 = new ut(this.q);
            var9.b(this.u + 6.0D, this.v + 1.0D, this.w + 8.0D, this.A, this.B);
            this.q.d(var9);
            ut var10 = new ut(this.q);
            var10.b(this.u + 7.0D, this.v + 1.0D, this.w + 7.0D, this.A, this.B);
            this.q.d(var10);
            ut var11 = new ut(this.q);
            var11.b(this.u + 8.0D, this.v + 1.0D, this.w + 6.0D, this.A, this.B);
            this.q.d(var11);
            ut var12 = new ut(this.q);
            var12.b(this.u + 9.0D, this.v + 1.0D, this.w + 5.0D, this.A, this.B);
            this.q.d(var12);
            ut var13 = new ut(this.q);
            var13.b(this.u + 9.0D, this.v + 1.0D, this.w + 4.0D, this.A, this.B);
            this.q.d(var13);
            ut var14 = new ut(this.q);
            var14.b(this.u + 10.0D, this.v + 3.0D, this.w + 3.0D, this.A, this.B);
            this.q.d(var14);
            ut var15 = new ut(this.q);
            var15.b(this.u + 10.0D, this.v + 1.0D, this.w + 2.0D, this.A, this.B);
            this.q.d(var15);
            ut var16 = new ut(this.q);
            var16.b(this.u + 10.0D, this.v + 1.0D, this.w + 1.0D, this.A, this.B);
            this.q.d(var16);
            ut var17 = new ut(this.q);
            var17.b(this.u + 10.0D, this.v + 1.0D, this.w + 0.0D, this.A, this.B);
            this.q.d(var17);
            ut var18 = new ut(this.q);
            var18.b(this.u + 10.0D, this.v + 1.0D, this.w + -1.0D, this.A, this.B);
            this.q.d(var18);
            ut var19 = new ut(this.q);
            var19.b(this.u + 10.0D, this.v + 1.0D, this.w + -2.0D, this.A, this.B);
            this.q.d(var19);
            ut var20 = new ut(this.q);
            var20.b(this.u + 9.0D, this.v + 1.0D, this.w + -4.0D, this.A, this.B);
            this.q.d(var20);
            ut var21 = new ut(this.q);
            var21.b(this.u + 9.0D, this.v + 1.0D, this.w + -5.0D, this.A, this.B);
            this.q.d(var21);
            ut var22 = new ut(this.q);
            var22.b(this.u + 8.0D, this.v + 1.0D, this.w + -6.0D, this.A, this.B);
            this.q.d(var22);
            ut var23 = new ut(this.q);
            var23.b(this.u + 7.0D, this.v + 1.0D, this.w + -7.0D, this.A, this.B);
            this.q.d(var23);
            ut var24 = new ut(this.q);
            var24.b(this.u + 6.0D, this.v + 1.0D, this.w + -8.0D, this.A, this.B);
            this.q.d(var24);
            ut var25 = new ut(this.q);
            var25.b(this.u + 5.0D, this.v + 1.0D, this.w + -9.0D, this.A, this.B);
            this.q.d(var25);
            ut var26 = new ut(this.q);
            var26.b(this.u + 4.0D, this.v + 1.0D, this.w + -9.0D, this.A, this.B);
            this.q.d(var26);
            ut var27 = new ut(this.q);
            var27.b(this.u + 3.0D, this.v + 1.0D, this.w + -10.0D, this.A, this.B);
            this.q.d(var27);
            ut var28 = new ut(this.q);
            var28.b(this.u + 2.0D, this.v + 1.0D, this.w + -10.0D, this.A, this.B);
            this.q.d(var28);
            ut var29 = new ut(this.q);
            var29.b(this.u + 1.0D, this.v + 1.0D, this.w + -10.0D, this.A, this.B);
            this.q.d(var29);
            ut var30 = new ut(this.q);
            var30.b(this.u + 0.0D, this.v + 1.0D, this.w + -10.0D, this.A, this.B);
            this.q.d(var30);
            ut var31 = new ut(this.q);
            var31.b(this.u + -1.0D, this.v + 1.0D, this.w + -10.0D, this.A, this.B);
            this.q.d(var31);
            ut var32 = new ut(this.q);
            var32.b(this.u + -2.0D, this.v + 1.0D, this.w + -10.0D, this.A, this.B);
            this.q.d(var32);
            ut var33 = new ut(this.q);
            var33.b(this.u + -3.0D, this.v + 1.0D, this.w + -10.0D, this.A, this.B);
            this.q.d(var33);
            ut var34 = new ut(this.q);
            var34.b(this.u + -4.0D, this.v + 1.0D, this.w + -9.0D, this.A, this.B);
            this.q.d(var34);
            ut var35 = new ut(this.q);
            var35.b(this.u + -5.0D, this.v + 1.0D, this.w + -9.0D, this.A, this.B);
            this.q.d(var35);
            ut var36 = new ut(this.q);
            var36.b(this.u + -6.0D, this.v + 1.0D, this.w + -8.0D, this.A, this.B);
            this.q.d(var36);
            ut var37 = new ut(this.q);
            var37.b(this.u + -7.0D, this.v + 1.0D, this.w + -7.0D, this.A, this.B);
            this.q.d(var37);
            ut var38 = new ut(this.q);
            var38.b(this.u + -8.0D, this.v + 1.0D, this.w + -6.0D, this.A, this.B);
            this.q.d(var38);
            ut var39 = new ut(this.q);
            var39.b(this.u + -9.0D, this.v + 1.0D, this.w + -5.0D, this.A, this.B);
            this.q.d(var39);
            ut var40 = new ut(this.q);
            var40.b(this.u + -9.0D, this.v + 1.0D, this.w + -4.0D, this.A, this.B);
            this.q.d(var40);
            ut var41 = new ut(this.q);
            var41.b(this.u + -10.0D, this.v + 1.0D, this.w + -3.0D, this.A, this.B);
            this.q.d(var41);
            ut var42 = new ut(this.q);
            var42.b(this.u + -10.0D, this.v + 1.0D, this.w + -2.0D, this.A, this.B);
            this.q.d(var42);
            ut var43 = new ut(this.q);
            var43.b(this.u + -10.0D, this.v + 1.0D, this.w + -1.0D, this.A, this.B);
            this.q.d(var43);
            ut var44 = new ut(this.q);
            var44.b(this.u + -10.0D, this.v + 1.0D, this.w + 0.0D, this.A, this.B);
            this.q.d(var44);
            ut var45 = new ut(this.q);
            var45.b(this.u + -10.0D, this.v + 1.0D, this.w + 1.0D, this.A, this.B);
            this.q.d(var45);
            ut var46 = new ut(this.q);
            var46.b(this.u + -10.0D, this.v + 1.0D, this.w + 2.0D, this.A, this.B);
            this.q.d(var46);
            ut var47 = new ut(this.q);
            var47.b(this.u + -10.0D, this.v + 1.0D, this.w + 3.0D, this.A, this.B);
            this.q.d(var47);
            ut var48 = new ut(this.q);
            var48.b(this.u + -9.0D, this.v + 1.0D, this.w + 4.0D, this.A, this.B);
            this.q.d(var48);
            ut var49 = new ut(this.q);
            var49.b(this.u + -9.0D, this.v + 1.0D, this.w + 5.0D, this.A, this.B);
            this.q.d(var49);
            ut var50 = new ut(this.q);
            var50.b(this.u + -8.0D, this.v + 1.0D, this.w + 6.0D, this.A, this.B);
            this.q.d(var50);
            ut var51 = new ut(this.q);
            var51.b(this.u + -7.0D, this.v + 1.0D, this.w + 7.0D, this.A, this.B);
            this.q.d(var51);
            ut var52 = new ut(this.q);
            var52.b(this.u + -6.0D, this.v + 1.0D, this.w + 8.0D, this.A, this.B);
            this.q.d(var52);
            ut var53 = new ut(this.q);
            var53.b(this.u + -5.0D, this.v + 1.0D, this.w + 9.0D, this.A, this.B);
            this.q.d(var53);
            ut var54 = new ut(this.q);
            var54.b(this.u + -4.0D, this.v + 1.0D, this.w + 9.0D, this.A, this.B);
            this.q.d(var54);
            ut var55 = new ut(this.q);
            var55.b(this.u + -3.0D, this.v + 1.0D, this.w + 10.0D, this.A, this.B);
            this.q.d(var55);
            ut var56 = new ut(this.q);
            var56.b(this.u + -2.0D, this.v + 1.0D, this.w + 10.0D, this.A, this.B);
            this.q.d(var56);
            ut var57 = new ut(this.q);
            var57.b(this.u + -1.0D, this.v + 1.0D, this.w + 10.0D, this.A, this.B);
            this.q.d(var57);
         }

         return true;
      } else if (var2 != null && var2.d == yc.aV.cv) {
         if (!this.q.I) {
            this.q.a("smoke", this.u + 1.0D, this.v + 0.5D, this.w, 0.0D, 0.0D, 0.0D);
            this.q.a("snowballpoof", this.u, this.v + 0.5D, this.w + 1.0D, 0.0D, 0.0D, 0.0D);
            this.q.a("splash", this.u + 1.0D, this.v + 0.5D, this.w - 1.0D, 0.0D, 0.0D, 0.0D);
            this.q.a("bubble", this.u, this.v + 0.5D, this.w, 0.0D, 0.0D, 0.0D);
            this.q.a("townaura", this.u - 1.0D, this.v + 0.5D, this.w + 1.0D, 0.0D, 0.0D, 0.0D);
            this.q.a("flame", this.u, this.v + 0.5D, this.w - 1.0D, 0.0D, 0.0D, 0.0D);
            this.q.a("happyVillager", this.u - 1.0D, this.v + 0.5D, this.w, 0.0D, 0.0D, 0.0D);
            this.q.a("reddust", this.u, this.v + 0.5D, this.w + 1.0D, 0.0D, 0.0D, 0.0D);
            this.q.a("lava", this.u + 1.0D, this.v + 0.5D, this.w - 1.0D, 0.0D, 0.0D, 0.0D);
            this.q.a("magicCrit", this.u, this.v + 0.5D, this.w, 0.0D, 0.0D, 0.0D);
            par1EntityPlayer.bn.d(yc.aV.cv);
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
}
