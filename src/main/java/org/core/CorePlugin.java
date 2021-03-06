package org.core;

import org.core.config.ConfigurationFormat;
import org.core.config.ConfigurationStream;
import org.core.event.EventManager;
import org.core.platform.Platform;
import org.core.platform.PlatformServer;
import org.core.schedule.SchedulerBuilder;
import org.core.source.command.ConsoleSource;
import org.core.text.Text;
import org.core.text.colour.TextColour;
import org.core.text.style.TextStyle;
import org.core.text.type.ColouredText;
import org.core.text.type.JoinedText;
import org.core.text.type.StyledText;
import org.core.world.boss.ServerBossBar;

import java.io.File;

public interface CorePlugin {

    Platform getRawPlatform();

    EventManager getRawEventManager();

    ConsoleSource getRawConsole();

    SchedulerBuilder createRawSchedulerBuilder();

    ConfigurationStream.ConfigurationFile createRawConfigurationFile(File file, ConfigurationFormat type);

    PlatformServer getRawServer();

    @Deprecated
    Text textBuilder(String chars);

    ColouredText colouredTextBuilder(TextColour colour, String text, TextStyle... styles);
    StyledText styleTextBuilder(String text, TextStyle... styles);
    JoinedText joinTextBuilder(org.core.text.type.Text... texts);

    ServerBossBar bossBuilder();

    static Platform getPlatform(){
        return CorePlugin.CoreImplementation.getImplementation().getRawPlatform();
    }

    static ConsoleSource getConsole(){
        return CorePlugin.CoreImplementation.getImplementation().getRawConsole();
    }

    @Deprecated
    static Text buildText(String text){
        return CorePlugin.CoreImplementation.getImplementation().textBuilder(text);
    }

    static StyledText buildStyledText(String text, TextStyle... style){
        return CorePlugin.CoreImplementation.getImplementation().styleTextBuilder(text, style);
    }

    static ColouredText buildColouredText(TextColour colour, String text, TextStyle... style){
        return CorePlugin.CoreImplementation.getImplementation().colouredTextBuilder(colour, text, style);
    }

    static JoinedText buildJoinedText(org.core.text.type.Text... texts){
        return CorePlugin.CoreImplementation.getImplementation().joinTextBuilder(texts);
    }

    static SchedulerBuilder createSchedulerBuilder(){
        return CorePlugin.CoreImplementation.getImplementation().createRawSchedulerBuilder();
    }

    static PlatformServer getServer(){
        return CorePlugin.CoreImplementation.getImplementation().getRawServer();
    }

    static EventManager getEventManager(){
        return CorePlugin.CoreImplementation.getImplementation().getRawEventManager();
    }

    static ConfigurationStream.ConfigurationFile createConfigurationFile(File file, ConfigurationFormat type){
        return CorePlugin.CoreImplementation.getImplementation().createRawConfigurationFile(file, type);
    }

    static ServerBossBar createBossBar(){
        return CorePlugin.CoreImplementation.getImplementation().bossBuilder();
    }

    abstract class CoreImplementation implements CorePlugin {

        protected static CoreImplementation IMPLEMENTATION;

        public static CoreImplementation getImplementation(){
            return IMPLEMENTATION;
        }

    }
}