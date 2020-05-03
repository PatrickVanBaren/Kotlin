package com.example.simplewargame.warriors

import com.example.simplewargame.AbstractWarrior
import com.example.simplewargame.AbstractWeapon
import com.example.simplewargame.Weapons

class FatWarrior(
    maxHealth: Int = 1500,
    dodge: Int = 50,
    accuracy: Int = 100,
    weapon: AbstractWeapon = Weapons.getGun(),
    health: Int = maxHealth, override var isKilled: Boolean = false
) : AbstractWarrior(maxHealth, dodge, accuracy, weapon, health) {

}