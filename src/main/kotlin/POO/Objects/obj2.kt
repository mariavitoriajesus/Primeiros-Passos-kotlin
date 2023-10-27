package POO.Objects

class obj2 {
    fun rentPrince(standardDays: Int, festivityDays: Int, specialDays: Int) : Unit{
        val dayRates = object {
            var standard: Int = 30 *standardDays
            var festivity: Int = 50 * festivityDays
            var special: Int = 100 *specialDays
        }

        val total = dayRates.standard + dayRates.festivity + dayRates.special
        print("total prince: $total")
    }

    fun main(){
        rentPrince(10, 2, 1)
    }
}