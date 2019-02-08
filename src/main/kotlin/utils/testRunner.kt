package utils

fun tests(vararg blocks: () -> (Boolean)) {

    blocks.forEachIndexed { index, block ->
        val testId = index + 1

        try {
            val success = block()
            if (success) {
                println("Test $testId - Success!")
            }
            if (!success) {
                println("Test $testId - Failed!")
            }
        } catch (ex: NotImplementedError) {
            println("Test $testId - Not implemented yet")
        } catch (ex: Exception) {
            println("Test $testId - Error running test: $ex")
        }
    }
}