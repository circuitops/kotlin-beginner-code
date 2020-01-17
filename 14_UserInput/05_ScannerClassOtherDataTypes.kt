package `14_UserInput`

import java.util.*
fun main(){
    val read = Scanner(System.`in`)

    print("Enter Integer Number: ")
    val _integer = read.nextInt()

    print("Enter Float Number: ")
    val _float = read.nextFloat()

    print("Enter Double Number: ")
    val _double = read.nextDouble()

    print("Enter Long Number: ")
    val _long = read.nextLong()

    print("Enter Short Number: ")
    val _short = read.nextShort()

    print("Enter byte: ")
    val _byte = read.nextByte()

    print("Enter Boolean: ")
    val _bool = read.hasNextBoolean()
}