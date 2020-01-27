package `19_InheritanceAbstractInterface`

fun main(){
    val thePerson = Person2("Scarlet", "BlackBitch", 33)
    thePerson.money()
    thePerson.iEat()
}

open class TheP3rson(name: String, citizenship: String, age: Int){
    open var pocketMoney = 100
    init{
        println("Name: $name")
        println("Age: $age")
        println("Citizenship: $citizenship")
    }

    open fun iEat(){
        println("I Inherited Eating...")
    }
}

class Person2(name: String, citizenship: String, age: Int) : TheP3rson(name, citizenship, age){
    override fun iEat(){
        super.iEat()                                //We access iEat() function from TheP3rson Class (Base Class) using the super keyword. With this, it will execute the original block of iEat() function which is "I inherited Eating…"
        println("I like Water...")
    }
    fun money(){
        super.pocketMoney = 200                     //You can remove this Line
        println("Money: ${super.pocketMoney}")      //We access pocketMoney from TheP3rson Class (Base Class) using the super keyword. With this, we can get the original declare value which is 200 and display its value.
    }
}