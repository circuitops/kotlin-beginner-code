package `17_Functions`

fun main(){
    function.callMe(2) {
        print("$it")
    }
}

fun callMe(num:Int, greeting : (Int) -> Unit){
    greeting(num)
}