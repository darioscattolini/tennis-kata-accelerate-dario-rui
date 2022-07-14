/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package tennis.kata.accelerate

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class PlayerTest {

    @Test
    fun initialScoreForBothPlayersIs0() {
        val classUnderTest = Player()
        Assertions.assertThat(classUnderTest.score).isEqualTo(0)
    }

    @ParameterizedTest()
    @ValueSource(ints = [1, 2, 3, 4, 5])
    fun scoreIsIncreasedByOne(timesScored: Int) {
        val classUnderTest = Player()
        var previousScore = classUnderTest.score

        for (i in 1..timesScored) {
            previousScore = classUnderTest.score
            classUnderTest.increaseScore()
        }

        Assertions.assertThat(classUnderTest.score).isEqualTo(previousScore + 1)
    }
}
