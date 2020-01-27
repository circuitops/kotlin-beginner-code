package `20_DataClass`

//data class Student(var Id: Int,var LName: String, var FName: String)

fun main(){
    val studRecord1 = Student(10001,"Monrea","Jobert")                 //We created a three instance of Student data class with different data for each constructor.
    val studRecord2 = Student(10002,"Bales","Skip")

    if(studRecord1.equals(studRecord2)){                    //The equals() function compare the property values of studRecord1 and studRecord2 are equal.
        println("Both Student Records are Equal")
    }
    else{                                                   //In this example, the else block will execute and display "NOT Equal" sine the property values of studRecord1 and studRecord2 are different.
        println("NOT Equal")
    }
}