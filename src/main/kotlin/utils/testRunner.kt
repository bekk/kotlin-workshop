package utils

import java.lang.reflect.Field


fun tests(description: String, vararg blocks: () -> Boolean) {

    val desc = if (description.isEmpty()) "" else "$description:"

    blocks.forEachIndexed { index, block ->
        val testId = index + 1

        try {
            val success = block()
            if (success) {
                println("$desc Test $testId - Success!")
            }
            if (!success) {
                println("$desc Test $testId - Failed!")
            }
        } catch (ex: NotImplementedError) {
            println("$desc Test $testId - Not implemented yet")
        } catch (ex: UninitializedPropertyAccessException) {
            println("$desc Test $testId - A property used has not been initialized - " +
                    "maybe an earlier test has to be fixed first?")
        } catch (ex: Exception) {
            println("$desc Test $testId - Error running test: $ex")
        }
    }
}

fun classEqualFieldNamesAndTypes(o1: Any, o2: Any): Boolean {
    val fieldsO1: Map<String, Field> = o1.javaClass.declaredFields.associateBy { it.name }
    val fieldsO2: Map<String, Field> = o2.javaClass.declaredFields.associateBy { it.name }
    val o1HasAll = o1.javaClass.declaredFields.all { fieldsO2.containsKey(it.name) && fieldsO2.getValue(it.name).type == it.type }
    val o2HasAll = o2.javaClass.declaredFields.all { fieldsO1.containsKey(it.name) && fieldsO1.getValue(it.name).type == it.type}
    return o1HasAll && o2HasAll
}
