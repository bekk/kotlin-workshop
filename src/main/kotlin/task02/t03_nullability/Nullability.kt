package task02.t03_nullability

class House(arg: String?) {
    var owner: Person? = Person(arg)
}

class Person(arg: String?) {
    var name: String? = arg

}
