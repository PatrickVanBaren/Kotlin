package com.example.simplewargame

class Battle(private val teamA: Team, private val teamB: Team) {

    var isWarOver = false
        get() = teamA.getTeamHealth() <= 0 || teamB.getTeamHealth() <= 0

    fun getProgress(): BattleState {
        val statusTeamA = teamA.getTeamHealth()
        val statusTeamB = teamB.getTeamHealth()
        return when {
            statusTeamA <= 0 -> {
                isWarOver = true
                BattleState.CommandTwoWin
            }
            statusTeamB <= 0 -> {
                isWarOver = true
                BattleState.CommandOneWin
            }
            statusTeamA <= 0 && statusTeamB <= 0 -> {
                isWarOver = true
                BattleState.DeadHeat
            }
            else -> BattleState.Progress(statusTeamA, statusTeamB)
        }
    }

    fun nextRound() {
        if (teamA.getTeamHealth() <= 0 || teamB.getTeamHealth() <=0) return
        teamA.warriorList.shuffle()
        teamB.warriorList.shuffle()
        for (i in teamA.warriorList.indices) {
            if (!teamA.warriorList[i].isKilled && !teamB.warriorList[i].isKilled) {
                teamA.warriorList[i].attack(teamB.warriorList[i])
                teamB.warriorList[i].attack(teamA.warriorList[i])
            }
        }
    }
}