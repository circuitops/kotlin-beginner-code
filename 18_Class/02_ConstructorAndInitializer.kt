package `18_Class`

fun main(){
    val myCar1 = Car("Mazda CX1")       //we created a myCar1 object from Car class with a "Mazda CX1" parameter for carBrand
    val myCar2 = Car("Honda Corolla")   //we created a myCar2 object from Car class with a "Honda Corolla" parameter for carBrand

    myCar1.display()                            //call member function
    myCar2.display()                            //call member function
}

class Car (carBrand : String){           //constructor with carBrand(String) parameter
    private var _carBrand: String = ""  //initialized a _carBrand(String) variable
    init {                              //instantiation block will execute first when the class Car is instance or create. under its block, it will set _carBrand value from the value of carBrand parameter
        _carBrand = carBrand
    }

    fun display(){                      //member function
        println("Your car brand is $_carBrand")
    }
}