package Excecoes


class Excecoes1 {
    fun main(){
//        val a: Int? = try {
//            input.toInto()
//        } catch (e: NumberFormatException){
//            null
//        }

        val a = 10
        val b = 0

        try {
            val soma = a+b
        } catch (e: ArithmeticException){
            e.printStackTrace()
        } catch (e: Throwable){
            println(e.message)
        } finally {
            println("Finally executado!")
        }

        val divisao= try {
            println("Tentando fazer a divisão!")
            a/b
        } catch (e: ArithmeticException){
            println("Divisão com erro!")
            null
        }
        println(divisao)

    }
}