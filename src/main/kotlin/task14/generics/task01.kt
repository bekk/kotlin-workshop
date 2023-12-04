package task14.generics

fun main() {
    /* utils.tests(
        "Generics",
        { StringReverser().transform("Kotlin") == "niltoK" },
    ) */
}

interface Transformable<T> {
    fun transform(input: T): T
}

/**
 * Task 1 - Generics
 * Generics are a way to make classes and functions more flexible in the types they can work with.
 * In this task, you will create a class that uses generics to transform an input of a specific type.
 * An interface that takes a generic type T is provided. Make your class implement this interface.
 * The interface has a method transform that takes an input of type T and returns an output of type T.
 * Create a class named StringReverser that implements the Transformable interface with String.
 * The transform method should reverse the input string and return it.
 *
 * When you are done, remove the block comment in main() and run the tests.
 *
 * TODO: Implement a class (StringReverser) that uses the Transformable interface with String as the generic type.
 */
