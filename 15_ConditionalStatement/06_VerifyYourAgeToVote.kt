package `15_ConditionalStatement`

import java.util.*
fun main(){
    val read = Scanner(System.`in`)                             //we declare a scanner class too enable input functionality

    print("Enter Your Age: ")
    val userAge = read.nextInt()                                //Get user input as Integer and store it to userAge variable as its value

    if(userAge >= 18){                                          //Called Outer if, check if userAge is greater than or equal to 18, if the condition is true - execute the block and display "You can now VOTE!"
        println("You can now VOTE!")
    }
    else{                                                       //If false, execute the block
        val years = 18 - userAge                                //compute the difference between 18 and the inputted age. The result will be the value of the variable year
        if(years <= 5){                                         //Called Inner if, check if year is lesser than or equal to five (5), if true - execute the block and display "Your too young to Vote!"
            println("Your too young too Vote!")
        }
        else{                                                   //if false, execute the else block and display "Wait for $years years before you Vote!"
            println("Wait for $years year before you Vote!")
        }
    }
}