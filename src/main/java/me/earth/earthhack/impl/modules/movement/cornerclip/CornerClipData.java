package me.earth.earthhack.impl.modules.movement.cornerclip;

import me.earth.earthhack.api.module.data.DefaultData;

final class CornerClipData extends DefaultData<CornerClip>
{

    public CornerClipData(CornerClip module)
    {

        super(module);
        this.descriptions.put(module.delay, "Delay ticks");

    }

    @Override
    public int getColor()
    {
        return 0xffffffff;
    }

    @Override
    public String getDescription()
    {
        return "Clips through corners. It's described in the name.";
    }

}
