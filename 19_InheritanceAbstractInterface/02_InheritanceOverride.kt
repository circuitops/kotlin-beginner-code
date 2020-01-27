package `19_InheritanceAbstractInterface`

fun main(){
    val person1 = Person1()
    person1.iEat()
}

open class ThePerson{               //this class has an open modifier, which means all open properties and function can be access by the inheriting class
    open fun iEat(){                //a member function with open modifier which means this function can be overridden
        println("Eating...")
    }
}

class Person1 : ThePerson(){        //ThePerson class is inherited by Person1Class
    override fun iEat(){            //iEat() function was override and change its block from displaying "Eating…" to "Water…"
        println("Water...")
    }
}