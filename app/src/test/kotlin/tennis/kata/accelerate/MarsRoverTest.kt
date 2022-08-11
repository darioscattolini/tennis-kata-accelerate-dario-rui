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
        val marsRover = MarsRover(3,1)
        assertThat(marsRover.position).isEqualTo(Pair(3,1))
    }

    @Test
    fun createInstanceOfMarsRoverWithPositionAndDirection() {
        val marsRover = MarsRover(3,1, MarsRover.Direction.NORTH)
        assertThat(marsRover.direction).isEqualTo(MarsRover.Direction.NORTH)
    }

    @Test
    fun moveForwardNorth() {
        val marsRover = MarsRover(3,2, MarsRover.Direction.NORTH)
        assertThat(marsRover.moveForward()).isEqualTo(Pair(3,1))
        assertThat(marsRover.moveForward()).isEqualTo(Pair(3,0))
    }

    @Test
    fun moveForwardEast() {
        val marsRover = MarsRover(3, 5, MarsRover.Direction.EAST)
        assertThat(marsRover.moveForward()).isEqualTo(Pair(4, 5))
        assertThat(marsRover.moveForward()).isEqualTo(Pair(5, 5))
    }

    @Test
    fun moveForwardSouth() {
        val marsRover = MarsRover(1, 2, MarsRover.Direction.SOUTH)
        assertThat(marsRover.moveForward()).isEqualTo(Pair(1, 3))
        assertThat(marsRover.moveForward()).isEqualTo(Pair(1, 4))
    }

    @Test
    fun moveBackwards() {
        val marsRover = MarsRover(2, 4, MarsRover.Direction.EAST)
        assertThat(marsRover.moveBackwards()).isEqualTo(Pair(1, 4))
        assertThat(marsRover.moveBackwards()).isEqualTo(Pair(0, 4))
    }
}