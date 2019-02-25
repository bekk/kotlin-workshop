package inlineClasses

/**
 * Task 2 - Create an inline class, continued
 *
 * Now, let's make a tiny bit more complex inline class.
 * This inline class should be named Hours, and just like the Minutes class we made in the previous task, Hours should
 * take an Int parameter. The difference between Minutes and Hours is that the Hours class should have a function
 * called to minutes, which returns a Minutes instance set to the value passed to Hours multiplied by 60.
 */

inline class Hours(val value: Int) {
    fun toMinutes() = Minutes(value * 60)
}