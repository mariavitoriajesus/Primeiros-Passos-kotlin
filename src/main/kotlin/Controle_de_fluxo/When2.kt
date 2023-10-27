package Controle_de_fluxo

class When2 {
    fun whenAssign(obj: Any): Any{
        val result = when(obj){
            1 -> "one"
            "Hello" -> 1
            is Long -> false
            else -> 42
        }
        return result
    }
    class Myclass

    fun main() {
        println(whenAssign("hello"))
        println(whenAssign(3.4))
        println(whenAssign(4))
    }

}