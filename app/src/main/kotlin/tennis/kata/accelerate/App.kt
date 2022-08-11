/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package tennis.kata.accelerate

class App {
    fun steerMarsRover(size: Int, position: String, instructions: String): String {
        val parameters = position.split(' ')
        val direction = when (parameters[2]) {
            "N" -> MarsRover.Direction.NORTH
            else -> MarsRover.Direction.EAST
        }
        var marsRover = MarsRover(parameters[0].toInt(), parameters[1].toInt(), direction)

        for (instruction in instructions) {
            when (instruction) {
                'L' -> marsRover.turnLeft()
                'R' -> marsRover.turnRight()
                'F' -> marsRover.moveForward()
                'B' -> marsRover.moveBackwards()
            }
        }

        return "${marsRover.position.first} ${marsRover.position.second} ${marsRover.direction.name[0]}"
    }
}