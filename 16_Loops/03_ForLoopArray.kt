package `16_Loops`

fun main(){
    val nameList = arrayOf("Akira", "Homer", "Cactus")      //Array Declaration

    for(name in nameList){
        println(name)
    }
}

/*      name - is a variable that will contain the current value (element) in the array (nameList)
        in   - keyword used to iterate over the array (nameList)
        nameList - array where the loop will iterate.
 */