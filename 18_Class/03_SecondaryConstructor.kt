package `18_Class`

fun main(){
    val cpu1 = CPU("Ryzen 9 3950x")
    val cpu2 = CPU("Ryzen 9 3950x", "3.5Ghz")
    val cpu3 = CPU("Ryzen 9 3950x", "3.5Ghz", 16)

    cpu1.display()
    cpu2.display()
    cpu3.display()
}

class CPU{
    private var nameProcessor: String = ""
    private var frequency: String = ""
    private var physicalCores: Int = 1

    constructor(nameProcessor: String){
        this.nameProcessor = nameProcessor
    }
    constructor(nameProcessor: String, frequency: String)
            : this(nameProcessor) {
        this.nameProcessor = nameProcessor
        this.frequency = frequency
    }
    constructor(nameProcessor: String, frequency: String, physicalCores: Int)
            : this(nameProcessor, frequency) {
        this.nameProcessor = nameProcessor
        this.frequency = frequency
        this.physicalCores = physicalCores
    }
    fun display(){
        println("Processor: $nameProcessor")
        println("Frequency: $frequency")
        println("Physical Cores: $physicalCores \n")
    }
}