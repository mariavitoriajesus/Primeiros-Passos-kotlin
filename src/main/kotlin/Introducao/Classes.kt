package Introducao

class Classes {
    class Customer

    class Contact(val id: Int, var email: String)

    fun main(){
        val customer = Customer()
        val contact = Contact(1, "email@teste.com")

        println(contact.id)
        println(contact.email)
        contact.email = "email@teste.com"
        println(contact.email)

    }
}