package `15_ConditionalStatement`

fun main(){
    val myCharacter = 'D'

    when(myCharacter){
        'A', 'E', 'I', 'O', 'U' -> println("Character is a Vowel")      //This is an example of multiple branch in a single branch
        else -> println("Character is a Consonant")
    }
}