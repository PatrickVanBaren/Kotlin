package com.example.simplewargame

abstract class AbstractWeapon constructor(
    private val ammoCount: Int,
    private val fireType: FireType
) {
    var ammoType: MutableList<Ammo> = mutableListOf()

    var isAmmoPresence: Boolean = false
        get() = ammoType.isNotEmpty()

    abstract fun ammoCreated(): Ammo

    fun reload() {
        for (n in 0 until ammoCount) {
            ammoType.add(ammoCreated())
        }
    }

    fun getAmmo(): MutableList<Ammo> {
        val bulletsForShooting = mutableListOf<Ammo>()
        if (ammoType.isNotEmpty()) {
            for (n in 0 until fireType.shootsCount) {
                if (ammoType.isEmpty()) {
                    break
                }
                bulletsForShooting.add(ammoType.removeAt(0))
            }
        }
        return bulletsForShooting
    }
}