package me.earth.earthhack.impl.modules.chat.antipoplag;

import me.earth.earthhack.api.module.data.DefaultData;

public class AntiPopLagData extends DefaultData<AntiPopLag> {
    public AntiPopLagData(AntiPopLag module) {
        super(module);
    }

    @Override
    public String getDescription()
    {
        return "Stops PopLag from lagging you.";
    }
}
