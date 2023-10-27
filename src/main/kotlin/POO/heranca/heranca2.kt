package POO.heranca

class heranca2 {
    open class Tiger(val origin: String){
        fun sayHello(){
            println("A tiger from $origin says: grrrhhh!")
        }
    }

    class SiberianTiger : Tiger("Siberian")

    fun main(){
        val tiger: Tiger = SiberianTiger()
        tiger.sayHello()
    }
}