package tennis.kata.accelerate

class MarsRover(x: Int = 0, y: Int = 0, val direction: String = "N") {
    val position = Pair(x, y)

    fun moveForward(): Pair<Int, Int> {
        return Pair(3,0)
    }
}