package task02.t03_nullability

fun main() {
    val houseWithOwner = House("Ola")
    val houseWithoutOwner = House(null)
    utils.tests("",
        { Solution.checkIfOwnerIsNamed(houseWithOwner, "Ola") == checkIfOwnerIsNamed(houseWithOwner, "Ola") },
        { Solution.checkIfOwnerIsNamed(houseWithoutOwner, "Ola") == checkIfOwnerIsNamed(houseWithoutOwner, "Ola") },
        { Solution.checkIfOwnerIsNamed(houseWithOwner, null) == checkIfOwnerIsNamed(houseWithOwner, null) },
        { Solution.checkIfOwnerIsNamed(houseWithoutOwner, null) == checkIfOwnerIsNamed(houseWithoutOwner, null) }
    )
}

/** Safe access to nullable properties(safe call operator)
 *
 * In Kotlin, variables can only be null when the type is postfixed with a question mark, also known as
 * the safe call operator.
 * To access a nullable property of an object, one can use the safe call operator to access the property in a safe way.
 * If the property is not null, the safe call operator will return the property. If the property is null,
 * the it will short-circuit the expression and return null.
 *
 * Use the safe call operator to create the checkIfOwnerIsNamed function, which should check if the name of
 * the owner of the house argument is equal to the ownerName argument.
 *
 * The syntax is like this;
 * val x = arg?.prop
 *
 */

fun checkIfOwnerIsNamed(house: House, ownerName: String?): Boolean = TODO()