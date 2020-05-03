package com.example.simplewargame

abstract class AbstractWarrior constructor(
    var maxHealth: Int,
    override val dodge: Int,
    private val accuracy: Int,
    private val weapon: AbstractWeapon,
    var health: Int = maxHealth
): WarriorInterface {

    override var isKilled: Boolean = false
        get() = health <= 0

    override fun attack(enemy: WarriorInterface) {
        if (weapon.isAmmoPresence) {
            if (enemy.dodge <= this.accuracy)
                enemy.takeDamage(weapon.getAmmo().sumBy { it.calculateDamage() })
        } else weapon.reload()
    }

    override fun takeDamage(damage: Int) {
        health -= damage
    }
}