package me.earth.earthhack.impl.modules.chat.antilinks;

import me.earth.earthhack.impl.event.events.network.PacketEvent;
import me.earth.earthhack.impl.event.listeners.ModuleListener;

import me.earth.earthhack.impl.modules.chat.antilinks.util.LoggerMode;
import me.earth.earthhack.impl.util.text.ChatUtil;
import me.earth.earthhack.impl.util.text.TextColor;
import net.minecraft.network.play.server.SPacketChat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class ListenerChatPacket extends
        ModuleListener<AntiLinks, PacketEvent.Receive<SPacketChat>>
{
    private static final Logger LOGGER = LogManager.getLogger();

    public ListenerChatPacket(AntiLinks module)
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



            if (packet.getChatComponent().getUnformattedText().contains("https://") || (packet.getChatComponent().getUnformattedText().contains(".com")) || (packet.getChatComponent().getUnformattedText().contains(".net")) || (packet.getChatComponent().getUnformattedText().contains(".org"))) {
                event.setCancelled(true);
                ChatUtil.sendMessage(TextColor.WHITE + "[" + TextColor.DARK_PURPLE + "void" + TextColor.WHITE + "] " + "hid some stupid link some retard is trying to send u");
            }
        }
    }

}

