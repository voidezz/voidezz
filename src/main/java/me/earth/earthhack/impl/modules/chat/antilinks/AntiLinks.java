package me.earth.earthhack.impl.modules.chat.antilinks;


import me.earth.earthhack.api.module.Module;
import me.earth.earthhack.api.module.util.Category;
import me.earth.earthhack.api.setting.Setting;
import me.earth.earthhack.api.setting.settings.EnumSetting;
import me.earth.earthhack.impl.modules.chat.antilinks.util.LoggerMode;

public class AntiLinks extends Module {

    public final Setting<LoggerMode> log =
            register(new EnumSetting<>("Log", LoggerMode.Async));

    public AntiLinks() {
        super("AntiChatLinks", Category.Chat);
        this.setData(new AntiLinksData(this));
        this.listeners.add(new ListenerChatPacket(this));

    }

}
