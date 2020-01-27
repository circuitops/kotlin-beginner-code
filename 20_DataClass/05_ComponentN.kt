package `20_DataClass`

fun main(){
    val studRecord1 = Student(10001,"Monrea","Jobert")

    println("ID: ${studRecord1.component1()}")
    println("Last Name: ${studRecord1.component2()}")
    println("First Name: ${studRecord1.component3()}")
}