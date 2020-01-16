package `13_NullSafety`

fun main(){
    val myName : String? = null     //to declare a nullable, just put a '?' after the data type
    var myAge : Int? = 20           //nullable reference, at this point - the value of myAge variable is 20 and set as nullable (int?)
    myAge = null                    //once we change the value of MyAge variable to null, the kotlin compiler will handle this without error

    println("My Name: $myName")
    println("My Age: $myAge")
}