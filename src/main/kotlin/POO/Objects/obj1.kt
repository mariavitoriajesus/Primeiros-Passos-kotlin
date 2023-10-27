package POO.Objects

import java.util.Random


class obj1 {
    class LuckDispatcher {
        fun getNumber(){
            val objRandom = Random()
            println(objRandom.nextInt(99))
        }
    }
    fun main(){
        val d1 = LuckDispatcher()
        val d2 = LuckDispatcher()

        d1.getNumber()
        d2.getNumber()
    }
}