package `13_NullSafety`

fun main(){
    val homeAddress2: String? = "12314, Phenix, AZ"     // a simple declaration with safe call
    println(homeAddress2!!.length)                      //homeaddress2 has a not null assertion (!!), where kotlin compiler will check if the homeaddress2 value is null or not. if the value is null, it will return an exception.

    val homeAddress1: String? = null                    // a simple declaration with safe call
    println(homeAddress1!!.length)                      //since homeaddress1 value is null, kotlin compiler will show an exception error.
}