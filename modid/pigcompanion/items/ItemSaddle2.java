package modid.pigcompanion.items;

import modid.pigcompanion.pigs.EntityPig2;
import modid.pigcompanion.pigs.EntityPigDiamond;
import modid.pigcompanion.pigs.EntityPigFriendlyDiamond;
import modid.pigcompanion.pigs.EntityPigFriendlyGold;
import modid.pigcompanion.pigs.EntityPigFriendlyIron;
import modid.pigcompanion.pigs.EntityPigFriendlyLeather;
import modid.pigcompanion.pigs.EntityPigGold;
import modid.pigcompanion.pigs.EntityPigIron;
import modid.pigcompanion.pigs.EntityPigLeather;

public class ItemSaddle2 extends yc {
   public ItemSaddle2(int par1) {
      super(par1);
      this.cw = 1;
      this.a(ww.e);
   }

   public boolean a(ye par1ItemStack, uf par2EntityPlayer, of par3EntityLivingBase) {
      if (par3EntityLivingBase instanceof ry) {
         ry entitypig = (ry)par3EntityLivingBase;
         if (!entitypig.bT() && !entitypig.g_()) {
            entitypig.i(true);
            --par1ItemStack.b;
         }

         return true;
      } else if (par3EntityLivingBase instanceof EntityPigDiamond) {
         EntityPigDiamond var3 = (EntityPigDiamond)par3EntityLivingBase;
         if (!var3.getSaddled() && !var3.g_()) {
            var3.setSaddled(true);
            --par1ItemStack.b;
         }

         return true;
      } else if (par3EntityLivingBase instanceof EntityPigGold) {
         EntityPigGold var3 = (EntityPigGold)par3EntityLivingBase;
         if (!var3.getSaddled() && !var3.g_()) {
            var3.setSaddled(true);
            --par1ItemStack.b;
         }

         return true;
      } else if (par3EntityLivingBase instanceof EntityPigLeather) {
         EntityPigLeather var3 = (EntityPigLeather)par3EntityLivingBase;
         if (!var3.getSaddled() && !var3.g_()) {
            var3.setSaddled(true);
            --par1ItemStack.b;
         }

         return true;
      } else if (par3EntityLivingBase instanceof EntityPigIron) {
         EntityPigIron var3 = (EntityPigIron)par3EntityLivingBase;
         if (!var3.getSaddled() && !var3.g_()) {
            var3.setSaddled(true);
            --par1ItemStack.b;
         }

         return true;
      } else if (par3EntityLivingBase instanceof EntityPigFriendlyDiamond) {
         EntityPigFriendlyDiamond var3 = (EntityPigFriendlyDiamond)par3EntityLivingBase;
         if (!var3.getSaddled() && !var3.g_()) {
            var3.setSaddled(true);
            --par1ItemStack.b;
         }

         return true;
      } else if (par3EntityLivingBase instanceof EntityPigFriendlyGold) {
         EntityPigFriendlyGold var3 = (EntityPigFriendlyGold)par3EntityLivingBase;
         if (!var3.getSaddled() && !var3.g_()) {
            var3.setSaddled(true);
            --par1ItemStack.b;
         }

         return true;
      } else if (par3EntityLivingBase instanceof EntityPigFriendlyLeather) {
         EntityPigFriendlyLeather var3 = (EntityPigFriendlyLeather)par3EntityLivingBase;
         if (!var3.getSaddled() && !var3.g_()) {
            var3.setSaddled(true);
            --par1ItemStack.b;
         }

         return true;
      } else if (par3EntityLivingBase instanceof EntityPigFriendlyIron) {
         EntityPigFriendlyIron var3 = (EntityPigFriendlyIron)par3EntityLivingBase;
         if (!var3.getSaddled() && !var3.g_()) {
            var3.setSaddled(true);
            --par1ItemStack.b;
         }

         return true;
      } else if (par3EntityLivingBase instanceof EntityPig2) {
         EntityPig2 var3 = (EntityPig2)par3EntityLivingBase;
         if (!var3.getSaddled() && !var3.g_()) {
            var3.setSaddled(true);
            --par1ItemStack.b;
         }

         return true;
      } else {
         return false;
      }
   }

   public boolean a(ye par1ItemStack, of par2EntityLivingBase, of par3EntityLivingBase) {
      this.a(par1ItemStack, (uf)null, par2EntityLivingBase);
      return true;
   }
}
