package `15_ConditionalStatement`

fun main(){
    val myMoney = 1000
    val toPay = 500
    val change = myMoney - toPay

    if(change > 0){                           //Check the Expression change > 0 (is change greater than 0?), if true - it will display the change
        println("your Change is: $change")
    }

    println("Thank you and Come again")
}