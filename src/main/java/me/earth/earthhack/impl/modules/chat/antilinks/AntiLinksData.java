package me.earth.earthhack.impl.modules.chat.antilinks;

import me.earth.earthhack.api.module.data.DefaultData;

public class AntiLinksData extends DefaultData<AntiLinks> {
    public AntiLinksData(AntiLinks module) {
        super(module);
    }

    @Override
    public String getDescription()
    {
        return "Stops people from sending links into the chat";
    }
}
