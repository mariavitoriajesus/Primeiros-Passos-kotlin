package POO.Objects

class obj4 {
    class BigBen{
        companion object Bonger {
            fun getBonger(nTimes: Int){
                for (i in 1 .. nTimes){
                    print("BONG")
                }
            }
        }
    }

    fun main(){
        BigBen.getBonger(12)
    }
}