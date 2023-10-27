package Introducao


class Funcao1 {
    //1
    fun printMessage(message: String): Unit{
        println(message)
    }

    //2
    fun printMessageWithPrefix(message: String, prefix: String = "info"){
        println("[$prefix] $message")
    }

    //3
    fun sum(x:Int, y:Int): Int{
        return x + y
    }

    //4
    fun multiply(x: Int, y: Int) = x * y

    //5
    fun main(){
        printMessage("Hello")
        printMessageWithPrefix("Hello", "Log")
        printMessageWithPrefix("Hello")
        printMessageWithPrefix(prefix = "Log", message = "Hello")
        println(sum(1, 2))
        println(multiply(2, 4))
    }
}