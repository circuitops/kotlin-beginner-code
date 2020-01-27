package `19_InheritanceAbstractInterface`

fun main(){
    val dog = Dog("Black", 2)               //Created an instance of Dog class
    dog.woof()
    val cat = Cat("White", 3)               //Created an instance of Class class
    cat.meow()
}

open class Animal(colour: String, age: Int){                    //this class modifier is open which means the Animal class can now be access by the inheriting class
    init {
        println("$colour $age")
    }
}

class Dog(colour: String, age: Int) : Animal(colour, age){      //Animal Class was inherited by Dog Class, which means all open property and function of Animal class can now be used by Dog Class
    fun woof(){                                                 //member function of Dog class
        println("Arf!! Arf!!!")
    }
}

class Cat(colour: String, age: Int) : Animal(colour, age){      //Animal Class was inherited by Cat class, which means all open property and function of Animal class can now be used by Cat Class
    fun meow(){                                                 //member function of Cat class
        println("Meow!! Meow!!!")
    }
}