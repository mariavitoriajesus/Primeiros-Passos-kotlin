package Controle_de_fluxo

import java.util.Objects

class When1 {
    fun cases(obj: Any){
        when(obj){
            1 -> println("one")
            "Hello" -> println("Greeting")
            is Long -> println(Long)
            !is String -> println("not a string")
            else -> println("Unknown")
        }
    }
    class MyClass()

    fun main(){
        cases("Hello")
        cases(1)
        cases(0L)
        cases(MyClass())
        cases("Hello")
    }
}