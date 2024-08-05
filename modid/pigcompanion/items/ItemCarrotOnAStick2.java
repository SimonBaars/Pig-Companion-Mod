package modid.pigcompanion.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import modid.pigcompanion.pigs.EntityPig2;
import modid.pigcompanion.pigs.EntityPigDiamond;
import modid.pigcompanion.pigs.EntityPigFriendlyDiamond;
import modid.pigcompanion.pigs.EntityPigFriendlyGold;
import modid.pigcompanion.pigs.EntityPigFriendlyIron;
import modid.pigcompanion.pigs.EntityPigFriendlyLeather;
import modid.pigcompanion.pigs.EntityPigGold;
import modid.pigcompanion.pigs.EntityPigIron;
import modid.pigcompanion.pigs.EntityPigLeather;

public class ItemCarrotOnAStick2 extends yc {
   public ItemCarrotOnAStick2(int par1) {
      super(par1);
      this.a(ww.e);
      this.d(1);
      this.e(25);
   }

   @SideOnly(Side.CLIENT)
   public boolean n_() {
      return true;
   }

   @SideOnly(Side.CLIENT)
   public boolean o_() {
      return true;
   }

   public ye a(ye par1ItemStack, abw par2World, uf par3EntityPlayer) {
      if (par3EntityPlayer.ag() && par3EntityPlayer.o instanceof ry) {
         ry entitypig = (ry)par3EntityPlayer.o;
         if (entitypig.bU().h() && par1ItemStack.l() - par1ItemStack.k() >= 7) {
            entitypig.bU().g();
            par1ItemStack.a(7, par3EntityPlayer);
            if (par1ItemStack.b == 0) {
               ye itemstack1 = new ye(yc.aT);
               itemstack1.d(par1ItemStack.e);
               return itemstack1;
            }
         }
      }

      if (par3EntityPlayer.ag() && par3EntityPlayer.o instanceof EntityPigIron) {
         EntityPigIron var4 = (EntityPigIron)par3EntityPlayer.o;
         if (var4.getAIControlledByPlayer().h() && par1ItemStack.l() - par1ItemStack.k() >= 7) {
            var4.getAIControlledByPlayer().g();
            par1ItemStack.a(7, par3EntityPlayer);
            if (par1ItemStack.b == 0) {
               return new ye(yc.aT);
            }
         }
      }

      if (par3EntityPlayer.ag() && par3EntityPlayer.o instanceof EntityPigDiamond) {
         EntityPigDiamond var4 = (EntityPigDiamond)par3EntityPlayer.o;
         if (var4.getAIControlledByPlayer().h() && par1ItemStack.l() - par1ItemStack.k() >= 7) {
            var4.getAIControlledByPlayer().g();
            par1ItemStack.a(7, par3EntityPlayer);
            if (par1ItemStack.b == 0) {
               return new ye(yc.aT);
            }
         }
      }

      if (par3EntityPlayer.ag() && par3EntityPlayer.o instanceof EntityPigGold) {
         EntityPigGold var4 = (EntityPigGold)par3EntityPlayer.o;
         if (var4.getAIControlledByPlayer().h() && par1ItemStack.l() - par1ItemStack.k() >= 7) {
            var4.getAIControlledByPlayer().g();
            par1ItemStack.a(7, par3EntityPlayer);
            if (par1ItemStack.b == 0) {
               return new ye(yc.aT);
            }
         }
      }

      if (par3EntityPlayer.ag() && par3EntityPlayer.o instanceof EntityPigLeather) {
         EntityPigLeather var4 = (EntityPigLeather)par3EntityPlayer.o;
         if (var4.getAIControlledByPlayer().h() && par1ItemStack.l() - par1ItemStack.k() >= 7) {
            var4.getAIControlledByPlayer().g();
            par1ItemStack.a(7, par3EntityPlayer);
            if (par1ItemStack.b == 0) {
               return new ye(yc.aT);
            }
         }
      }

      if (par3EntityPlayer.ag() && par3EntityPlayer.o instanceof EntityPigFriendlyIron) {
         EntityPigFriendlyIron var4 = (EntityPigFriendlyIron)par3EntityPlayer.o;
         if (var4.getAIControlledByPlayer().h() && par1ItemStack.l() - par1ItemStack.k() >= 7) {
            var4.getAIControlledByPlayer().g();
            par1ItemStack.a(7, par3EntityPlayer);
            if (par1ItemStack.b == 0) {
               return new ye(yc.aT);
            }
         }
      }

      if (par3EntityPlayer.ag() && par3EntityPlayer.o instanceof EntityPigFriendlyDiamond) {
         EntityPigFriendlyDiamond var4 = (EntityPigFriendlyDiamond)par3EntityPlayer.o;
         if (var4.getAIControlledByPlayer().h() && par1ItemStack.l() - par1ItemStack.k() >= 7) {
            var4.getAIControlledByPlayer().g();
            par1ItemStack.a(7, par3EntityPlayer);
            if (par1ItemStack.b == 0) {
               return new ye(yc.aT);
            }
         }
      }

      if (par3EntityPlayer.ag() && par3EntityPlayer.o instanceof EntityPigFriendlyGold) {
         EntityPigFriendlyGold var4 = (EntityPigFriendlyGold)par3EntityPlayer.o;
         if (var4.getAIControlledByPlayer().h() && par1ItemStack.l() - par1ItemStack.k() >= 7) {
            var4.getAIControlledByPlayer().g();
            par1ItemStack.a(7, par3EntityPlayer);
            if (par1ItemStack.b == 0) {
               return new ye(yc.aT);
            }
         }
      }

      if (par3EntityPlayer.ag() && par3EntityPlayer.o instanceof EntityPigFriendlyLeather) {
         EntityPigFriendlyLeather var4 = (EntityPigFriendlyLeather)par3EntityPlayer.o;
         if (var4.getAIControlledByPlayer().h() && par1ItemStack.l() - par1ItemStack.k() >= 7) {
            var4.getAIControlledByPlayer().g();
            par1ItemStack.a(7, par3EntityPlayer);
            if (par1ItemStack.b == 0) {
               return new ye(yc.aT);
            }
         }
      }

      if (par3EntityPlayer.ag() && par3EntityPlayer.o instanceof EntityPig2) {
         EntityPig2 var4 = (EntityPig2)par3EntityPlayer.o;
         if (var4.getAIControlledByPlayer().h() && par1ItemStack.l() - par1ItemStack.k() >= 7) {
            var4.getAIControlledByPlayer().g();
            par1ItemStack.a(7, par3EntityPlayer);
            if (par1ItemStack.b == 0) {
               return new ye(yc.aT);
            }
         }
      }

      return par1ItemStack;
   }
}
