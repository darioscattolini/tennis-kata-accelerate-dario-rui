/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package tennis.kata.accelerate

class App {
    val player1 = Player()
    val player2 = Player()

    // Ask for a better way to write parameter (enum?)
    fun getScore(ofPlayer1: Boolean): String {
        val player = if (ofPlayer1) player1 else player2
        val otherPlayer = if (ofPlayer1) player2 else player1

        var translatedScore = when (player.score) {
            0 -> "love"
            1 -> "15"
            2 -> "30"
            else -> getScoreAfter30(player, otherPlayer)
        }

        return translatedScore
    }

    private fun getScoreAfter30(
        scoringPlayer: Player,
        otherPlayer: Player
    ) = if (scoringPlayer.score >= 3 && otherPlayer.score >= 3) {
        if (scoringPlayer.score == otherPlayer.score) {
            "deuce"
        } else if (scoringPlayer.score - otherPlayer.score == 1) {
            "advantage"
        } else if (scoringPlayer.score - otherPlayer.score == 2) {
            "game"
        } else "40"
    } else {
        if (scoringPlayer.score - otherPlayer.score == 2) "game" else "40"
    }
}

fun main() {
    val app = App()
}
