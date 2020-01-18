package `15_ConditionalStatement`
import java.util.*
fun main(){
    val read = Scanner(System.`in`)                     //we declare a scanner class too enable input functionality

    print("Enter Number between -100 to 100: ")
    val inputNumber = read.nextInt()                    //Get user input as Integer and store it to inputNumber variable as its value
                                                        //Let's say we input 59. The value of the variable inputNumber is 59.
    if(inputNumber >= 0){                               //check the condition if inputNumber >= 0 (inputNumber(59) is greater than or equals to 0).
        println("Number is Positive")                   //If the condition is true, the compiler will display "Number is Positive"
    }
    else{                                               //if the condition is false, else block will be executed and the compiler will display "Number is Negative"
        println("Number is Negative")
    }
}