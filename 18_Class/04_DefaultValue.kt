package `18_Class`

fun main(){
    val student1 = StudentInfo()
    println("ID: ${student1.id}")
    println("Last Name: ${student1.lName}")
    println("First Name: ${student1.fName} \n")

    val student2 = StudentInfo(2, "Finn", "Human")
    println("ID: ${student2.id}")
    println("Last Name: ${student2.lName}")
    println("First Name: ${student2.fName}")
}

class StudentInfo (id: Int = 1, fName: String = "John", lName: String = "Quinn"){
    var id: Int = 0
    var fName : String = ""
    var lName : String = ""

    init {
        this.id = id
        this.fName = fName
        this.lName = lName
    }
}