package xyz.unifycraft.template

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import org.apache.logging.log4j.LogManager

@Mod(
    name = TemplateMod.NAME,
    version = TemplateMod.VERSION,
    modid = TemplateMod.ID
) class TemplateMod {
    @Mod.EventHandler
    fun initialize(event: FMLInitializationEvent) {
        logger.info("Hello from $NAME!")
    }

    companion object {
        const val NAME = "@NAME@"
        const val ID = "@ID@"
        const val VERSION = "@VERSION@"

        @JvmStatic val logger = LogManager.getLogger(NAME)
    }
}