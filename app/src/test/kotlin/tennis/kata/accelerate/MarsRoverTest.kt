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

    @Test
    fun moveForward() {
        val marsRover = MarsRover(3,2, "N")
        assertThat(marsRover.moveForward()).isEqualTo(Pair(3,1))
        assertThat(marsRover.moveForward()).isEqualTo(Pair(3,0))
    }

    @Test
    fun moveBackwards() {
        val marsRover = MarsRover(2, 4, "E")
        assertThat(marsRover.moveBackwards()).isEqualTo(Pair(1, 4))
        assertThat(marsRover.moveBackwards()).isEqualTo(Pair(0, 4))
    }
}