package com.example.simplewargame

fun main() {
    println("Введите количество войнов в каждой команде")
    val warriorCount = readLine()?.toIntOrNull() ?: return
    val teamA = Team(warriorCount)
    val teamB = Team(warriorCount)

    val battle = Battle(teamA, teamB)
    println("Начало битвы")
    battle.getProgress()

    while (!battle.isWarOver) {
        battle.nextRound()
        battle.getProgress()
    }
}