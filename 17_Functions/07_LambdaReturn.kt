package `17_Functions`

fun main(){
    val lambda = {
        num1 : Double, num2 : Double -> num1 + num2         //in this part, we created a lambda that has two (2) parameter which are num1 (Double) and num2 (Double) then add the two variable. the result will automatically stored in the variable lambda
    }
    val result = lambda(20.00, 10.00)                       //as you notice, lambda can be called like a simple function
    println(result)
}