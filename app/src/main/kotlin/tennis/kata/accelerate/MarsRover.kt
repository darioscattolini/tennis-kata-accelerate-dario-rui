package tennis.kata.accelerate

class MarsRover(x: Int = 0, y: Int = 0, val direction: Direction = Direction.NORTH) {
    var position = Pair(x, y)

    fun moveBackwards(): Pair<Int, Int> {
        position = Pair(position.first - 1, position.second)
        return position
    }

    fun moveForward(): Pair<Int, Int> {
        position = if (direction == Direction.NORTH) Pair(position.first, position.second - 1)
        else if (direction == Direction.SOUTH) Pair(position.first, position.second + 1)
        else Pair(position.first + 1, position.second)

        return position
    }

    enum class Direction {
        NORTH, EAST, SOUTH, WEST
    }
}