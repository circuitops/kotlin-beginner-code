package `15_ConditionalStatement`

import java.util.*
fun main(){
    val read = Scanner(System.`in`)                         //we declare a scanner class too enable input functionality
    print("Enter Number: ")
    val inputNumber = read.nextInt()                        //Get user input as Integer and store it to inputNumber variable as its value
    val getLength = inputNumber.toString().length           //Get string length based from the user input and store it to getLength variable as its value.

    if(getLength == 0){                                     //if condition, check if getLength == 0 (getLength(character length) is equal to 0?), if the condition is true - execute the block and display "Error"
        println("Error")
    }
    else if(getLength == 1){                                //else if condition, check if getLength == 1 (getLength(character length) is equal to 1?), if the condition is true - execute the block and display "Single Digit Number"
        println("$inputNumber is a Single Digit Number")
    }
    else if(getLength == 2){                                //else if condition, check if getLength == 2 (getLength(character length) is equal to 2?), if the condition is true - execute the block and display "Double Digit Number"
        println("$inputNumber is a Double Digit Number")
    }
    else if(getLength == 3){                                //else if condition, check if getLength == 3 (getLength(character length) is equal to 3?), if the condition is true - execute the block and display "Triple Digit Number"
        println("$inputNumber is an Triple Digit Number")
    }
    else{                                                   //if false, execute the else block and display "Error"
        println("Error")
    }
}