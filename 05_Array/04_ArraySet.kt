package `05_Array`

fun main(){
    val studId = arrayOf(100001, 100002, 100003, 100004, 100005)
    val studLastName = arrayOf("Cocwood", "Gates", "Simpsons", "Musks", "Tan")

    studId.set(0, 111111)           //Change studId element value in index 0 from 100001 to 111111
    studLastName.set(0, "Woodcock") //Change studLastName element value in index 0 from Cocwood to Woodcock

    println("First Student Record")
    println("Student ID: ${studId.get(0)}")
    println("Last Name: ${studLastName.get(0)}")
}