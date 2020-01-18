package `15_ConditionalStatement`
import java.util.*
fun main(){
    val read = Scanner(System.`in`)                 //we declare a scanner class too enable input functionality
    print("Enter Number: ")
    val inputNumber = read.nextInt()                //Get user input as Integer and store it to inputNumber variable as its value
    val formula = inputNumber % 2                   //a basic formula to determine if a number is odd or even

    if(formula == 0){                               //if the value of formula is 0 (based from the computation above) and equal to 0 (formula == 0?) - the compiler will execute its block and display the "inputted Number is an even number"
        println("$inputNumber is an Even Number")
    }
    else{                                           //if false, execute the else block and display "inputted Number is an odd number"
        println("$inputNumber is an Odd Number")
    }
}