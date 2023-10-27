package Colecoes

import kotlin.collections.Map

class Map {
    constructor() val POINTS_X_PASS: Int = 15
    val EZPassAccount: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)
    val EZPassReport: Map<Int, Int> = EZPassAccount

    fun updatePiontsCredit(accountId: Int){
        if (EZPassAccount.containsKey(accountId)){
            println("Updating $accountId...")
            EZPassAccount[accountId] = EZPassAccount.getValue(accountId) + POINTS_X_PASS
        } else {
            println("Error: Trying to update a non-existing account (id: $accountId)")
        }
    }

    fun accountsReport(){
        println("EZ-Pass report:")
        EZPassReport.forEach{
            k, v -> println("ID $k: credit $v")
        }
    }

    fun main() {
        accountsReport()
        updatePiontsCredit(1)
        updatePiontsCredit(1)
        updatePiontsCredit(5)
        accountsReport()
    }
}