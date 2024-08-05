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

public class ItemSaddle2 extends Item
{
    public ItemSaddle2(int par1)
    {
        super();
        this.maxStackSize = 1;
        this.setCreativeTab(CreativeTabs.tabTransport);
    }

    /**
     * Returns true if the item can be used on the given entity, e.g. shears on sheep.
     */
    public boolean itemInteractionForEntity(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, EntityLivingBase par3EntityLivingBase)
    {
        if (par3EntityLivingBase instanceof EntityPig)
        {
            EntityPig entitypig = (EntityPig)par3EntityLivingBase;

            if (!entitypig.getSaddled() && !entitypig.isChild())
            {
                entitypig.setSaddled(true);
                --par1ItemStack.stackSize;
            }

            return true;
        }
        
        if (par3EntityLivingBase instanceof EntityPigDiamond)
        {
            EntityPigDiamond var3 = (EntityPigDiamond)par3EntityLivingBase;

            if (!var3.getSaddled() && !var3.isChild())
            {
                var3.setSaddled(true);
                --par1ItemStack.stackSize;
            }

            return true;
        }
		if (par3EntityLivingBase instanceof EntityPigGold)
        {
            EntityPigGold var3 = (EntityPigGold)par3EntityLivingBase;

            if (!var3.getSaddled() && !var3.isChild())
            {
                var3.setSaddled(true);
                --par1ItemStack.stackSize;
            }

            return true;
        }
		if (par3EntityLivingBase instanceof EntityPigLeather)
        {
            EntityPigLeather var3 = (EntityPigLeather)par3EntityLivingBase;

            if (!var3.getSaddled() && !var3.isChild())
            {
                var3.setSaddled(true);
                --par1ItemStack.stackSize;
            }

            return true;
        }
		if (par3EntityLivingBase instanceof EntityPigIron)
        {
            EntityPigIron var3 = (EntityPigIron)par3EntityLivingBase;

            if (!var3.getSaddled() && !var3.isChild())
            {
                var3.setSaddled(true);
                --par1ItemStack.stackSize;
            }

            return true;
        }
		if (par3EntityLivingBase instanceof EntityPigFriendlyDiamond)
        {
            EntityPigFriendlyDiamond var3 = (EntityPigFriendlyDiamond)par3EntityLivingBase;

            if (!var3.getSaddled() && !var3.isChild())
            {
                var3.setSaddled(true);
                --par1ItemStack.stackSize;
            }

            return true;
        }
		if (par3EntityLivingBase instanceof EntityPigFriendlyGold)
        {
            EntityPigFriendlyGold var3 = (EntityPigFriendlyGold)par3EntityLivingBase;

            if (!var3.getSaddled() && !var3.isChild())
            {
                var3.setSaddled(true);
                --par1ItemStack.stackSize;
            }

            return true;
        }
		if (par3EntityLivingBase instanceof EntityPigFriendlyLeather)
        {
            EntityPigFriendlyLeather var3 = (EntityPigFriendlyLeather)par3EntityLivingBase;

            if (!var3.getSaddled() && !var3.isChild())
            {
                var3.setSaddled(true);
                --par1ItemStack.stackSize;
            }

            return true;
        }
		if (par3EntityLivingBase instanceof EntityPigFriendlyIron)
        {
            EntityPigFriendlyIron var3 = (EntityPigFriendlyIron)par3EntityLivingBase;

            if (!var3.getSaddled() && !var3.isChild())
            {
                var3.setSaddled(true);
                --par1ItemStack.stackSize;
            }

            return true;
        }
		if (par3EntityLivingBase instanceof EntityPig2)
        {
            EntityPig2 var3 = (EntityPig2)par3EntityLivingBase;

            if (!var3.getSaddled() && !var3.isChild())
            {
                var3.setSaddled(true);
                --par1ItemStack.stackSize;
            }

            return true;
        }
		
        else
        {
            return false;
        }
    }

    /**
     * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
     * the damage on the stack.
     */
    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
    {
        this.itemInteractionForEntity(par1ItemStack, (EntityPlayer)null, par2EntityLivingBase);
        return true;
    }
}
