package me.earth.earthhack.impl.modules.chat.antiopp;

import me.earth.earthhack.api.module.data.DefaultData;

final class AntiOppData extends DefaultData<AntiOpp>
{

    public AntiOppData(AntiOpp module) {
        super(module);
    }

    @Override
    public String getDescription()
    {
        return "Sends a Chat message and plays a narrators voice when a player is detected around you. (WARNING: May possibly contain LOUD audio.)";
    }

}

