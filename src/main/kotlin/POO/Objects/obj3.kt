package POO.Objects

class obj3 {
    object DoAuth {
        fun takeParams (username: String, passeword: String){
            println("input auth parameters = $username: $passeword")
        }
    }

    fun main(){
        DoAuth.takeParams("foo", "qwerty")
    }
}