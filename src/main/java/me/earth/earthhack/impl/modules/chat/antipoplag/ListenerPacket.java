package me.earth.earthhack.impl.modules.chat.antipoplag;

import me.earth.earthhack.impl.event.events.network.PacketEvent;
import me.earth.earthhack.impl.event.listeners.ModuleListener;

import me.earth.earthhack.impl.modules.chat.antipoplag.util.LoggerMode;
import me.earth.earthhack.impl.util.text.ChatUtil;
import me.earth.earthhack.impl.util.text.TextColor;
import net.minecraft.network.play.server.SPacketChat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class ListenerPacket extends
        ModuleListener<AntiPopLag, PacketEvent.Receive<SPacketChat>>
{
    private static final Logger LOGGER = LogManager.getLogger();

    public ListenerPacket(AntiPopLag module)
    {

        super(module, PacketEvent.Receive.class, SPacketChat.class);

    }

    @Override
    public void invoke(PacketEvent.Receive<SPacketChat> event)
    {
        if (module.log.getValue() == LoggerMode.Async)
        {
            LOGGER.info("[CHAT] {}", event.getPacket()
                    .getChatComponent()
                    .getUnformattedText()
                    .replaceAll("\r", "\\\\r")
                    .replaceAll("\n", "\\\\n"));

            SPacketChat packet = event.getPacket();

            // TODO: make this way more pretty because this looks like a dogs poop

            if (packet.getChatComponent().getUnformattedText().contains("\\u0101") ||
                    (packet.getChatComponent().getUnformattedText().contains("\\u0201") ||
                            (packet.getChatComponent().getUnformattedText().contains("\\u0301") ||
                                    (packet.getChatComponent().getUnformattedText().contains("\\u0401")))) ||
                                        (packet.getChatComponent().getUnformattedText().contains("\\u0601")) ||
                                            (packet.getChatComponent().getUnformattedText().contains("\\u0701")) ||
                                                (packet.getChatComponent().getUnformattedText().contains("\\u0801")) ||
                                                    (packet.getChatComponent().getUnformattedText().contains("\\u0901")) ||
                                                        (packet.getChatComponent().getUnformattedText().contains("\\u0A01")) ||
                                                            (packet.getChatComponent().getUnformattedText().contains("\\u0B01")) ||
                                                                (packet.getChatComponent().getUnformattedText().contains("\\u0E01")) ||
                                                                    (packet.getChatComponent().getUnformattedText().contains("\\u0F01")) ||
                                                                        (packet.getChatComponent().getUnformattedText().contains("\\u1001")) ||
                                                                            (packet.getChatComponent().getUnformattedText().contains("\\u1101")) ||
                                                                                (packet.getChatComponent().getUnformattedText().contains("\\u1201")) ||
                                                                                    (packet.getChatComponent().getUnformattedText().contains("\\u1301")) ||
                                                                                        (packet.getChatComponent().getUnformattedText().contains("\\u1401")) ||
                                                                                            (packet.getChatComponent().getUnformattedText().contains("\\u1501")) ||
                                                                                        (packet.getChatComponent().getUnformattedText().contains("\\u1601")) ||
                                                                                    (packet.getChatComponent().getUnformattedText().contains("\\u1701")) ||
                                                                                (packet.getChatComponent().getUnformattedText().contains("\\u1801")) ||
                                                                            (packet.getChatComponent().getUnformattedText().contains("\\u1901")) ||
                                                                        (packet.getChatComponent().getUnformattedText().contains("\\u1A01")) ||
                                                                    (packet.getChatComponent().getUnformattedText().contains("\\u1B01")) ||
                                                                (packet.getChatComponent().getUnformattedText().contains("\\u1C01")) ||
                                                            (packet.getChatComponent().getUnformattedText().contains("\\u1D01")) ||
                                                        (packet.getChatComponent().getUnformattedText().contains("\\u1E01")) ||
                                                    (packet.getChatComponent().getUnformattedText().contains("\\u1F01")) ||
                                                (packet.getChatComponent().getUnformattedText().contains("\\u2101")) ||
                                            (packet.getChatComponent().getUnformattedText().contains("\\u2201")) ||
                                        (packet.getChatComponent().getUnformattedText().contains("\\u2301")) ||
                                    (packet.getChatComponent().getUnformattedText().contains("\\u2401")) ||
                                (packet.getChatComponent().getUnformattedText().contains("\\u2501")) ||
                            (packet.getChatComponent().getUnformattedText().contains("\\u2701")) ||
                        (packet.getChatComponent().getUnformattedText().contains("\\u2801")) ||
                            (packet.getChatComponent().getUnformattedText().contains("\\u2901")) ||
                                (packet.getChatComponent().getUnformattedText().contains("\\u2A01")) ||
                                    (packet.getChatComponent().getUnformattedText().contains("\\u2B01")) ||
                                        (packet.getChatComponent().getUnformattedText().contains("\\u2C01")) ||
                                            (packet.getChatComponent().getUnformattedText().contains("\\u2D01")) ||
                                                (packet.getChatComponent().getUnformattedText().contains("\\u2E01")) ||
                                                    (packet.getChatComponent().getUnformattedText().contains("\\u2F01")) ||
                                                        (packet.getChatComponent().getUnformattedText().contains("\\u3001")) ||
                                                            (packet.getChatComponent().getUnformattedText().contains("\\u3101")) ||
                                                                (packet.getChatComponent().getUnformattedText().contains("\\u3201")) ||
                                                                    (packet.getChatComponent().getUnformattedText().contains("\\u3301")) ||
                                                                        (packet.getChatComponent().getUnformattedText().contains("\\u3401")) ||
                                                                            (packet.getChatComponent().getUnformattedText().contains("\\u3501")) ||
                                                                                (packet.getChatComponent().getUnformattedText().contains("\\u3601")) ||
                                                                                    (packet.getChatComponent().getUnformattedText().contains("\\u3701")) ||
                                                                                        (packet.getChatComponent().getUnformattedText().contains("\\u3801")) ||
                                                                                            (packet.getChatComponent().getUnformattedText().contains("\\u3901")) ||
                                                                                                (packet.getChatComponent().getUnformattedText().contains("\\u3A01")) ||
                                                                                            (packet.getChatComponent().getUnformattedText().contains("\\u3B01")) ||
                                                                                        (packet.getChatComponent().getUnformattedText().contains("\\u3C01")) ||
                                                                                    (packet.getChatComponent().getUnformattedText().contains("\\u3D01")) ||
                                                                                (packet.getChatComponent().getUnformattedText().contains("\\u3E01")) ||
                                                                            (packet.getChatComponent().getUnformattedText().contains("\\u3F01")) ||
                                                                        (packet.getChatComponent().getUnformattedText().contains("\\u4001")) ||
                                                                    (packet.getChatComponent().getUnformattedText().contains("\\u4101")) ||
                                                                (packet.getChatComponent().getUnformattedText().contains("\\u4201")) ||
                                                            (packet.getChatComponent().getUnformattedText().contains("\\u4301")) ||
                                                        (packet.getChatComponent().getUnformattedText().contains("\\u4401")) ||
                                                    (packet.getChatComponent().getUnformattedText().contains("\\u4501")) ||
                                                (packet.getChatComponent().getUnformattedText().contains("\\u4601")) ||
                                            (packet.getChatComponent().getUnformattedText().contains("\\u4701")) ||
                                        (packet.getChatComponent().getUnformattedText().contains("\\u4801")) ||
                                    (packet.getChatComponent().getUnformattedText().contains("\\u4901")) ||
                                (packet.getChatComponent().getUnformattedText().contains("\\u4A01")) ||
                            (packet.getChatComponent().getUnformattedText().contains("\\u4B01")) ||
                        (packet.getChatComponent().getUnformattedText().contains("\\u4C01")) ||
                    (packet.getChatComponent().getUnformattedText().contains("\\u4D01")) ||
                        (packet.getChatComponent().getUnformattedText().contains("\\u4E01")) ||
                            (packet.getChatComponent().getUnformattedText().contains("\\u4F01")) ||
                                (packet.getChatComponent().getUnformattedText().contains("\\u5001")) ||
                                    (packet.getChatComponent().getUnformattedText().contains("\\u5101")) ||
                                        (packet.getChatComponent().getUnformattedText().contains("\\u5201")) ||
                                            (packet.getChatComponent().getUnformattedText().contains("\\u5301")) ||
                                                (packet.getChatComponent().getUnformattedText().contains("\\u5401")) ||
                                                    (packet.getChatComponent().getUnformattedText().contains("\\u5501")) ||
                                                        (packet.getChatComponent().getUnformattedText().contains("\\u5601")) ||
                                                            (packet.getChatComponent().getUnformattedText().contains("\\u5701")) ||
                                                                (packet.getChatComponent().getUnformattedText().contains("\\u5801")) ||
                                                                    (packet.getChatComponent().getUnformattedText().contains("\\u5901")) ||
                                                                        (packet.getChatComponent().getUnformattedText().contains("\\u5A01")) ||
                                                                            (packet.getChatComponent().getUnformattedText().contains("\\u5B01")) ||
                                                                                (packet.getChatComponent().getUnformattedText().contains("\\u5C01")) ||
                                                                                    (packet.getChatComponent().getUnformattedText().contains("\\u5D01")) ||
                                                                                        (packet.getChatComponent().getUnformattedText().contains("\\u5E01")) ||
                                                                                            (packet.getChatComponent().getUnformattedText().contains("\\u5F01")) ||
                                                                                                (packet.getChatComponent().getUnformattedText().contains("\\u6001")) ||
                                                                                                    (packet.getChatComponent().getUnformattedText().contains("\\u6101")) ||
                                                                                                        (packet.getChatComponent().getUnformattedText().contains("\\u6201")) ||
                                                                                                    (packet.getChatComponent().getUnformattedText().contains("\\u6301")) ||
                                                                                                (packet.getChatComponent().getUnformattedText().contains("\\u6401")) ||
                                                                                            (packet.getChatComponent().getUnformattedText().contains("\\u6501")) ||
                                                                                        (packet.getChatComponent().getUnformattedText().contains("\\u6601")) ||
                                                                                    (packet.getChatComponent().getUnformattedText().contains("\\u6701")) ||
                                                                                (packet.getChatComponent().getUnformattedText().contains("\\u6801")) ||
                                                                            (packet.getChatComponent().getUnformattedText().contains("\\u6901")) ||
                                                                        (packet.getChatComponent().getUnformattedText().contains("\\u6A01")) ||
                                                                    (packet.getChatComponent().getUnformattedText().contains("\\u6B01")) ||
                                                                (packet.getChatComponent().getUnformattedText().contains("\\u6C01")) ||
                                                            (packet.getChatComponent().getUnformattedText().contains("\\u6D01")) ||
                                                        (packet.getChatComponent().getUnformattedText().contains("\\u6E01")) ||
                                                    (packet.getChatComponent().getUnformattedText().contains("\\u6F01")) ||
                                                (packet.getChatComponent().getUnformattedText().contains("\\u7001")) ||
                                            (packet.getChatComponent().getUnformattedText().contains("\\u7101"))) {
                event.setCancelled(true);
                ChatUtil.sendMessage(TextColor.WHITE + "[" + TextColor.DARK_PURPLE + "void" + TextColor.WHITE + "] " + "hid some stupid lag message idk");
            }
        }
    }
}

