package Controle_de_fluxo

class Verificar_igualdade {
    fun main(){
        val authors = setOf("Shakespeare", "Hemingway", "Twain")
        val writrs = setOf("Twain", "Hemingway", "Shakespeare")

        println(authors == writrs)
        println(authors === writrs  )
    }
}