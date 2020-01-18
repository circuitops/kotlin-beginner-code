package `15_ConditionalStatement`

fun main(){
    val myNumber = 3

    when(myNumber){                 //Find the value of the variable myNumber (3)
        1 -> println("I")           //branch level, if myNumber is equal to 1, display "I"
        2 -> println("II")          //branch level, if myNumber is equal to 2, display "II"
        3 -> println("III")         //branch level, if myNumber is equal to 3, display "III"
        4 -> println("IV")          //branch level, if myNumber is equal to 4, display "VI"
        5 -> println("V")           //branch level, if myNumber is equal to 5, display "V"
        6 -> println("VI")          //branch level, if myNumber is equal to 6, display "VI"
        7 -> println("VII")         //branch level, if myNumber is equal to 7, display "VII"
        8 -> println("VIII")        //branch level, if myNumber is equal to 8, display "VIII"
        9 -> println("IX")          //branch level, if myNumber is equal to 9, display "IX"
        10 -> println("X")          //branch level, if myNumber is equal to 10, display "X"
        else -> println("Error")    //branch level, if there is no match, execute the else block and print "Error"
    }
}