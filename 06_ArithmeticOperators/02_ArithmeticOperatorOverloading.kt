package `06_ArithmeticOperators`

fun main(){
    val num1 = 100.00
    val num2 = 6

    val addition = num1.plus(num2)          //addition = 100.00 + 6
    val subtraction = num1.minus(num2)      //subtraction = 100.00 - 6
    val multiplication = num1.times(num2)   //multiplication = 100.00 * 6
    val division = num1.div(num2)           //division = 100.00 / 6
    val modulus = num1.rem(num2)            //modulus = 100.00 % 6

    println("Sum: $addition")
    println("Difference: $subtraction")
    println("Product: $multiplication")
    println("Quotient: $division")
    println("Reminder: $modulus")
}