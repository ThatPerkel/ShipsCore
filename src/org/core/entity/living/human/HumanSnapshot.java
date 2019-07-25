package org.core.entity.living.human;

import org.core.entity.EntitySnapshot;
import org.core.entity.EntityType;

public interface HumanSnapshot extends Human, EntitySnapshot<LiveHuman> {

    @Override
    default EntityType<LiveHuman, HumanSnapshot> getType(){
        return Human.super.getType();
    }

}
