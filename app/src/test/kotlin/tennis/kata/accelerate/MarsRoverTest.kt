package tennis.kata.accelerate

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MarsRoverTest {

    @Test
    fun createInstanceOfMarsRover() {
        assertThat(MarsRover()).isNotNull()
    }

    @Test
    fun createInstanceOfMarsRoverWithPosition() {
        val marsRover = MarsRover(3,1, "N")
        assertThat(marsRover.position).isEqualTo(Pair(3,1))
    }

    @Test
    fun createInstanceOfMarsRoverWithPositionAndDirection() {
        val marsRover = MarsRover(3,1, "N")
        assertThat(marsRover.direction).isEqualTo("N")
    }
}