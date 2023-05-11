package me.earth.earthhack.impl.modules.chat.antipoplag;

import me.earth.earthhack.api.module.Module;
import me.earth.earthhack.api.module.util.Category;
import me.earth.earthhack.api.setting.Setting;
import me.earth.earthhack.api.setting.settings.EnumSetting;
import me.earth.earthhack.impl.modules.chat.antipoplag.util.LoggerMode;

public class AntiPopLag extends Module {
    protected final Setting<LoggerMode> log =
            register(new EnumSetting<>("Log", LoggerMode.Async));


    public AntiPopLag() {
        super("AntiPopLag", Category.Chat);
        this.setData(new AntiPopLagData(this));
        this.listeners.add(new ListenerPacket(this));
    }
}
