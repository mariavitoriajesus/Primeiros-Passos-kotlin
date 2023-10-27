package POO.enum_class

class enum1 {
    enum class State{
        IDLE, RUNNING, FINISHED
    }

    fun main(){
        val state = State.RUNNING
        val message = when (state){
            State.IDLE -> "it's idle"
            State.RUNNING -> "it's running"
            State.FINISHED -> "it's finished"
        }
        println(message)
    }
}