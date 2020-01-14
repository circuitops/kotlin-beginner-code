package `05_Array`

fun main(){
    val studId = arrayOf(100001, 100002, 100003, 100004, 100005)
    val studLastName = arrayOf("Cocwood", "Gates", "Simpsons", "Musks", "Tan")

    println("Last ID: ${studId.get(studId.size-1)}")
    println("Last Name: ${studLastName.get(studLastName.size-1)}")
}