package com.example.simplewargame.warriors

import com.example.simplewargame.AbstractWarrior
import com.example.simplewargame.AbstractWeapon
import com.example.simplewargame.Weapons

class SlimWarrior(
    maxHealth: Int = 500,
    dodge: Int = 160,
    accuracy: Int = 160,
    weapon: AbstractWeapon = Weapons.getGun(),
    health: Int = maxHealth, override var isKilled: Boolean = false
) : AbstractWarrior(maxHealth, dodge, accuracy, weapon, health) {

}