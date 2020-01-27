package `19_InheritanceAbstractInterface`

fun main(){
    val test = myClass()        //We created an instance of myClass() and call the functions that was inherited such as func() function and overridden such as str property and demo() function
    test.demo()
    test.func()
    println(test.str)
}

interface  myInterface{         //The interface name is myInterface. Take note that an interface doesn't need a constructor
    var str : String            //A non-abstract property of myInterface interface. Take not that by default, this variable can be overridden in the class that implements it.
    fun demo()                  //A non-abstract function of myInterface interface. This function has the option to add block or body. Take note this function must be overridden in the class that implements it.
    fun func(){                 // non-abstract function of myInterface interface
        println("hello")        //This function has the option to add block or body.
    }                           //Take note this can be (optional) overridden in the class that implements it.
}

class myClass : myInterface{            //The class myClass inherited the myInterface Interface and need to override str(String) property and demo() function.
    override var str: String = "Over"
    override fun demo() {
        println("Test")
    }
}