package com.example.simplewargame

interface WarriorInterface {
    var isKilled: Boolean
    val dodge: Int
    fun target(enemy: WarriorInterface)
    fun attack(damage: Int)
}