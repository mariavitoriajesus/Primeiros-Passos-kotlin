package POO.sealed_class

class sealed {
    sealed class Mammal(val name:String)

    class cat(val catName: String) : Mammal(catName)
    class human(val humanName: String, val job: String) : Mammal(humanName)

    fun greetMammal(mammal: Mammal) : String {
        when (mammal) {
            is human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"
            is cat -> return "Hello ${mammal.name}"
        }
    }

    fun main(){
        println(greetMammal(cat("snowy")))
    }
}