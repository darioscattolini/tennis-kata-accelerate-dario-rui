package tennis.kata.accelerate

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AppTest {
    @Test
    fun marsRoverIsSteered() {
        val size = 5
        val position = "2 1 N"
        val instructions = "LFRB"
        val output = App().steerMarsRover(size, position, instructions)

        assertThat(output).isEqualTo("1 2 N")
    }
}