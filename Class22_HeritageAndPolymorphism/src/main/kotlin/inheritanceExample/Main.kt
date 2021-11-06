import inheritanceExample.Employee
import inheritanceExample.HrMember
import inheritanceExample.SalesManager
import inheritanceExample.SalesRap


fun main() {

    val hrMemberTest = HrMember("Test", "admin",  "admin")




    //Scenery to test employed
    if (hrMemberTest.singIn()) {
        val employedTest = Employee("test", "test", 19)

        employedTest.setDaysWorked(100)
        employedTest.setYearsWorked(4)
        employedTest.setSalary(5000.0)
        employedTest.setVacationDaysTaken(10)
        employedTest.showAllInformations()
        println("__________________________")

        println(employedTest.calculateBonus())
        println(employedTest.timeToRetirement())
        println(employedTest.vacationTimeLeft())


        //Scenery to test Sales rap
        val salesRapTest = SalesRap("Sales Rap test", "Fake name", 22)

        println("__________________________")
        salesRapTest.setDaysWorked(100)
        salesRapTest.setYearsWorked(4)
        salesRapTest.setSalary(5000.0)
        salesRapTest.setVacationDaysTaken(10)
        salesRapTest.setSalesMade(1000.0)
        println(salesRapTest.calculateComission())
        salesRapTest.showAllInformations()

        //Scenery to test Sales Manager
        println("__________________________")
        println("________TEST MANAGER------")
        println("__________________________")


        val managerTest = SalesManager("Manager", "Fake name", 29)
        managerTest.setDaysWorked(100)
        managerTest.setYearsWorked(4)
        managerTest.setSalary(5000.0)
        managerTest.setVacationDaysTaken(10)
        managerTest.showAllInformations()

        val fakeSalesOne = SalesRap("Fake", "One", 20)
        val fakeSalesTwo = SalesRap("Fake", "Two", 20)
        val fakeSalesThree = SalesRap("Fake", "Three", 20)

        val fakeTeam = mutableListOf(fakeSalesOne, fakeSalesTwo, fakeSalesThree)

        managerTest.addMemberToTeam(fakeTeam)
        managerTest.showAllTeamMembers()

        fakeSalesOne.setSalesMade(1000.0)
        fakeSalesTwo.setSalesMade(2000.0)
        fakeSalesThree.setSalesMade(3000.0)

        managerTest.calculateCommission()
    } else {
        println("Program terminated due to login denied")
    }


}