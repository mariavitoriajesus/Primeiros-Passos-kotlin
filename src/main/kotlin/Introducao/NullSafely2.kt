package Introducao

class NullSafely2 {
    fun describeString(maybeString: String?): String{
        if (maybeString != null && maybeString.length > 0){
            return "String of lenght ${maybeString}"
        } else {
            return "Empty or null string"
        }
    }

    fun main(){
        println(describeString(null))
        println(describeString(""))
        println(describeString("dio.me"))
    }
}