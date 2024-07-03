package ink.bluecloud.utils

import org.bukkit.Bukkit
import org.bukkit.NamespacedKey
import org.bukkit.entity.Entity
import org.bukkit.persistence.PersistentDataType

class LevelledMobsManager {
    private var key: NamespacedKey? = null

    private val levelledMobsIsInstalled by lazy {
        val levelledMobsPlugin = Bukkit.getPluginManager().getPlugin("LevelledMobs")
        if (levelledMobsPlugin?.isEnabled == true) {
            key = NamespacedKey(levelledMobsPlugin, "level")
        }

        levelledMobsPlugin != null && levelledMobsPlugin.isEnabled
    }

    fun getLevelledMobsMobLevel(entity: Entity): Int {
        if (!levelledMobsIsInstalled) return 0

        return entity.persistentDataContainer.get(key!!, PersistentDataType.INTEGER) ?: 0
    }
}