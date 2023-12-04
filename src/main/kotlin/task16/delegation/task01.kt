package task16.delegation

import kotlin.properties.Delegates

/**
 * A brief introduction to the delegation pattern
 *
 * The delegation pattern is a design principle in object-oriented programming where an object,
 * instead of performing one of its stated tasks, delegates that task to an associated helper object.
 * It's a method of composing objects to achieve new functionality, often used as a flexible alternative
 * to inheritance. In this pattern, an object (the delegator) holds a reference to another object
 * (the delegate) and relies on it to execute specific tasks. This approach allows for more dynamic and
 * reusable code, as the delegating object can easily replace the delegate with another,
 * modifying its behavior at runtime.
 *
 *In the example below, the class Window delegates the area() call to its internal Rectangle object (its delegate).
 *```
 * class Rectangle(val width: Int, val height: Int) {
 *     fun area() = width * height
 * }
 *
 * class Window(val bounds: Rectangle) {
 *     // Delegation
 *     fun area() = bounds.area()
 * }
 *```
 * Kotlin has special language-level support for delegation using the `by` keyword.
 *```
 * interface ClosedShape {
 *     fun area(): Int
 * }
 *
 * class Rectangle(val width: Int, val height: Int) : ClosedShape {
 *     override fun area() = width * height
 * }
 *
 * // The ClosedShape implementation of Window delegates to that of the Rectangle that is bounds
 * class Window(private val bounds: Rectangle) : ClosedShape by bounds
 * ```
 *
 * Task 1 - Interface delegation
 * In the code below is provided an interface Base and a class BaseImpl that implements the interface.
 * Create a class DelegatedBase that implements the Base interface by delegating to an instance of BaseImpl.
 * When done, remove the comments in main() and run.
 */

interface Base {
    fun print()
}

class BaseImpl : Base {
    override fun print() = println("BaseImpl print")
}

fun main() {
    val b = BaseImpl()
    // val delegatedBase = DelegatedBase(b)
    // delegatedBase.print() // Uses BaseImpl's print method
}
