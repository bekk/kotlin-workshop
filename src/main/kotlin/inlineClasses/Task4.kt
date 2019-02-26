package inlineClasses

/**
 * Task 4 - The "real world" example
 *
 * In this task you're supposed to figure out a way to send an email to every new customer of a system, four days
 * after their registration. The interface for the mail scheduling system looks like this:
 */
/*class MailScheduler {
    fun sendEmail(message: String, delay: Int): Int {
        println(message)
        return delay
    }
}*/
//TODO: Denne er bare til demonstrasjon. Fjernes før faktisk workshop
class MailScheduler {
    fun sendEmail(message: String, delay: Minutes): Minutes {
        println(message)
        return delay
    }
}


/**
 * The MailScheduler takes a String message and an Int delay. But what does delay mean? What unit does it take?
 * After some research, you figure out that the delay is meant to be in minutes.
 * Write a wrapper as an inline class (Days), that takes an Int parameter, days. Give the Days class a toHours() function.
 * Rewrite the sendMessage function in the MailScheduler to use the Minutes class you created in Task 1.
 */

inline class Days(val value: Int) {
    fun toHours() = Hours(value * 24)
}


/**
 * Finnaly, complete the registration function underneath by
 * using the new wrapper classes.
 */

/*fun registration(newCustomer: String): Int {
    val message = "Welcome, $newCustomer!"
    return MailScheduler().sendEmail(message, 4 * 24 * 60)
}*/

fun registration(newCustomer: String): Minutes {
    val message = "Welcome, $newCustomer!"
    return MailScheduler().sendEmail(message, Days(4).toHours().toMinutes())
}