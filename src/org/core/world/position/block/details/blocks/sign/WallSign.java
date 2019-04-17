package org.core.world.position.block.details.blocks.sign;

import org.core.world.direction.Direction;
import org.core.world.direction.FourFacingDirection;
import org.core.world.position.block.details.DirectionalAttachedDetails;

public interface WallSign extends GeneralSign, DirectionalAttachedDetails {

    @Override
    default Direction[] getFacingDirections(){
        return FourFacingDirection.getFourFacingDirections();
    }

}