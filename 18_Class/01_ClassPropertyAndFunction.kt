package `18_Class`

fun main(){
    val lamp = Lamp()           //we create a lamp object from Lamp class
    lamp.turnOn()               //we call turnOn() function from lamp object
    lamp.turnOff()              //we call turnOff() function from lamp object
    lamp.turnOff()              //we call turnOff() function from lamp object
}
//check comment below
class Lamp{
    private var isOn = false    //property
    fun turnOn(){               //member function
        isOn = true
        display()
    }
    fun turnOff(){              //member function
        isOn = false
        display()
    }
    private fun display(){      //member function
        if(isOn){
            println("Lamp is ON")
        }
        else{
            println("Lamp is OFF")
        }
    }
}
//to define a class, you need to indicate the keyword class then the class name
//in our example: class Lamp {...}. Lamp is our class name
//inside our block of a class, we define a property and a member function
//a property is a simple variable declaration. example var myName = "Jack"
//a member function is a simple function declaration. example fun callMe(){...}