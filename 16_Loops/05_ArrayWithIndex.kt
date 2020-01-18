package `16_Loops`

fun main(){
    val nameList = arrayOf("Akira", "Homer", "Cactus")      //Array Declaration

    for((index, value) in nameList.withIndex()){
        println("At Index $index, The element is $value")
    }
}

/*  index - is a variable that will contain the current index of the array
    value - is a variable that will contain the current value (element) of the array
    in -    keyword used to iterate indexes of the array
    nameList.withIndex - array indexes and elements where the loop will iterate.
 */