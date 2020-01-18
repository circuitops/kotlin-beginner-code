package `16_Loops`

fun main(){
    var num = 10                //Declared variable
    do{                         //do - execute the code under it
        println("Loop $num")    //print current num value
        num++                   //increment num's value by 1
    }while (num <= 15)          //num <= 15 is our expression
}

/*      display "Loop 10", then the value of num will increment by 1, num(11) <= 15 is true
        display "Loop 11", then the value of num will increment by 1, num(12) <= 15 is true
        display "Loop 12", then the value of num will increment by 1, num(13) <= 15 is true
        display "Loop 13", then the value of num will increment by 1, num(14) <= 15 is true
        display "Loop 14", then the value of num will increment by 1, num(15) <= 15 is true
        display "Loop 15", then the value of num will increment by 1, num(16) <= 15 is false then exit the block
 */