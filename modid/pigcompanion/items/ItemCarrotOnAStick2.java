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
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCarrotOnAStick2 extends Item {
   private static final String __OBFID = "CL_00000001";

   public ItemCarrotOnAStick2() {
      this.func_77637_a(CreativeTabs.field_78029_e);
      this.func_77625_d(1);
      this.func_77656_e(25);
   }

   public boolean func_77662_d() {
      return true;
   }

   public boolean func_77629_n_() {
      return true;
   }

   public ItemStack func_77659_a(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
      if (par3EntityPlayer.func_70115_ae() && par3EntityPlayer.field_70154_o instanceof EntityPig) {
         EntityPig var4 = (EntityPig)par3EntityPlayer.field_70154_o;
         if (var4.func_82183_n().func_82633_h() && par1ItemStack.func_77958_k() - par1ItemStack.func_77960_j() >= 7) {
            var4.func_82183_n().func_82632_g();
            par1ItemStack.func_77972_a(7, par3EntityPlayer);
            if (par1ItemStack.field_77994_a == 0) {
               ItemStack var5 = new ItemStack(Items.field_151112_aM);
               var5.func_77982_d(par1ItemStack.field_77990_d);
               return var5;
            }
         }
      }

      if (par3EntityPlayer.func_70115_ae() && par3EntityPlayer.field_70154_o instanceof EntityPigIron) {
         EntityPigIron var4 = (EntityPigIron)par3EntityPlayer.field_70154_o;
         if (var4.getAIControlledByPlayer().func_82633_h() && par1ItemStack.func_77958_k() - par1ItemStack.func_77960_j() >= 7) {
            var4.getAIControlledByPlayer().func_82632_g();
            par1ItemStack.func_77972_a(7, par3EntityPlayer);
            if (par1ItemStack.field_77994_a == 0) {
               return new ItemStack(Items.field_151112_aM);
            }
         }
      }

      if (par3EntityPlayer.func_70115_ae() && par3EntityPlayer.field_70154_o instanceof EntityPigDiamond) {
         EntityPigDiamond var4 = (EntityPigDiamond)par3EntityPlayer.field_70154_o;
         if (var4.getAIControlledByPlayer().func_82633_h() && par1ItemStack.func_77958_k() - par1ItemStack.func_77960_j() >= 7) {
            var4.getAIControlledByPlayer().func_82632_g();
            par1ItemStack.func_77972_a(7, par3EntityPlayer);
            if (par1ItemStack.field_77994_a == 0) {
               return new ItemStack(Items.field_151112_aM);
            }
         }
      }

      if (par3EntityPlayer.func_70115_ae() && par3EntityPlayer.field_70154_o instanceof EntityPigGold) {
         EntityPigGold var4 = (EntityPigGold)par3EntityPlayer.field_70154_o;
         if (var4.getAIControlledByPlayer().func_82633_h() && par1ItemStack.func_77958_k() - par1ItemStack.func_77960_j() >= 7) {
            var4.getAIControlledByPlayer().func_82632_g();
            par1ItemStack.func_77972_a(7, par3EntityPlayer);
            if (par1ItemStack.field_77994_a == 0) {
               return new ItemStack(Items.field_151112_aM);
            }
         }
      }

      if (par3EntityPlayer.func_70115_ae() && par3EntityPlayer.field_70154_o instanceof EntityPigLeather) {
         EntityPigLeather var4 = (EntityPigLeather)par3EntityPlayer.field_70154_o;
         if (var4.getAIControlledByPlayer().func_82633_h() && par1ItemStack.func_77958_k() - par1ItemStack.func_77960_j() >= 7) {
            var4.getAIControlledByPlayer().func_82632_g();
            par1ItemStack.func_77972_a(7, par3EntityPlayer);
            if (par1ItemStack.field_77994_a == 0) {
               return new ItemStack(Items.field_151112_aM);
            }
         }
      }

      if (par3EntityPlayer.func_70115_ae() && par3EntityPlayer.field_70154_o instanceof EntityPigFriendlyIron) {
         EntityPigFriendlyIron var4 = (EntityPigFriendlyIron)par3EntityPlayer.field_70154_o;
         if (var4.getAIControlledByPlayer().func_82633_h() && par1ItemStack.func_77958_k() - par1ItemStack.func_77960_j() >= 7) {
            var4.getAIControlledByPlayer().func_82632_g();
            par1ItemStack.func_77972_a(7, par3EntityPlayer);
            if (par1ItemStack.field_77994_a == 0) {
               return new ItemStack(Items.field_151112_aM);
            }
         }
      }

      if (par3EntityPlayer.func_70115_ae() && par3EntityPlayer.field_70154_o instanceof EntityPigFriendlyDiamond) {
         EntityPigFriendlyDiamond var4 = (EntityPigFriendlyDiamond)par3EntityPlayer.field_70154_o;
         if (var4.getAIControlledByPlayer().func_82633_h() && par1ItemStack.func_77958_k() - par1ItemStack.func_77960_j() >= 7) {
            var4.getAIControlledByPlayer().func_82632_g();
            par1ItemStack.func_77972_a(7, par3EntityPlayer);
            if (par1ItemStack.field_77994_a == 0) {
               return new ItemStack(Items.field_151112_aM);
            }
         }
      }

      if (par3EntityPlayer.func_70115_ae() && par3EntityPlayer.field_70154_o instanceof EntityPigFriendlyGold) {
         EntityPigFriendlyGold var4 = (EntityPigFriendlyGold)par3EntityPlayer.field_70154_o;
         if (var4.getAIControlledByPlayer().func_82633_h() && par1ItemStack.func_77958_k() - par1ItemStack.func_77960_j() >= 7) {
            var4.getAIControlledByPlayer().func_82632_g();
            par1ItemStack.func_77972_a(7, par3EntityPlayer);
            if (par1ItemStack.field_77994_a == 0) {
               return new ItemStack(Items.field_151112_aM);
            }
         }
      }

      if (par3EntityPlayer.func_70115_ae() && par3EntityPlayer.field_70154_o instanceof EntityPigFriendlyLeather) {
         EntityPigFriendlyLeather var4 = (EntityPigFriendlyLeather)par3EntityPlayer.field_70154_o;
         if (var4.getAIControlledByPlayer().func_82633_h() && par1ItemStack.func_77958_k() - par1ItemStack.func_77960_j() >= 7) {
            var4.getAIControlledByPlayer().func_82632_g();
            par1ItemStack.func_77972_a(7, par3EntityPlayer);
            if (par1ItemStack.field_77994_a == 0) {
               return new ItemStack(Items.field_151112_aM);
            }
         }
      }

      if (par3EntityPlayer.func_70115_ae() && par3EntityPlayer.field_70154_o instanceof EntityPig2) {
         EntityPig2 var4 = (EntityPig2)par3EntityPlayer.field_70154_o;
         if (var4.getAIControlledByPlayer().func_82633_h() && par1ItemStack.func_77958_k() - par1ItemStack.func_77960_j() >= 7) {
            var4.getAIControlledByPlayer().func_82632_g();
            par1ItemStack.func_77972_a(7, par3EntityPlayer);
            if (par1ItemStack.field_77994_a == 0) {
               return new ItemStack(Items.field_151112_aM);
            }
         }
      }

      return par1ItemStack;
   }
}
