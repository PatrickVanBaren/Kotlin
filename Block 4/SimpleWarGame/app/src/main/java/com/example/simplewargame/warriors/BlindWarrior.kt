package com.example.simplewargame.warriors

import com.example.simplewargame.AbstractWarrior
import com.example.simplewargame.AbstractWeapon
import com.example.simplewargame.Weapons

class BlindWarrior(
    maxHealth: Int = 500,
    dodge: Int = 0,
    accuracy: Int = 0,
    weapon: AbstractWeapon = Weapons.getGun(),
    health: Int = maxHealth, override var isKilled: Boolean = false
) : AbstractWarrior(maxHealth, dodge, accuracy, weapon, health) {

}