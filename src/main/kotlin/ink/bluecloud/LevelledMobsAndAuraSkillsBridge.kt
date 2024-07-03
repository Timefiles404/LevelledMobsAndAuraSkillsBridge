package ink.bluecloud

import ink.bluecloud.listener.AuraSkillsListener
import org.bukkit.plugin.java.JavaPlugin

class LevelledMobsAndAuraSkillsBridge: JavaPlugin() {
    override fun onEnable() {
        server.pluginManager.registerEvents(AuraSkillsListener(), this)
        logger.info("LevelledMobs and AuraSkills are bridged now!")
    }
}