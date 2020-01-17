package `14_UserInput`

import java.util.*
fun main(){
    val read = Scanner(System.`in`)

    print("Username: ")
    val userName = read.nextLine()

    print("Password: ")
    val passWord = read.nextLine()

    println("Username - $userName")
    println("Username - $passWord")
}