package `07_AugmentedAssignment`

fun main(){
    var num1 = 100.00
    val num2 = 6

    num1 += num2            //num1 = 100.00 + 6
    println("Sum: $num1")

    num1 -= num2            //num1 = 106.00 - 6
    println("Difference: $num1")

    num1 *= num2            //num1 = 100.00 * 6
    println("Product: $num1")

    num1 /= num2            //num1 = 600.00 / 6
    println("Quotient: $num1")

    num1 %= num2            //num1 = 100.00 % 6
    println("Reminder: $num1")
}