package `17_Functions`

fun main(){
    println("12.3 Foot is equivalent to ${feetToInches(12.3)} Inches")
    println("5 Foot is equivalent to ${feetToInches(5)} Inches")
    println("1 Feet is equivalent to ${feetToInches()} Inches")
}

fun feetToInches() : Int {
    return 1 * 12
}

fun feetToInches(feet: Double) : Double{
    return feet * 12
}

fun feetToInches(feet: Int) : Int{
    return feet * 12
}

// As you can see in our example, we have declared three functions. these is an example of overloading function