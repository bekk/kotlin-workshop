package task02.t03_nullability

fun main() {
    val houseWithOwner = House("Ola")
    val houseWithoutOwner = House(null)
    utils.tests("",
        { Solution.getOwnerNameOrPlaceholder(houseWithOwner, "Kari") == getOwnerNameOrPlaceholder(houseWithOwner, "Kari")},
        { Solution.getOwnerNameOrPlaceholder(houseWithoutOwner, "Kari") == getOwnerNameOrPlaceholder(houseWithoutOwner, "Kari")}
    )
}

/** Elvis operator
 *
 * While the safe call operator in task 1 will stop unsafe calls and return any nulls, there are cases where one wants
 * a sane default value instead, or to throw an exception on null. This can be achieved by using the elvis operator - ?:
 * If the left hand of the elvis operator evaluates to null, the right hand side will be returned.
 *
 * Use a combination of the safe call operator and the elvis operator in getOwnerNameOrPlaceholder to return the name
 * of the owner of the house argument, or the placeholder argument if anything is null.
 *
 * Syntax is like this:
 * val x = prop?.value ?: defaultValue
 *
 */

fun getOwnerNameOrPlaceholder(house: House?, placeholder: String): String = TODO()