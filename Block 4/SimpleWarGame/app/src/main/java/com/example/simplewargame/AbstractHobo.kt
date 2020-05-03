package com.example.simplewargame

abstract class AbstractWarrior constructor(
    var maxHealth: Int,
    override val dodge: Int,
    private val accuracy: Int,
    private val weapon: AbstractWeapon,
    var health: Int = maxHealth
): WarriorInterface {

    override var isKilled: Boolean = false
        get() {
            return health == 0
        }

    override fun target(enemy: WarriorInterface) {
        if (weapon.isAmmoPresence) {
            if (enemy.dodge <= this.accuracy)
                enemy.attack(weapon.getAmmo().sumBy { it.calculateDamage() })
        } else weapon.reload()
    }

    override fun attack(damage: Int) {
        health -= damage
    }
}