package com.example.simplewargame

interface WarriorInterface {
    var isKilled: Boolean
    val dodge: Int
    fun attack(enemy: WarriorInterface)
    fun takeDamage(damage: Int)
}