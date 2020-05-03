package com.example.simplewargame

import kotlin.random.Random

enum class Ammo constructor(
    private val damage: Int,
    private val critChance: Int,
    private val damageMultiplier: Double
) {
    STANDARD(100, 20, 1.4),
    HIGHDAMAGE(150, 0, 0.0),
    HIGHCRIT(65, 70, 2.0);

    fun calculateDamage(): Int {
        val critChance = Random(100).nextInt()
        return if (critChance <= this.critChance) {
            damage + (damage * damageMultiplier).toInt()
        } else damage
    }
}