package functional

data class Person(val name: String, val age: Int)

/**
 * The kotlin language implements a lot of functional functions which can
 * be used in classes which is extended by the class [Collection].
 * This is classes like [List], and [String].
 */
fun main(args: Array<String>) {

    val p1 = Person("Vetle", 24)
    val p2 = Person("Vegard", 50)
    val p3 = Person("Herman", 40)
    val p4 = Person("Thomas", 23)
    val p5 = Person("Yrjan", 27)
    val listOfPeople = listOf(p1, p2, p3, p4, p5)

    println(task01(listOfPeople))
    println(task02(listOfPeople))
    println(task03(listOfPeople))
}

// Use .map to make a list of all names and return this
fun task01(listOfPeople: List<Person>): List<String> {
    return listOfPeople.map { it.name }
}

// Use .filter to make a list of all names of people which are over the age of 24
fun task02(listOfPeople: List<Person>): List<String> {
    return listOfPeople
        .filter { it.age > 24 }
        .map { it.name }
}

// Use sumBy to easily get the sum age of all people
fun task03(listOfPeople: List<Person>): Int {
    return listOfPeople.sumBy { it.age }
}