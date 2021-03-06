package me.acablade.bladeapi.objects;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * @author Acablade/oz
 */
@Data
public class Team {

    private final String name;
    private final Object identifier;
    private final int teamSize;
    private final Set<UUID> playerList = new HashSet<>();

}
