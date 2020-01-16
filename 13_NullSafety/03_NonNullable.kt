package `13_NullSafety`

fun main(){
    var myName: String = null       //NonNullable can't hold null values, if we run this program. kotlin compiler will show error

    var myAge: Int = 20             //NonNullable reference als can't hold null values
    myAge = null                    //if we recall myAge and change its value to null, kotlin compiler will show an error
}