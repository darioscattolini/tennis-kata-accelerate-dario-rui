package tennis.kata.accelerate

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class BowlingTest {
    @Test
    fun allFailed() {
        assertThat(calculateScore("--|--|--|--|--|--|--|--|--|--||")).isEqualTo(0)
    }

    @Test
    fun oneHitAtFirstAttempt() {
        assertThat(calculateScore("1-|--|--|--|--|--|--|--|--|--||")).isEqualTo(1)
    }

    @Test
    fun threeHitsAtFirstAttempt() {
        assertThat(calculateScore("3-|--|--|--|--|--|--|--|--|--||")).isEqualTo(3)
    }

    @Test
    fun firstAttemptFailedSecondHit() {
        assertThat(calculateScore("-2|--|--|--|--|--|--|--|--|--||")).isEqualTo(2)
    }

    @Test
    fun twoHitsInFirstFrame(){
        assertThat(calculateScore("23|--|--|--|--|--|--|--|--|--||")).isEqualTo(5)
    }

    @Test
    fun fourthFrame4Points() {
        assertThat(calculateScore("--|--|--|4-|--|--|--|--|--|--||")).isEqualTo(4)
    }

    @Test
    fun threeScoringFrames() {
        assertThat(calculateScore("-5|23|--|4-|--|--|--|--|--|--||")).isEqualTo(14)
    }

    @Test
    fun strike() {
        assertThat(calculateScore("X|--|--|--|--|--|--|--|--|--||")).isEqualTo(10)
    }

    @Test
    fun nineAfterStrike() {
        assertThat(calculateScore("X|9-|--|--|--|--|--|--|--|--||")).isEqualTo(28)
    }
}