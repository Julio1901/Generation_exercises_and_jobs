package inheritanceExample

import java.util.*

open class Employee (private var firstName : String, private var lastName : String,
                private var age : Int){
    private var registration : Int = (1000..10000).random()
    private var daysWorked : Int = 0
    private var yearsWorked : Int = 0
    private var vacationDaysTaken : Int = 0
    private var salary : Double = 0.0
    private val MIN_CONTRIBUTION_TIME_TO_RETIREMENT = 60


    //"min" function disregarded. It makes no sense to use.
    fun timeToRetirement() = MIN_CONTRIBUTION_TIME_TO_RETIREMENT - yearsWorked

    fun vacationTimeLeft() = (daysWorked/360) *(30 - vacationDaysTaken)

    fun calculateBonus() = ((2.2) * salary).toInt()

    //Accessor methods
    fun getFirstName() = this.firstName

    fun setFirstName(firstName : String){ this.firstName = firstName}

    fun getLastName() = this.lastName

    fun setLastName(lastName : String) {this.lastName = lastName}

    fun getAge() = this.age

    fun setAge(age: Int){this.age = age}

    fun getRegistration() = this.registration

    fun getDaysWorked() = this.daysWorked

    fun setDaysWorked(daysWorked: Int){this.daysWorked = daysWorked}

    fun getYearsWorked () = this.yearsWorked

    fun setYearsWorked(yearsWorked : Int) {this.yearsWorked = yearsWorked}

    fun getVacationDaysTaken() = this.vacationDaysTaken

    fun setVacationDaysTaken(vacationDaysTaken : Int) {this.vacationDaysTaken = vacationDaysTaken}

    fun getSalary() = this.salary

    fun setSalary (salary : Double) {this.salary = salary}

    fun showAllInformations(){
        println("Name: ${this.firstName} ${this.lastName}")
        println("Age: ${this.age}")
        println("Days Worked: ${this.daysWorked}")
        println("Years Worked: ${this.yearsWorked}")
        println("Registration: ${this.registration}")
        println("Vacation days taken:  ${this.vacationDaysTaken}")
        println("Salary: ${this.salary}")
    }

}