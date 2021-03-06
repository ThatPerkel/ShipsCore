package org.core.command.argument.arguments.source;

import org.core.CorePlugin;
import org.core.command.argument.arguments.CommandArgument;
import org.core.command.argument.context.CommandArgumentContext;
import org.core.command.argument.context.CommandContext;
import org.core.entity.living.human.AbstractHuman;
import org.core.entity.living.human.player.LivePlayer;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class LivePlayerArgument implements CommandArgument<LivePlayer> {

    private String id;

    public LivePlayerArgument(String id){
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public Map.Entry<LivePlayer, Integer> parse(CommandContext context, CommandArgumentContext<LivePlayer> argument) throws IOException {
        String command = context.getCommand()[argument.getFirstArgument()];
        Optional<LivePlayer> opPlayer = CorePlugin.getServer()
                .getOnlinePlayers()
                .stream()
                .filter(p -> p.getName().toLowerCase().equals(command.toLowerCase()))
                .findFirst();
        if(!opPlayer.isPresent()){
            throw new IOException("Player is not online");
        }
        return new AbstractMap.SimpleImmutableEntry<>(opPlayer.get(), argument.getFirstArgument() + 1);

    }

    @Override
    public List<String> suggest(CommandContext commandContext, CommandArgumentContext<LivePlayer> argument) {
        String command = commandContext.getCommand()[argument.getFirstArgument()];
        return CorePlugin.getServer()
                .getOnlinePlayers()
                .stream()
                .map(AbstractHuman::getName)
                .filter(p -> p.toLowerCase().startsWith(command.toLowerCase()))
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
    }
}
