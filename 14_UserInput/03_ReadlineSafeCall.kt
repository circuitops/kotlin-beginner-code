package `14_UserInput`

fun main(){
    print("Enter Dividend: ")
    val dividend = readLine()?.toDouble()       //we included '?' or nullable/safe call after readLine() for the compiler to safely convert string(input) to double

    print("Enter Divisor: ")
    val divisor = readLine()?.toDouble()        //we included '?' or nullable/safe call after readLine() for the compiler to safely convert string(input) to double

    val quotient = dividend!! / divisor!!       //we included '!!' or not-null/notnull assertion operator to check whether the two variables has null values.
    val remainder = dividend % divisor          //we can include '!!' character to both variables but its redundant since we already did it before (line 10)

    println("Quotient = $quotient")
    println("Remainder = $remainder")
}

//Note: when we enter nothing (null) at the dividend and divisor input
//kotlin compiler will still return an exception. to fixed this error we need a condition to fix it (we'll discuss in the following chapter).