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
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemCarrotOnAStick2 extends Item
{
    public ItemCarrotOnAStick2(int par1)
    {
        super();
        this.setCreativeTab(CreativeTabs.tabTransport);
        this.setMaxStackSize(1);
        this.setMaxDamage(25);
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    public boolean isFull3D()
    {
        return true;
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns true if this item should be rotated by 180 degrees around the Y axis when being held in an entities
     * hands.
     */
    public boolean shouldRotateAroundWhenRendering()
    {
        return true;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (par3EntityPlayer.isRiding() && par3EntityPlayer.ridingEntity instanceof EntityPig)
        {
            EntityPig entitypig = (EntityPig)par3EntityPlayer.ridingEntity;

            if (entitypig.getAIControlledByPlayer().isControlledByPlayer() && par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() >= 7)
            {
                entitypig.getAIControlledByPlayer().boostSpeed();
                par1ItemStack.damageItem(7, par3EntityPlayer);

                if (par1ItemStack.stackSize == 0)
                {
                    ItemStack itemstack1 = new ItemStack(Items.fishing_rod);
                    itemstack1.setTagCompound(par1ItemStack.stackTagCompound);
                    return itemstack1;
                }
            }
        }
        
        if (par3EntityPlayer.isRiding() && par3EntityPlayer.ridingEntity instanceof EntityPigIron)
        {
            EntityPigIron var4 = (EntityPigIron)par3EntityPlayer.ridingEntity;

            if (var4.getAIControlledByPlayer().isControlledByPlayer() && par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() >= 7)
            {
                var4.getAIControlledByPlayer().boostSpeed();
                par1ItemStack.damageItem(7, par3EntityPlayer);

                if (par1ItemStack.stackSize == 0)
                {
                    return new ItemStack(Items.fishing_rod);
                }
            }
        }
		if (par3EntityPlayer.isRiding() && par3EntityPlayer.ridingEntity instanceof EntityPigDiamond)
        {
            EntityPigDiamond var4 = (EntityPigDiamond)par3EntityPlayer.ridingEntity;

            if (var4.getAIControlledByPlayer().isControlledByPlayer() && par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() >= 7)
            {
                var4.getAIControlledByPlayer().boostSpeed();
                par1ItemStack.damageItem(7, par3EntityPlayer);

                if (par1ItemStack.stackSize == 0)
                {
                    return new ItemStack(Items.fishing_rod);
                }
            }
        }
		if (par3EntityPlayer.isRiding() && par3EntityPlayer.ridingEntity instanceof EntityPigGold)
        {
            EntityPigGold var4 = (EntityPigGold)par3EntityPlayer.ridingEntity;

            if (var4.getAIControlledByPlayer().isControlledByPlayer() && par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() >= 7)
            {
                var4.getAIControlledByPlayer().boostSpeed();
                par1ItemStack.damageItem(7, par3EntityPlayer);

                if (par1ItemStack.stackSize == 0)
                {
                    return new ItemStack(Items.fishing_rod);
                }
            }
        }
		if (par3EntityPlayer.isRiding() && par3EntityPlayer.ridingEntity instanceof EntityPigLeather)
        {
            EntityPigLeather var4 = (EntityPigLeather)par3EntityPlayer.ridingEntity;

            if (var4.getAIControlledByPlayer().isControlledByPlayer() && par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() >= 7)
            {
                var4.getAIControlledByPlayer().boostSpeed();
                par1ItemStack.damageItem(7, par3EntityPlayer);

                if (par1ItemStack.stackSize == 0)
                {
                    return new ItemStack(Items.fishing_rod);
                }
            }
        }
		if (par3EntityPlayer.isRiding() && par3EntityPlayer.ridingEntity instanceof EntityPigFriendlyIron)
        {
            EntityPigFriendlyIron var4 = (EntityPigFriendlyIron)par3EntityPlayer.ridingEntity;

            if (var4.getAIControlledByPlayer().isControlledByPlayer() && par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() >= 7)
            {
                var4.getAIControlledByPlayer().boostSpeed();
                par1ItemStack.damageItem(7, par3EntityPlayer);

                if (par1ItemStack.stackSize == 0)
                {
                    return new ItemStack(Items.fishing_rod);
                }
            }
        }
		if (par3EntityPlayer.isRiding() && par3EntityPlayer.ridingEntity instanceof EntityPigFriendlyDiamond)
        {
            EntityPigFriendlyDiamond var4 = (EntityPigFriendlyDiamond)par3EntityPlayer.ridingEntity;

            if (var4.getAIControlledByPlayer().isControlledByPlayer() && par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() >= 7)
            {
                var4.getAIControlledByPlayer().boostSpeed();
                par1ItemStack.damageItem(7, par3EntityPlayer);

                if (par1ItemStack.stackSize == 0)
                {
                    return new ItemStack(Items.fishing_rod);
                }
            }
        }
		if (par3EntityPlayer.isRiding() && par3EntityPlayer.ridingEntity instanceof EntityPigFriendlyGold)
        {
            EntityPigFriendlyGold var4 = (EntityPigFriendlyGold)par3EntityPlayer.ridingEntity;

            if (var4.getAIControlledByPlayer().isControlledByPlayer() && par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() >= 7)
            {
                var4.getAIControlledByPlayer().boostSpeed();
                par1ItemStack.damageItem(7, par3EntityPlayer);

                if (par1ItemStack.stackSize == 0)
                {
                    return new ItemStack(Items.fishing_rod);
                }
            }
        }
		if (par3EntityPlayer.isRiding() && par3EntityPlayer.ridingEntity instanceof EntityPigFriendlyLeather)
        {
            EntityPigFriendlyLeather var4 = (EntityPigFriendlyLeather)par3EntityPlayer.ridingEntity;

            if (var4.getAIControlledByPlayer().isControlledByPlayer() && par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() >= 7)
            {
                var4.getAIControlledByPlayer().boostSpeed();
                par1ItemStack.damageItem(7, par3EntityPlayer);

                if (par1ItemStack.stackSize == 0)
                {
                    return new ItemStack(Items.fishing_rod);
                }
            }
        }
		if (par3EntityPlayer.isRiding() && par3EntityPlayer.ridingEntity instanceof EntityPig2)
        {
            EntityPig2 var4 = (EntityPig2)par3EntityPlayer.ridingEntity;

            if (var4.getAIControlledByPlayer().isControlledByPlayer() && par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() >= 7)
            {
                var4.getAIControlledByPlayer().boostSpeed();
                par1ItemStack.damageItem(7, par3EntityPlayer);

                if (par1ItemStack.stackSize == 0)
                {
                    return new ItemStack(Items.fishing_rod);
                }
            }
        }
		
		

        return par1ItemStack;
    }
}
