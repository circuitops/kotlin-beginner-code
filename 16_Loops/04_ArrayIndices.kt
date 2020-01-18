package `16_Loops`

fun main(){
    val nameList = arrayOf("Akira", "Homer", "Cactus")      //Array Declaration

    for(index in nameList.indices){
        println("At Index $index, The element is ${nameList[index]}")
    }
}

/*  index - is a variable that will contain the current index of the array
    in -    keyword used to iterate indexes of the array
    nameList.indices - array indexes where the loop will iterate.
 */