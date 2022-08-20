package coroutines

import kotlinx.coroutines.*

@OptIn(DelicateCoroutinesApi::class)
class RunBlocking01 {

    // runBlocking helps to wait for child coroutine to finish
    // runBlocking runs on Main thread when executed normally and on worker threads (Test Worker) if invoked from a unit test
    // The child coroutines also run on the same thread as the parent (main or worker threads)
    // GlobalScope.launch by default uses background threads
    fun runBlockingExample() {

        println(" Start from ${Thread.currentThread().name}")

        GlobalScope.launch { // Non-Blocking
            println("Coroutine Job - Start from ${Thread.currentThread().name}")

            delay(200)

            println("Coroutine Job End from ${Thread.currentThread().name}")
        }

        runBlocking { // Blocks Main Thread
            delay(1000)
        }

        println(" End from ${Thread.currentThread().name}")

    }


}

fun main() {
    RunBlocking01().runBlockingExample()
}