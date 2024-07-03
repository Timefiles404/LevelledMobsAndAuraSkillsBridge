For [English] | [中文](./README.md)

A simple plugin that add a bridge for [LevelledMobs](https://github.com/ArcanePlugins/LevelledMobs/)和[AuraSkills](https://github.com/Archy-X/AuraSkills).

AuraSkills is a plugin that provides a skill system where players 
can complete a series of tasks to gain experience and improve 
their skill levels. One of these tasks is to hunt monsters. 
On the other hand, LevelledMobs is a plugin that provides a 
monster leveling system, where the level of the monsters 
increases as the player's level increases. This makes the 
monsters stronger and the game more challenging. However, 
AuraSkills does not support LevelledMobs, leading to an 
issue where the experience gained from hunting monsters 
remains fixed, disrupting the game balance.

This plugin was created to address this issue. It adjusts 
the experience gained from hunting monsters based on 
their levels, allowing players to earn more experience 
when hunting higher-level monsters, thus better integrating 
with the LevelledMobs plugin.

The experience distribution is calculated based on the functions(`calculateExperienceByNonlinearFactor`)
in this [file](./src/main/kotlin/ink/bluecloud/AuraSkillsListener.kt). I chose a nonlinear function to calculate the 
experience, allowing players to gain more experience when hunting
higher-level monsters, but not in a linear fashion. This approach
better controls the distribution of experience.