package `19_InheritanceAbstractInterface`

fun main(){
    val animal1 = Animal1("Dog", "Pit Bull")
    animal1.animalSound("Aff")

    val animal2 = Animal1("Dog", "Chiwawa")
    animal2.animalSound("Pow")
}

open class TheAnimal(animal: String, breed: String){
    init {
        println("Animal: $animal  Breed: $breed")
    }
    open fun animalSound(sound: String){
        println("Let's mute you $sound sound")
    }
}

class Animal1(animal: String, breed: String) : TheAnimal(animal, breed){
    private var animal : String = ""
    init {
        this.animal = animal
    }
    override fun animalSound(sound: String) {
        println("What does the $animal say")
        for(i in 1..5){
            print("$sound...")
        }
    }
}