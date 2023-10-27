package Introducao

class NullSafely1 {
    fun main(){
        var neverNull: String = "This can't be null"

        var nullable: String? = "You can keep a null here"
        nullable = null

        var inferredNotNull = "The compiler assumes non-null"

        fun strLenght(str: String): Int{
            return str?.length ?: 0
        }

        println(strLenght(neverNull))
//        println(strLenght(nullable))
    }
}