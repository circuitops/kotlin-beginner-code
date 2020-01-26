package `17_Functions`

fun main(){
    val _computedSalary = computeSalary(40, 500.00)
    val _computedDeduction = deductionSalary(_computedSalary)
    val _takeHomePay = takeHomePay(_computedSalary, _computedDeduction)
    println("------Payroll Report------")
    println("Computed Salary:\t\t$_computedSalary")
    println("Computed Deduction:\t\t$_computedDeduction")
    println("Take Home Pay:\t\t\t$_takeHomePay")
}

fun takeHomePay(computedSalary: Double, deductionSalary: Double) : Double{
    return computedSalary - deductionSalary
}

fun computeSalary(numberOfHours : Int, rate: Double) : Double{
    return numberOfHours * rate
}

fun deductionSalary(computedSalary: Double) : Double{
    val deduction : Double
    if(computedSalary >= 0 && computedSalary <= 999){
        deduction = 150.50
    }
    else if(computedSalary >= 1000 && computedSalary <= 9999){
        deduction = 500.00
    }
    else {
        deduction = 1059.00
    }
    return deduction
}