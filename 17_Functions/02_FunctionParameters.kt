package `17_Functions`

fun main(){
    birthdayMessage("Jonathan", 30)             //called birthdayMessage function with an argument Jonathan (name:String) and 30 (age:Int)
    birthdayMessage("Marie", 15)                //called birthdayMessage function with an argument Marie (name:String) and 15 (age:Int)
    birthdayMessage("Isaac", 18)                //called birthdayMessage function with an argument Isaac (name:String) and 18 (age:Int)
    birthdayMessage("Stan", 45)                 //called birthdayMessage function with an argument Stan (name:String) and 45 (age:Int)
}

fun birthdayMessage(name: String, age: Int){                //a function called birthdayMessage with two argument which is name (string) and age (int)
    if(age >= 18){                                          //a condition to determine if age is greater than or equal to 18, if true - the block will execute and display "Happy Birthday $name, you're now old enough to stand in your own."
        println("Happy Birthday $name, you're now old enough to stand in your own.")
    }
    else{                                                   //if false, the else block will execute and display "Happy Birthday $name, you're still young."
        println("Happy Birthday $name, you're still young.")
    }
}