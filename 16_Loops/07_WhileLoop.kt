package `16_Loops`

fun main(){
    var num = 1                 //Declared variable
    while(num <= 10){           //num <= 10 is our expression
        println("Loop: $num")   //print the current num
        num++                   //add one at num's current value
    }
}

/*  num(1) <= 10 is true - display "Loop 1", then add 1 to num's current value
    num(2) <= 10 is true - display "Loop 2", then add 1 to num's current value
    num(3) <= 10 is true - display "Loop 3", then add 1 to num's current value
    num(4) <= 10 is true - display "Loop 4", then add 1 to num's current value
    num(5) <= 10 is true - display "Loop 5", then add 1 to num's current value
    num(6) <= 10 is true - display "Loop 6", then add 1 to num's current value
    num(7) <= 10 is true - display "Loop 7", then add 1 to num's current value
    num(8) <= 10 is true - display "Loop 8", then add 1 to num's current value
    num(9) <= 10 is true - display "Loop 9", then add 1 to num's current value
    num(10) <= 10 is true - display "Loop 10", then add 1 to num's current value
    num(11) <= 10 is false - exit the block of the loop
 */