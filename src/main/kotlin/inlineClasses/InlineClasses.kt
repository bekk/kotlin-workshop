package inlineClasses

 /**
  * --------------------------------------
  * Example of inline class with function
  * --------------------------------------
  */
 inline class Balance(val money: Double) {
     val intValue: Int
         get() = money.toInt()

     fun prettyPrint() {
         println("Your accunt balance is $ $money ")
     }
 }

