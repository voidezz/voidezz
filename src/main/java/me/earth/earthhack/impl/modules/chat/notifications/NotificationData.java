package me.earth.earthhack.impl.modules.chat.notifications;

import me.earth.earthhack.api.module.data.DefaultData;

final class NotificationData extends DefaultData<Notifications>
{
    public NotificationData(Notifications module)
    {
        super(module);
        this.descriptions.put(module.modules,
                "Announces when modules get toggled.");
        this.descriptions.put(module.configure,
                "Configure the which modules should be announced.");
        this.descriptions.put(module.categories,
                "Click through the module categories.");
        this.descriptions.put(module.totems,
                "Announces when players in visual range pop a totem.");
        this.descriptions.put(module.bracketColor,
                "The color of the brackets in the string '[Calypso+]'");
        this.descriptions.put(module.calypsoColor,
                "The color of the word 'Calypso' in the string '[Calypso+]'");
        this.descriptions.put(module.plusColor,
                "The color of the plus symbol in the string '[Calypso+]'");
        this.register(module.totemAmountColor,
                "Color of the TotemPop Amount in the TotemPop Message.");
        this.register(module.totemColor,
                "Color of the TotemPop Message.");
        this.register(module.totemPlayerColor,
                "Color of the PlayerName the TotemPop Message.");
    }

    @Override
    public int getColor()
    {
        return 0xff34A1FF;
    }

    @Override
    public String getDescription()
    {
        return "Chat notifications for all sorts of stuff.";
    }

}
