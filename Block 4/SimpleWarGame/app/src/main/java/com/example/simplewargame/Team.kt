package com.example.simplewargame

import com.example.simplewargame.warriors.*
import kotlin.random.Random

class Team constructor (warriorCount: Int) {

    var warriorList: MutableList<AbstractWarrior> = mutableListOf()


    fun getTeamHealth(): Int {
        return warriorList.sumBy { it.health }
    }

    init {
        for (n in 0 until warriorCount) {
            when (Random.nextInt(1, 5)) {
                1 -> warriorList.add(StandardWarrior())
                2 -> warriorList.add(SlimWarrior())
                3 -> warriorList.add(FatWarrior())
                4 -> warriorList.add(FastAndShootWarrior())
                5 -> warriorList.add(BlindWarrior())
            }
        }
    }
}