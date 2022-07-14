package tennis.kata.accelerate

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class AppTest {

    @Test
    fun hasTwoPlayers() {
        val classUnderTest = App()
        Assertions.assertThat(classUnderTest.player1).isInstanceOf(Player::class.java)
        Assertions.assertThat(classUnderTest.player2).isInstanceOf(Player::class.java)
    }

    @Test
    fun returnLoveForZero() {
        val classUnderTest = App()
        classUnderTest.player1.score = 0
        classUnderTest.player2.score = 0

        Assertions.assertThat(classUnderTest.getScore(true)).isEqualTo("love")
        Assertions.assertThat(classUnderTest.getScore(false)).isEqualTo("love")
    }

    @Test
    fun return15ForOne() {
        val classUnderTest = App()
        classUnderTest.player1.score = 1
        classUnderTest.player2.score = 1

        Assertions.assertThat(classUnderTest.getScore(true)).isEqualTo("15")
        Assertions.assertThat(classUnderTest.getScore(false)).isEqualTo("15")
    }

    @Test
    fun return30ForTwo() {
        val classUnderTest = App()
        classUnderTest.player1.score = 2
        classUnderTest.player2.score = 2

        Assertions.assertThat(classUnderTest.getScore(true)).isEqualTo("30")
        Assertions.assertThat(classUnderTest.getScore(false)).isEqualTo("30")
    }

    @Test
    fun return40ForThreeNotTied() {
        val classUnderTest = App()
        classUnderTest.player1.score = 2
        classUnderTest.player2.score = 3

        Assertions.assertThat(classUnderTest.getScore(true)).isEqualTo("30")
        Assertions.assertThat(classUnderTest.getScore(false)).isEqualTo("40")
    }

    @Test
    fun returnGameForFourBeforeDeuce() {
        val classUnderTest = App()
        classUnderTest.player1.score = 2
        classUnderTest.player2.score = 4

        Assertions.assertThat(classUnderTest.getScore(true)).isEqualTo("30")
        Assertions.assertThat(classUnderTest.getScore(false)).isEqualTo("game")
    }

    @Test
    fun returnDeuceForBothThree() {
        val classUnderTest = App()
        classUnderTest.player1.score = 3
        classUnderTest.player2.score = 3

        Assertions.assertThat(classUnderTest.getScore(true)).isEqualTo("deuce")
        Assertions.assertThat(classUnderTest.getScore(false)).isEqualTo("deuce")
    }

    @Test
    fun returnAdvantageForPlayer1ScoreAfterDeuce() {
        val classUnderTest = App()
        classUnderTest.player1.score = 4
        classUnderTest.player2.score = 3

        Assertions.assertThat(classUnderTest.getScore(true)).isEqualTo("advantage")
        Assertions.assertThat(classUnderTest.getScore(false)).isEqualTo("40")
    }

    @Test
    fun returnPlayer1WinsIfScoreAfterAdvantage() {
        val classUnderTest = App()
        classUnderTest.player1.score = 5
        classUnderTest.player2.score = 3

        Assertions.assertThat(classUnderTest.getScore(true)).isEqualTo("game")
        Assertions.assertThat(classUnderTest.getScore(false)).isEqualTo("40")
    }

    @Test
    fun returnDeuceAfterAdvantageLost() {
        val classUnderTest = App()
        classUnderTest.player1.score = 4
        classUnderTest.player2.score = 4

        Assertions.assertThat(classUnderTest.getScore(true)).isEqualTo("deuce")
        Assertions.assertThat(classUnderTest.getScore(false)).isEqualTo("deuce")
    }

    @Test
    fun returnAdvantageForPlayer1ScoreAfterAnotherDeuce() {
        val classUnderTest = App()
        classUnderTest.player1.score = 5
        classUnderTest.player2.score = 4

        Assertions.assertThat(classUnderTest.getScore(true)).isEqualTo("advantage")
        Assertions.assertThat(classUnderTest.getScore(false)).isEqualTo("40")
    }

    @Test
    fun returnGameForPlayer1ScoreAfterAnotherAdvantage() {
        val classUnderTest = App()
        classUnderTest.player1.score = 6
        classUnderTest.player2.score = 4

        Assertions.assertThat(classUnderTest.getScore(true)).isEqualTo("game")
        Assertions.assertThat(classUnderTest.getScore(false)).isEqualTo("40")
    }
}