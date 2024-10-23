package shmoneelse.bustednomore.hullmods;

import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.combat.BaseHullMod;
import com.fs.starfarer.api.combat.ShipAPI;

public class dmodrepair extends BaseHullMod {

    @Override
    public void applyEffectsAfterShipCreation(ShipAPI ship, String id) {
        String sprite = Global.getSettings().getSpriteName("damage","dmod_overlay_none");
        ship.setDHullOverlay(sprite);
    }
}