package com.example.simplewargame

sealed class BattleState {

    class Progress(firstCommandHealth: Int, secondCommandHealth: Int): BattleState() {

        init {
            println("Здоровье команды А: $firstCommandHealth; " +
                    "Здоровье команды В: $secondCommandHealth")
        }
    }
    object CommandOneWin : BattleState() {
        private const val teamA = "Первая команда выиграла"
        init {
            println(teamA)
        }
    }
    object CommandTwoWin : BattleState() {
        private const val teamB = "Вторая команда выиграла"
        init {
            println(teamB)
        }
    }
    object DeadHeat : BattleState() {
        private const val deadHead = "Ничья"
        init {
            println(deadHead)
        }
    }
}