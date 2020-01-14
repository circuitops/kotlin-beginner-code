package `11_LogicalOperators`

fun main(){
    val a = 20
    val b = 20
    val c = 100

    val result = (a >= b) or (a >= c)       //Result is True, 20(a) is greater than or equal to 20(b) is TRUE
                                            //OR 20(a) is greater than or equal to 100(c) which is FALSE
                                            // Or means either of the boolean expression is true
                                            // first expression is TRUE and the second is FALSE, the Result is true because 1 expression is True
    println(result)
}