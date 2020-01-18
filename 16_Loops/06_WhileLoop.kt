package `16_Loops`

fun main(){
    var num = 10                //Declared variable
    while(num >= 5){            //num >= 5 is our expression
        println("Loop: $num")   //print the current num
        num--                   //deduct one at num's current value
    }
}

/*  num(10) >= 5 is true - display "Loop 10", then deduct 1 to num's value
    num(9) >= 5 is true - display "Loop 9", then deduct 1 to num's value
    num(8) >= 5 is true - display "Loop 8", then deduct 1 to num's value
    num(7) >= 5 is true - display "Loop 7", then deduct 1 to num's value
    num(6) >= 5 is true - display "Loop 6", then deduct 1 to num's value
    num(5) >= 5 is true - display "Loop 5", then deduct 1 to num's value
    num(4) >= 5 is false - exit the block of the loop
 */