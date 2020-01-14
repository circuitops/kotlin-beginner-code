package `11_LogicalOperators`

fun main(){
    val a = 20
    val b = 20
    val c = 100

    val result = (a >= b) && (a >= c)   //Result is True, 20(a) is greater than or equal to 20(b) is TRUE
                                        //AND 20(a) is greater than or equal to 100(c) which is FALSE
                                        // AND means both of the boolean expression is true
                                        // first expression is TRUE and the second is FALSE, the Result is false because both expression must be true
    println(result)
}