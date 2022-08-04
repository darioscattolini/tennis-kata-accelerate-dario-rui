package tennis.kata.accelerate

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class BowlingTest {
    @Test
    fun allFailed() {
        assertThat(calculateScore("--|--|--|--|--|--|--|--|--|--||")).isEqualTo(0)
    }

}