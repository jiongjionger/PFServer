package org.bukkit.craftbukkit.entity;

import net.minecraft.entity.passive.EntityDonkey;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.Donkey;
import org.bukkit.entity.EntityType;

public class CraftDonkey extends CraftChestedHorse implements Donkey {

    public CraftDonkey(CraftServer server, EntityDonkey entity) {
        super(server, entity);
    }

    @Override
    public String toString() {
        return "CraftDonkey";
    }

    @Override
    public EntityType getType() {
        return EntityType.DONKEY;
    }

}
