package org.core.world.position.block.entity.banner.pattern;

import org.core.CorePlugin;
import org.core.utils.Guaranteed;

public class PatternLayerTypes implements Guaranteed<PatternLayerType> {

    public static final PatternLayerType BASE = CorePlugin.getPlatform().get(new PatternLayerTypes("minecraft:base"));

    private String id;

    private PatternLayerTypes(String id){
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getName() {
        String nameLowercase = getId().split(":")[1];
        char first = Character.toUpperCase(nameLowercase.charAt(0));
        return first + nameLowercase.substring(1);
    }
}
