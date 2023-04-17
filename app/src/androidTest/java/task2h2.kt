abstract class Animal(val name: String, val age: Int) {
    abstract fun sleep()
}

class Dog( val breed: String, val brak: String, name: String, age: Int): Animal(name, age) {
    override fun sleep() {
        println("$name the dog is sleeping")
    }
}

class Cat( val color: String, val scratch: Boolean, name: String, age: Int) : Animal(name, age) {
    override fun sleep() {
        println("$name the cat is sleeping")
    }
}

fun descibeAnimals(animals: List<Animal>){
    for (animal in animals) {
        when (animal) {
            is Dog -> println("Name: ${animal.name}, breed: ${animal.breed}")
            is Cat -> println("Name: ${animal.name}, color: ${animal.color}")

        }
        animal.sleep()
    }
}

fun isAnimalod(animal: Animal) = animal.age > 20

fun main() {
    val animals = listOf(
        Dog("labrador", "woof", "Alex", 13),
        Cat("brown", true, "Pinat",3),
        Dog("golden retriever", "bark", "Brandy", 21),
        Cat("white", false, "Buddy", 14)
    )

    descibeAnimals(animals)

    for (animal in animals) {
        val oldornot = if (isAnimalod(animal)) "old" else "notold"
        println("${animal.name}, is $oldornot")
    }
}

