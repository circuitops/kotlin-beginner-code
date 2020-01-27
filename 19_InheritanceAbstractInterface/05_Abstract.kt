package `19_InheritanceAbstractInterface`

fun main(){
    val test = College("Lucky", 90)                  //In the main function, we created an instance of College and include the parameters "Lucky" and 90 as required.
    test.demo()                                                //We access the functions of test which are demo() function which is an inherited function from the base class (College Class) and func() function which is also an override function from the base class.
    test.func("I'm an abstract")
}

abstract class Student(name: String, age: Int){                 //The class Student is an abstract class. Take note that an abstract class cannot be instance.
    init {
        println("$name $age")
    }
    fun demo(){                                                 //A non-abstract function that display "I'm a non-abstract"
        println("I'm a non-abstract")
    }
    abstract fun func(message: String)                          //An abstract function. All abstract function doesn't have a block or body and needs to be override on a child class (inheriting class)
}

class College(name: String, age: Int) : Student(name, age){     //Student class is inherited by College Class. Since student class is an abstract and has an abstract function, College class needs to override the abstract function of Student Class
    override fun func(message: String) {
        println(message)
    }
}