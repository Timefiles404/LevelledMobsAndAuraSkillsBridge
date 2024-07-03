For [English](./README-en.md) | [中文]

一个简单的插件，为[LevelledMobs](https://github.com/ArcanePlugins/LevelledMobs/)和[AuraSkills](https://github.com/Archy-X/AuraSkills)插件的交互提供支持。

AuraSkills是一个提供了技能系统的插件，玩家可以完成一系列的任务来获取经验，提高技能等级，其中一项任务就是猎杀怪物，
而LevelledMobs是一个提供了怪物等级系统的插件，怪物的等级会随着玩家的等级提高而提高，这使得玩家在猎杀怪物时会遇到更强大的怪物，
增加了游戏的难度，但AuraSkills并没有提供对LevelledMobs的支持，这就导致了一个问题，玩家在猎杀怪物时的经验仍然是一个固定值，
破坏了游戏的平衡性。

这个插件就是为了解决这个问题而诞生的，它会根据怪物的等级来调整玩家在猎杀怪物时获得的经验值，使得玩家在猎杀高等级怪物时能够获得更多的经验，
从而更好地与LevelledMobs插件进行交互。

经验的发放基于这个[文件](./src/main/kotlin/ink/bluecloud/AuraSkillsListener.kt)中的`calculateExperienceByNonlinearFactor`函数计算，
我选择了一个非线性的函数来计算经验，使得玩家在猎杀高等级怪物时能够获得更多的经验，但并不是线性增长的，这样可以更好地控制经验的发放。