package `14_UserInput`

fun main(){
    print("Enter Num1: ")
    val num1 = Integer.valueOf(readLine())      //convert string (from user input) to integer
    print("Enter Num2: ")
    val num2 = Integer.valueOf(readLine())      //convert string (from user input) to integer

    val add = num1 + num2
    println("$num1 + $num2 = $add")
}

//Integer.valueOf("string value") is another way to convert string to integer data type