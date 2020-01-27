package `20_DataClass`

data class Student(var Id: Int,var LName: String, var FName: String)                    //We created a data class named Student with the following parameters: Id, LName, and FName.

fun main(){
    val studRecord1 = Student(10001,"Monrea","Jobert")                 //We created a three instance of Student data class with different data for each constructor.
    val studRecord2 = Student(10002,"Bales","Skip")
    val studRecord3 = Student(20001,"White","Shanon")

    println("ID: ${studRecord1.Id}\tName: ${studRecord1.FName} ${studRecord1.LName}")   //We display the values stored on each instance of Student data class by calling the variable object  and its associated property(example: studRecord1.Id)
    println("ID: ${studRecord2.Id}\tName: ${studRecord2.FName} ${studRecord2.LName}")
    println("ID: ${studRecord3.Id}\tName: ${studRecord3.FName} ${studRecord3.LName}")
}