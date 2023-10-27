package Controle_de_fluxo

class Loop3 {
    class Animal(val nome: String)
    class Zoo(val animals: List<Animal>) {
        operator fun iterator(): Iterator<Animal>{
            return animals.iterator()
        }
    }

    fun main(){
        val animals = listOf(Animal("Zebra"), Animal("Lion"))
        val zoo = Zoo(animals)
        for (animal in zoo){
            println("Watch out, it1s a ${animal.nome}")
        }
    }
}