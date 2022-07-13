package tennis.kata.accelerate

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class AppTest {

    @Test
    fun hasTwoPlayers() {
        val classUnderTest = App()
        Assertions.assertThat(classUnderTest.player1).isInstanceOf(Player::class.java)
        Assertions.assertThat(classUnderTest.player2).isInstanceOf(Player::class.java)
    }
}