package exercises

import kotlin.random.Random

class Student (var firstName : String?, var lastName : String?){
    //Automatically assigns a random registration
    val registration = Random.nextInt(1000, 10000)
    var grade = 0.0
    var year = 0
    val isApproved : Boolean
        get() {
            if (grade >= 6.0) return true
            else return false
        }

    constructor(firstName : String?, lastName: String?, grade: Double) : this
        (firstName, lastName){
            this.grade = grade
        }


    constructor(firstName: String?, lastName: String?, grade: Double ,year : Int) : this
        (firstName, lastName){
        this.grade = grade
        this.year = year
    }



    fun showAllStudentAttributes(){
        println("Name: $firstName  $lastName")
        println("Registration: $registration")
        println("Grade: $grade")
        println("Year: $year")
        println("Is approved: $isApproved")
    }


    fun printFullName(){
        println("The student's full name is: $firstName $lastName")
    }


    fun changeYearIfApproved() : Int{
        if(this.isApproved){
            year+= 1
            println("Congratulations")
        }else{
            println("Sorry, the student has failed")
        }

        return 0
    }







}