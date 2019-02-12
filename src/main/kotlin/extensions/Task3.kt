package extensions

/** Extension property
 * In addition to extending classes with functions, one can also extend classes with properties.
 * The syntax is just like a normal property with a custom getter, but it can not have a setter.
 *
 * Create an extension property called task03, which extends the String class. It should compute the squared length
 * of the String.
 */

//fun task03(): Nothing = TODO()
val String.task03: Int
    get() = this.length * this.length