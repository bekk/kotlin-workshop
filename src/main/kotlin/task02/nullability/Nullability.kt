package task02.nullability

class House(arg: String?) {
    var owner: Person? = Person(arg)
}

class Person(arg: String?) {
    var name: String? = arg

}
