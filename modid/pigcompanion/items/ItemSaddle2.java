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
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemSaddle2 extends Item {
   private static final String __OBFID = "CL_00000059";

   public ItemSaddle2() {
      this.field_77777_bU = 1;
      this.func_77637_a(CreativeTabs.field_78029_e);
   }

   public boolean func_111207_a(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, EntityLivingBase par3EntityLivingBase) {
      if (par3EntityLivingBase instanceof EntityPig) {
         EntityPig var4 = (EntityPig)par3EntityLivingBase;
         if (!var4.func_70901_n() && !var4.func_70631_g_()) {
            var4.func_70900_e(true);
            var4.field_70170_p.func_72956_a(var4, "mob.horse.leather", 0.5F, 1.0F);
            --par1ItemStack.field_77994_a;
         }

         return true;
      } else if (par3EntityLivingBase instanceof EntityPigDiamond) {
         EntityPigDiamond var3 = (EntityPigDiamond)par3EntityLivingBase;
         if (!var3.getSaddled() && !var3.func_70631_g_()) {
            var3.setSaddled(true);
            --par1ItemStack.field_77994_a;
         }

         return true;
      } else if (par3EntityLivingBase instanceof EntityPigGold) {
         EntityPigGold var3 = (EntityPigGold)par3EntityLivingBase;
         if (!var3.getSaddled() && !var3.func_70631_g_()) {
            var3.setSaddled(true);
            --par1ItemStack.field_77994_a;
         }

         return true;
      } else if (par3EntityLivingBase instanceof EntityPigLeather) {
         EntityPigLeather var3 = (EntityPigLeather)par3EntityLivingBase;
         if (!var3.getSaddled() && !var3.func_70631_g_()) {
            var3.setSaddled(true);
            --par1ItemStack.field_77994_a;
         }

         return true;
      } else if (par3EntityLivingBase instanceof EntityPigIron) {
         EntityPigIron var3 = (EntityPigIron)par3EntityLivingBase;
         if (!var3.getSaddled() && !var3.func_70631_g_()) {
            var3.setSaddled(true);
            --par1ItemStack.field_77994_a;
         }

         return true;
      } else if (par3EntityLivingBase instanceof EntityPigFriendlyDiamond) {
         EntityPigFriendlyDiamond var3 = (EntityPigFriendlyDiamond)par3EntityLivingBase;
         if (!var3.getSaddled() && !var3.func_70631_g_()) {
            var3.setSaddled(true);
            --par1ItemStack.field_77994_a;
         }

         return true;
      } else if (par3EntityLivingBase instanceof EntityPigFriendlyGold) {
         EntityPigFriendlyGold var3 = (EntityPigFriendlyGold)par3EntityLivingBase;
         if (!var3.getSaddled() && !var3.func_70631_g_()) {
            var3.setSaddled(true);
            --par1ItemStack.field_77994_a;
         }

         return true;
      } else if (par3EntityLivingBase instanceof EntityPigFriendlyLeather) {
         EntityPigFriendlyLeather var3 = (EntityPigFriendlyLeather)par3EntityLivingBase;
         if (!var3.getSaddled() && !var3.func_70631_g_()) {
            var3.setSaddled(true);
            --par1ItemStack.field_77994_a;
         }

         return true;
      } else if (par3EntityLivingBase instanceof EntityPigFriendlyIron) {
         EntityPigFriendlyIron var3 = (EntityPigFriendlyIron)par3EntityLivingBase;
         if (!var3.getSaddled() && !var3.func_70631_g_()) {
            var3.setSaddled(true);
            --par1ItemStack.field_77994_a;
         }

         return true;
      } else if (par3EntityLivingBase instanceof EntityPig2) {
         EntityPig2 var3 = (EntityPig2)par3EntityLivingBase;
         if (!var3.getSaddled() && !var3.func_70631_g_()) {
            var3.setSaddled(true);
            --par1ItemStack.field_77994_a;
         }

         return true;
      } else {
         return false;
      }
   }

   public boolean func_77644_a(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
      this.func_111207_a(par1ItemStack, (EntityPlayer)null, par2EntityLivingBase);
      return true;
   }
}
