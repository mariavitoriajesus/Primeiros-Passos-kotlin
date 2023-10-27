package Colecoes

class map_function1 {
    fun main(){
        val numbers = listOf(1, -2, 3, -4, 5, -6)
        val double = numbers.map { x -> x * 2 }
        val tripled = numbers.map { it * 3 }

        println("Numbers: $numbers")
        println("Double numbers: $double")
        println("Tripled numbers: $tripled")
    }
}