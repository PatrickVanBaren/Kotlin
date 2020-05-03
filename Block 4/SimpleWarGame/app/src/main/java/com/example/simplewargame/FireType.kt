package com.example.simplewargame

sealed class FireType constructor(val shootsCount: Int) {

    class BurstShooting: FireType(3)
    class SingleShooting: FireType(1)
}