package `17_Functions`

fun main(){
    displayETH()    //We call the function displayETH() to do a specific task
    displayBTC()    //We call the function displayBTC() to do a specific task
    displayBTC()    //We call the function displayBTC() to do a specific task
    displayBAT()    //We call the function displayBAT() to do a specific task
}

fun displayBAT(){   //this is a function, the function name is displayBAT and its function is to display "Basic Attention Token Function was Called"
    println("Basic Attention Token Function was Called")
}

fun displayBTC(){   //this is a function, the function name is displayBTC and its function is to display "Bitcoin Function was Called"
    println("Bitcoin Function was Called")
}

fun displayETH(){   //this is a function, the function name is displayETH and its function is to display "Ethereum Function was Called"
    println("Ethereum Function was Called")
}

//If your familiar with other OOP Languages, this function is
//the same as the void in other language where it doesn't return anything but it has a function to do