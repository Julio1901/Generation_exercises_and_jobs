package membersOfTheInstitution


import kotlin.random.Random

class Student (private var firstName : String?, private var lastName : String?) {
    //Automatically assigns a random registration
    private val registration = Random.nextInt(1000, 10000)
    private var grade = 0.0
    private  var year = 0
    private val isApproved: Boolean
        get() {
            if (grade >= 6.0) return true
            else return false
        }

    constructor(firstName: String?, lastName: String?, grade: Double) : this(
        firstName,
        lastName) {
        this.grade = grade
    }


    constructor(
        firstName: String?,
        lastName: String?,
        grade: Double,
        year: Int
    ) : this(firstName, lastName) {
        this.grade = grade
        this.year = year
    }

    fun getGrade() : Double{
        return this.grade
    }

    fun getFirstName (): String?{
        return this.firstName
    }

    fun getLastName (): String?{
        return this.lastName
    }

    fun getRegistration(): Int{
        return this.registration
    }

    fun getYear(): Int {
        return this.year
    }

    fun getIsApproved() : Boolean{
        return this.isApproved
    }


    fun showAllStudentAttributes() {
        println("Name: $firstName  $lastName")
        println("Registration: $registration")
        println("Grade: $grade")
        println("Year: $year")
        println("Is approved: $isApproved")
    }


    fun printFullName() {
        println("The student's full name is: $firstName $lastName")
    }


    fun changeYearIfApproved(): Int {
        if (this.isApproved) {
            year += 1
            println("Congratulations")
        } else {
            println("Sorry, the student has failed")
        }

        return 0
    }

}