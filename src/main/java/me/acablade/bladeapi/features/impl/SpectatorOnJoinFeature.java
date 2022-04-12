package me.acablade.bladeapi.features.impl;

import me.acablade.bladeapi.AbstractPhase;
import me.acablade.bladeapi.features.AbstractFeature;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * @author Acablade/oz
 */

public class SpectatorOnJoinFeature extends AbstractFeature {

    public SpectatorOnJoinFeature(AbstractPhase abstractPhase) {
        super(abstractPhase);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        getAbstractPhase().getGame().getGameData().getSpectatorList().add(player.getUniqueId());
        player.setGameMode(GameMode.SPECTATOR);
    }
}