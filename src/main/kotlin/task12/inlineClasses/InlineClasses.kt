package task12.inlineClasses

 /**
  * -----------------------------------------------
  * Example of inline class with value and function
  * -----------------------------------------------
  */
 inline class Balance(val money: Double) {
     val intValue: Int
         get() = money.toInt()

     fun prettyPrint() {
         println("Your accunt balance is $ $money ")
     }
 }

