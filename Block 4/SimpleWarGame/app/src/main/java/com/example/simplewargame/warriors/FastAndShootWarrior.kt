package com.example.simplewargame.warriors

import com.example.simplewargame.AbstractWarrior
import com.example.simplewargame.AbstractWeapon
import com.example.simplewargame.Weapons

class FastAndShootWarrior(
    maxHealth: Int = 750,
    dodge: Int = 150,
    accuracy: Int = 150,
    weapon: AbstractWeapon = Weapons.getGun(),
    health: Int = maxHealth, override var isKilled: Boolean = false
) : AbstractWarrior(maxHealth, dodge, accuracy, weapon, health) {

}