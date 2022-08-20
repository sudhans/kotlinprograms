package coroutines

import org.junit.jupiter.api.Test

internal class RunBlocking01Test {

    @Test
    fun runBlockingTest() {
        val runBlocking01 = RunBlocking01()
        runBlocking01.runBlockingExample()
    }
}