package Excecoes

class Excecoes2 {

    fun vote(name: String, age: Int){
        if (age < 16){
            throw IllegalArgumentException("$name não pode votar")
        }
        println("Voto realizado com sucesso!")
    }

    fun main(){
        vote("Maria", 33)
        vote("Maria", 10)
    }
}