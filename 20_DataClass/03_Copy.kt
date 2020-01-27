package `20_DataClass`

fun main(){
    val studRecord1 = Student(10001,"Monrea","Jobert")                 //We created a three instance of Student data class with different data for each constructor.
    val studRecord2 = studRecord1.copy()                                                //The copy() function will duplicate the properties and values of the originating object. In this example, we declared an object studRecord2  and its value is the duplicate properties and values of studRecord1 object.
    val studRecord3 = studRecord1.copy(10321)                                        //The copy() function also has an option to change the property values. In this example, we change the value of property Id from 10001 to 10321.

    println("ID: ${studRecord1.Id}\tName: ${studRecord1.FName} ${studRecord1.LName}")   //We display the values stored on each instance of Student data class by calling the variable object  and its associated property(example: studRecord1.Id)
    println("ID: ${studRecord2.Id}\tName: ${studRecord2.FName} ${studRecord2.LName}")
    println("ID: ${studRecord3.Id}\tName: ${studRecord3.FName} ${studRecord3.LName}")
}