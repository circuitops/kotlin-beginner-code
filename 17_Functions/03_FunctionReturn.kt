package `17_Functions`

fun main(){
    val num1 = 90
    val num2 = 10

    val sum = addNumber(num1, num2)         //We call addNumber function and calculate the sum of num1 and num2. The return value will be store in the variable sum
    val diff = subNumber(num1, num2)        //We call addNumber function and calculate the difference of num1 and num2. The return value will be store in the variable diff

    println("SUM of $num1 and $num2 is $sum")
    println("DIFFERENCE between $num1 and $num2 is $diff")
}

fun addNumber(num1 : Int, num2 : Int): Int{     //Function name is addNumber with two (2) argument; num1 (Int) and Num2 (Int). Return type must be Int
    return num1 + num2                          //If a function has a declared return type, the return keyword must be put at the end of your function and return the required data.
}                                               //In this example, the requirement is Int and we return the sum of num1 and num2 which is an integer.

fun subNumber(num1 : Int, num2 : Int): Int{     //Function name is subNumber with two (2) argument; num1 (Int) and Num2 (Int). Return type must be Int
    return num1 - num2                          //If a function has a declared return type, the return keyword must be put at the end of your function and return the required data.
}                                               //In this example, the requirement is Int and we return the difference of num1 and num2 which is an integer.