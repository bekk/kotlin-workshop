package task02.t03_nullability

fun main() {
    val houseWithOwner = House("Ola")
    val houseWithoutOwner = House(null)
    utils.tests("",
        { Solution.checkIfOwnerIsNamed(houseWithOwner, "Ola") == checkIfOwnerIsNamed(houseWithOwner, "Ola") },
        { Solution.checkIfOwnerIsNamed(houseWithoutOwner, "Ola") == checkIfOwnerIsNamed(houseWithoutOwner, "Ola") }
    )
}

/** Safe access to nullable properties(safe call operator)
 *
 * In Java, it's implicit that every non-primitive type can be null. This has caused many null-pointer exceptions in
 * production code, as it is only human to err. Kotlin has null as well, but you have to be explicit about it by
 * typing a question mark at the end of the type, which also makes the compiler force you to handle the null-case.
 *
 * On way to access properties on a nullable variable is to use the safe call operator; ?.
 * If the variable is not null, the safe call operator will return the property.
 * If the variable is null, it will short-circuit the expression and return null.
 *
 * By chaining safe calls, one can then handle the case of nested nullable properties in a safe and concise manner.
 *
 * Use the safe call operator to create the checkIfOwnerIsNamed function, which should check if the name of
 * the owner of the house argument is equal to the ownerName argument.
 *
 * The syntax is like this;
 * val x = arg?.prop
 *
 * Note also that in the solution, we have to check if ownerName is null. You do not need to handle this case,
 * as ownerName is declared as a non-nullable argument.
 */

fun checkIfOwnerIsNamed(house: House, ownerName: String): Boolean = TODO()