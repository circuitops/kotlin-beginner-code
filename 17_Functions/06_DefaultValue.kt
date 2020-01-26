package `17_Functions`

fun main(){
    defaultNumber(400)
    defaultNumber()                                 //if the parameter is empty. the default value of myNumber is displayed
}

fun defaultNumber(myNumber : Int = 1000) {          //myNumber argument has a default value 1000
    println("My Number is $myNumber")
}