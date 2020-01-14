package `05_Array`

fun main(){
    val studId = arrayOf(100001, 100002, 100003, 100004, 100005)
    val studLastName = arrayOf("Cocwood", "Gates", "Simpsons", "Musks", "Tan")

    val firstStudId = studId[0]     //Get studId array element at index 0
    val thirdStudId = studId[3]      //Get studId array element at index 3

    val firstStudLastName = studLastName[0]     //Get studLastName array element at index 0
    val thirdStudLastName = studLastName[3]      //Get studLastName array element at index 3

    println("First Student Record")
    println("Student ID: $firstStudId")
    println("Last Name: $firstStudLastName")
    println()
    println("Third Student Record")
    println("Student ID: $thirdStudId")
    println("Last Name: $thirdStudLastName")
}