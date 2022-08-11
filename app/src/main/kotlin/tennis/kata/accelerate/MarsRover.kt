package tennis.kata.accelerate

class MarsRover(x: Int = 0, y: Int = 0, val direction: String = "N") {
    var position = Pair(x, y)

    fun moveBackwards(): Pair<Int, Int> {
        position = Pair(position.first - 1, position.second)
        return position
    }

    fun moveForward(): Pair<Int, Int> {
        if (direction == "N") position = Pair(position.first, position.second - 1)
        else position = Pair(position.first + 1, position.second)

        return position
    }
}