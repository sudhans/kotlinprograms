package coroutines

import kotlinx.coroutines.*

@OptIn(DelicateCoroutinesApi::class)
class LaunchJobExample01 {
    // launch builders return a Job object which can be used to cancel the coroutine or wait for its completion
    fun launchJob() = runBlocking { // runs on main thread
        println(" Start from ${Thread.currentThread().name}")

        val coroutineJob: Job = GlobalScope.launch { // Non-Blocking, runs on worker thread
            println("Coroutine Job - Start from ${Thread.currentThread().name}")

            delay(200)

            println("Coroutine Job End from ${Thread.currentThread().name}")
        }

        // instead of runblocking{}, use join

        coroutineJob.join() // Wait for the child coroutine running on worker thread to complete

        println(" End from ${Thread.currentThread().name}")

    }

}

fun main() {
    LaunchJobExample01().launchJob()
}