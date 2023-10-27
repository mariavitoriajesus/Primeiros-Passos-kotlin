package funcoes_escopo

class run {
    fun main(){
        fun getNullableLenght(ns: String){
            println("for \"$ns\":")
            ns?.run {
                println("\tis empyt? " + isEmpty())
                println("\tlenght = $length")
                length
            }
        }
        //getNullableLenght(null)
        getNullableLenght("")
        getNullableLenght("some string with Kotlin")
    }
}