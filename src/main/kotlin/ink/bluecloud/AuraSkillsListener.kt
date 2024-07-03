package ink.bluecloud.listener

import dev.aurelium.auraskills.api.event.skill.EntityXpGainEvent
import ink.bluecloud.utils.LevelledMobsManager
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener

class AuraSkillsListener: Listener {
    val levelledMobsManager = LevelledMobsManager()

    @EventHandler
    fun onGetXp(event: EntityXpGainEvent) {
        val level = levelledMobsManager.getLevelledMobsMobLevel(event.attacked)
        event.amount = calculateExperienceByNonlinearFactor(level, event.amount, event.player.level)
    }

    fun calculateExperienceByNonlinearFactor(monsterLevel: Int, baseExp: Double, playerLevel: Int): Double {
        val levelDifference = monsterLevel - playerLevel
        val experienceFactor = Math.pow(1.03, levelDifference.toDouble())  // 降低指数基数，使曲线更平滑
        // 调整后的Sigmoid函数参数，使曲线在怪物等级高于玩家时更平滑
        val penaltyFactor = 0.5 + 0.5 / (1.0 + Math.exp(-0.5 * levelDifference.toDouble()))
        return baseExp * experienceFactor * Math.max(1.3, penaltyFactor)
    }
}