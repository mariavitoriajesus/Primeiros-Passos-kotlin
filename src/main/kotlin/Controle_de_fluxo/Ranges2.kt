package Controle_de_fluxo

class Ranges2 {
    fun main(){
        for (c in 'a'..'d'){
            print(c)
        }
        print("  ")

        for (c in 'z' downTo 's' step 2){
            print(c)
        }
        print("  ")

        val x = 2
        if (x in 1..5){
            print("X is in range from 1 to 5")
        }
        println()

        if (x !in 6..10){
            print("x is not range from 6 to 10")
        }
    }
}