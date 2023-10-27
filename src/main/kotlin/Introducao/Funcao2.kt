package Introducao

class Funcao2 {

    fun main(){
        fun printAll(vararg messages: String){
            for (m in messages) println(m)
        }
        printAll("Hello", "Olá", "Salut", "Hola", "你好")

        fun printAllWithPrefix(vararg messages: String, prefix: String){
            for (m in messages) println(prefix + m)
        }
        printAllWithPrefix(
            "Hello", "Olá", "Salut", "Hola", "你好",
            prefix = "Greeting: "
        )

        fun log(vararg entries: String){
            printAll(*entries)
        }
    }
}