package com.example.simplewargame

import kotlin.random.Random

object Weapons {

//    object Pistol: AbstractWeapon(15, FireType.SingleShooting()) {
//        override fun ammoCreated(): Ammo {
//            return Ammo.STANDARD
//        }
//
//    }

    val pistol = object: AbstractWeapon(15, FireType.SingleShooting()) {
        override fun ammoCreated(): Ammo {
            return Ammo.STANDARD
        }
    }

    val smg = object: AbstractWeapon(30, FireType.BurstShooting()) {
        override fun ammoCreated(): Ammo {
            return Ammo.HIGHCRIT
        }
    }

    val sniperRifle = object: AbstractWeapon(10, FireType.SingleShooting()) {
        override fun ammoCreated(): Ammo {
            return Ammo.HIGHDAMAGE
        }
    }

    val machineGun = object: AbstractWeapon(120, FireType.BurstShooting()) {
        override fun ammoCreated(): Ammo {
            return Ammo.STANDARD
        }
    }

    fun getGun(): AbstractWeapon {
        var gun = pistol
        when (Random.nextInt(1, 4)) {
            1 -> gun = pistol
            2 -> gun = smg
            3 -> gun = sniperRifle
            4 -> gun = machineGun
        }
        return gun
    }
}