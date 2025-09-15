package com.teamtea.es_x_bwg;



import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
// @Mod(EclipticSeasonsForOhTheBiomesWeveGone.MODID)
public class EclipticSeasonsForOhTheBiomesWeveGone {
    public static final String MODID = "es_x_bwg";
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger(EclipticSeasonsForOhTheBiomesWeveGone.MODID);

    public EclipticSeasonsForOhTheBiomesWeveGone() {
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
}
