package me.acablade.bladeapi.features.impl;

import lombok.Getter;
import lombok.Setter;
import me.acablade.bladeapi.AbstractPhase;
import me.acablade.bladeapi.features.AbstractFeature;
import org.bukkit.Location;

import java.util.ArrayList;
import java.util.List;

/**
 * Holds the spawnpoint locations(extremely early stage of feature).
 */
@Getter
public class MapFeature extends AbstractFeature {

    private final List<Location> spawnPoints = new ArrayList<>();

    public MapFeature(AbstractPhase abstractPhase) {
        super(abstractPhase);
    }

}
