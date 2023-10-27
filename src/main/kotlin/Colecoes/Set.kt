package Colecoes

class Set {
    val openIssues: MutableSet<String> = mutableSetOf("uniqueDesc", "Unique2", "unique3")

    fun addIssues(uniqueDesc: String): Boolean{
        return openIssues.add(uniqueDesc)
    }

    fun getStatusLog(isAdded: Boolean): String {
        return if (isAdded) "registered correctly." else "marked as duplicate and rejectd."
    }

    fun main(){
        val aNewIssue: String = "unique4"
        val asIssueAlreadyIn: String = "unique5"

        println("Issue $aNewIssue ${getStatusLog(addIssues(aNewIssue))}")
        println("Issue $asIssueAlreadyIn ${getStatusLog(addIssues(aNewIssue))}")
    }
}