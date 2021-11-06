package inheritanceExample

class SalesRap(firstName : String, lastName : String, age : Int) : Employee
    (firstName, lastName, age ){

    private var salesMade = 0.0

    fun calculateComission() = 0.1 * salesMade

    fun getSalesMade() = this.salesMade

    fun setSalesMade(salesMade : Double) {this.salesMade = salesMade}

}