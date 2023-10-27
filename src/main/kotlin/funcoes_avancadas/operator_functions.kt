package funcoes_avancadas

class operator_functions {
    fun main(){
        operator fun Int.times(str: String) = str.repeat(this)
        println(2 * "Bye")

        operator fun String.get(range: IntRange) = substring(range)
        val str = "Always forgive your enemies; noting annoys them so much"
        println(str[0..14])
    }
}