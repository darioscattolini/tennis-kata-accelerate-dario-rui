package tennis.kata.accelerate

class MarsRover(x: Int = 0, y: Int = 0, var direction: Direction = Direction.NORTH) {
    var position = Pair(x, y)

    fun moveBackwards(): Pair<Int, Int> {
        position = when (direction) {
            Direction.EAST -> Pair(position.first - 1, position.second)
            Direction.WEST -> Pair(position.first + 1, position.second)
            Direction.SOUTH -> Pair(position.first, position.second - 1)
            else -> Pair(position.first, position.second + 1)
        }
        return position
    }

    fun moveForward(): Pair<Int, Int> {
        position = when (direction) {
            Direction.NORTH -> Pair(position.first, position.second - 1)
            Direction.SOUTH -> Pair(position.first, position.second + 1)
            Direction.WEST -> Pair (position.first - 1, position.second)
            else -> Pair(position.first + 1, position.second)
        }

        return position
    }

    fun turnLeft(): Direction {
        direction = when (direction) {
            Direction.NORTH -> Direction.WEST
            Direction.SOUTH -> Direction.EAST
            Direction.EAST -> Direction.NORTH
            else -> Direction.SOUTH
        }

        return direction
    }

    fun turnRight(): Direction {
        direction = when (direction) {
            Direction.EAST -> Direction.SOUTH
            else -> Direction.EAST
        }

        return direction
    }

    enum class Direction {
        NORTH, EAST, SOUTH, WEST
    }
}