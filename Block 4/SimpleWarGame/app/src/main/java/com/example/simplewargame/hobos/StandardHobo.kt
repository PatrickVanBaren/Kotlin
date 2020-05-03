package com.example.simplewargame.warriors

import com.example.simplewargame.AbstractWarrior
import com.example.simplewargame.AbstractWeapon
import com.example.simplewargame.Weapons

class StandardWarrior(
    maxHealth: Int = 1000,
    dodge: Int = 100,
    accuracy: Int = 150,
    weapon: AbstractWeapon = Weapons.getGun(),
    health: Int = maxHealth, override var isKilled: Boolean = false
) : AbstractWarrior(maxHealth, dodge, accuracy, weapon, health) {

}