package Controle_de_fluxo

class Loop2 {
    fun eatCake() = println("Eat a cake!")
    fun bakeCake()= println("bake a cake")

    fun main(){
        var cakesEaten = 0
        var cakesBaked = 0

        while (cakesEaten < 5){
            eatCake()
            cakesEaten ++
        }

        do {
            bakeCake()
            cakesBaked++
        } while (cakesBaked < cakesEaten)
    }
}