package tennis.kata.accelerate

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MarsRoverTest {

    @Test
    fun createInstanceOfMarsRover() {
        assertThat(MarsRover()).isNotNull()
    }
}