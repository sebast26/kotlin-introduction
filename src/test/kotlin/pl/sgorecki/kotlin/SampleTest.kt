package pl.sgorecki.kotlin;

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SampleTest {
    private val calculator = Calculator()

    @Test
    fun whenAdding1and3_thenAnswerIs4() {
        Assertions.assertEquals(4, calculator.add(1, 3))
    }
}
