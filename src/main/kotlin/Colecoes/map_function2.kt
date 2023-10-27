package Colecoes

class map_function2 {
    fun main(){
        val fruitsBag = listOf("apple","orange","banana","grapes")
        val clothesBag = listOf("shirts","pants","jeans")
        val cart = listOf(fruitsBag, clothesBag)
        val mapBag = cart.map { it }
        val flatMapBag = cart.flatMap { it }

        println("Your bags are: $mapBag")
        println("The things you bought are: $flatMapBag")
    }
}