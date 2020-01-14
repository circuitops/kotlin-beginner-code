package `08_IncrementDecrementOperator`

fun main(){
    val a = true
    val b = false

    val aNew = a.not()  //Invert the value of a from true to false
    val bNew = b.not()  //Invert the value of a from false to true

    println("a: $aNew")
    println("b: $bNew")
}