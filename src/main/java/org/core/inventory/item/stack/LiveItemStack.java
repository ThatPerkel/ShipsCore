package org.core.inventory.item.stack;

import org.core.CorePlugin;
import org.core.entity.InventoryHoldingEntity;
import org.core.entity.ItemHoldingEntity;
import org.core.entity.LiveEntity;
import org.core.world.WorldExtent;
import org.core.world.position.ExactPosition;
import org.core.world.position.block.entity.LiveTileEntity;
import org.core.world.position.block.entity.container.ContainerTileEntity;

import java.util.Optional;

public interface LiveItemStack extends ItemStack {

    default Optional<ExactPosition> getPosition(){
        for (WorldExtent extent : CorePlugin.getServer().getWorlds()){
            for(LiveTileEntity tile : extent.getTileEntities()){
                if(!(tile instanceof ContainerTileEntity)){
                    continue;
                }
                ContainerTileEntity cTile = (ContainerTileEntity) tile;
                if (cTile.getInventory().getSlots().stream().filter(i -> i.getItem().isPresent()).anyMatch(i -> i.getItem().get().equals(this))){
                    return Optional.of(tile.getPosition().toExactPosition());
                }
            }
            for (LiveEntity entity : extent.getEntities()){
                if(entity instanceof ItemHoldingEntity){
                    ItemHoldingEntity ihEntity = (ItemHoldingEntity)entity;
                    Optional<ItemStack> opItem = ihEntity.getHoldingItem().getItem();
                    if(!opItem.isPresent()){
                        continue;
                    }
                    if(opItem.get().equals(this)){
                        return Optional.of(entity.getPosition());
                    }
                }
                if(entity instanceof InventoryHoldingEntity){
                    InventoryHoldingEntity ihEntity = (InventoryHoldingEntity)entity;
                    if (ihEntity.getInventory().getSlots().stream().filter(slot -> slot.getItem().isPresent()).anyMatch(slot -> slot.getItem().get().equals(this))){
                        return Optional.of(entity.getPosition());
                    }
                }
            }
        }
        return Optional.empty();
    }
}