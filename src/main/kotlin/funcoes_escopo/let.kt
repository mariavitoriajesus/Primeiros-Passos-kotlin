package funcoes_escopo

class let {
    fun customPrint(s: String){
        print(s.uppercase())
    }

    fun main(){
        val empty = "teste".let {
            customPrint(it)
            it.isEmpty()
        }
        println("is empty: $empty")

        fun printNonNull(str: String){
            println("Printing \"$str\";")

            str.let {
                print("\t")
                customPrint(it)
                println()
            }
        }

        fun printBothNonNull(strOne: String?, strTwo: String?){
            strOne?.let { firstStrinf ->
                strTwo?.let { secundString ->
                    customPrint("$firstStrinf : $secundString")
                    println()
                }
            }
        }

        //printNonNull(null)
        printNonNull("my string")
        printBothNonNull("Fist", "Second")
    }
}