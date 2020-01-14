package `12_InOperator`

fun main(){
    val numbers = arrayOf(1, 2, 3, 4, 5, 6)

    val results = !numbers.contains(3)                  //Result is false, 3 exist in the array declared which is true but we invert the answer to false.
    println(results)
}