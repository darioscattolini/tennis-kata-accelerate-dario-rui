package tennis.kata.accelerate

class MarsRover(x: Int = 0, y: Int = 0, val direction: String = "N") {
    var position = Pair(x, y)

    fun moveForward(): Pair<Int, Int> {
        position = Pair(position.first, position.second - 1)
        return position
    }
}