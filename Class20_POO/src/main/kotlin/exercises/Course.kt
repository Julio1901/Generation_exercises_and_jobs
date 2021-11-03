package exercises

class Course(val courseName : String, val year : Int) {

    //Default value
    var professorName = "The course does not have a teacher"
    //All courses last for one year
    val TOTAL_QUARTERS = 4




    constructor(courseName: String, year: Int, professorName : String) : this
        (courseName , year){
        this.professorName = professorName
    }

    private val listOfEnrolledStudents = mutableListOf<Student>()




    fun enroll(student: Student){
        listOfEnrolledStudents.add(student)
    }

    //Removed the possibility of receiving null parameters
    @Override
    fun enroll(students : Array<Student>){
        students.forEach {
            enroll(it)
        }
    }

    fun unEnroll (student: Student){

        println("Do you really want to remove the student: ")
        student.showAllStudentAttributes()
        print("Enter \"Yes\" to continue or \"No\" to abort operation: ")
        var confirmation = readLine()!!.uppercase()

        when(confirmation) {
            "YES" -> {var successfully = listOfEnrolledStudents.remove(student)
                        if (successfully){
                            println("Student successfully removed")
                        }else{
                            println("Student not found in course list")
                        }
                      }
            "NO" -> println("Operation aborted")
            else -> println("Sorry, invalid entry. Try again")
        }
    }

    fun countStudents() : Int = listOfEnrolledStudents.size

    fun bestGrade() : Double{
        var bestGrade = 0.0
        var bestStudents = mutableListOf<Student>()

        listOfEnrolledStudents.forEach {
            if (it.grade >= bestGrade){
                if (bestGrade != 0.0 || bestGrade == 0.0 && countStudents() == 1) {
                    bestStudents.add(it)
                }
                bestGrade =it.grade
            }
        }

        println("List of students with the best grade: ")
        bestStudents.forEach {
            it.showAllStudentAttributes()
            println("____________________________________")
        }

        return bestGrade
    }



    fun calculateAvaregeGrade() : Double{

        var  totalSumOfNotes = 0.0
        var avarageGrade : Double
        listOfEnrolledStudents.forEach {
            totalSumOfNotes += it.grade
        }

        avarageGrade = totalSumOfNotes / listOfEnrolledStudents.size

        println("The average grade for that course is:  $avarageGrade")

        return avarageGrade
    }

    fun showStudentRank(){
        listOfEnrolledStudents.sortBy { it.grade }
        var ordenedList = listOfEnrolledStudents.asReversed()

        println("Showing the rank of students: ")
        ordenedList.forEach {
            println("${it.firstName} ${it.lastName}  Grade: ${it.grade}")
        }

    }

    fun checkIfItIsAboveAverage(){
        val avarageGrade = calculateAvaregeGrade()

        listOfEnrolledStudents.forEach {
            if (it.grade > avarageGrade ){
                println("The student ${it.firstName} is above average")
            }else{
                println("Student ${it.firstName} is a regular student")
            }
            println(it.grade)
        }

    }



    //My personal functions

    fun showCourseInfo(){
        println("Course name: $courseName")
        println("Professor: $professorName")
        println("Yer: $year")
    }



    fun showAllEnrolledStudents(){
        println("Showing the list of students fot the course:")
        listOfEnrolledStudents.forEach {
            println("############################## STUDENT INFORMATION  ${it
                .firstName}")
            it.showAllStudentAttributes()

        }
    }

}