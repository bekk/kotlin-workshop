package utils

import java.lang.reflect.Field
import java.lang.reflect.Method

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

fun classEqualFieldNames(o1: Any, o2: Any): Boolean {
    val fieldsO1: Map<String, Field> = o1.javaClass.declaredFields.associateBy { it.name }
    val fieldsO2: Map<String, Field> = o2.javaClass.declaredFields.associateBy { it.name }
    val o1HasAll = o1.javaClass.declaredFields.all { fieldsO2.containsKey(it.name) }
    val o2HasAll = o1.javaClass.declaredFields.all { fieldsO1.containsKey(it.name) }
    return o1HasAll && o2HasAll
}
