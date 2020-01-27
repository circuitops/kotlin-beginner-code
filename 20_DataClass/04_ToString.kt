package `20_DataClass`

fun main(){
    val studRecord1 = Student(10001,"Monrea","Jobert")
    val studRecord2 = Student(10002,"Bales","Skip")
    val studRecord3 = Student(20001,"White","Shanon")

    println("Student 1: ${studRecord1.toString()}")
    println("Student 2: ${studRecord2.toString()}")
    println("Student 3: ${studRecord3.toString()}")
}