package `06_ArithmeticOperators`

fun main(){
    val num1 = 100.00
    val num2 = 6

    val addition = num1 + num2          //addition = 100.00 + 6
    val subtraction = num1 - num2       //subtraction = 100.00 - 6
    val multiplication = num1 * num2    //multiplication = 100.00 * 6
    val division = num1 / num2          //division = 100.00 / 6
    val modulus = num1 % num2           //modulus = 100.00 % 6

    println("Sum: $addition")
    println("Difference: $subtraction")
    println("Product: $multiplication")
    println("Quotient: $division")
    println("Reminder: $modulus")
}