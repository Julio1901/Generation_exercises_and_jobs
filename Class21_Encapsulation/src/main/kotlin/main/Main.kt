package exercises

import membersOfTheInstitution.Student
import services.Course

fun main() {


    val studentTest = Student("Julio", "Cesar", 9.5, 7)
    val studentTestTwo = Student("Alex", "Test", 4.5, 9)
    val studentTestThree = Student("Edjane", "Test", 5.0, 10)
    val courseTest = Course("Philosophy", 9, "Julio Cesar")

    val studentArrayTest  = arrayOf(studentTest, studentTestTwo, studentTestThree)




//   studentTest.firstName = "Julio"
//    studentTest.lastName = "Cesar"
//
//    studentTest.printFullName()
//    println(studentTest.isApproved)
//
//    println(studentTest.registration)
//    studentTest.changeYearIfApproved()
//
//    studentTest.showAllStudentAttributes()
//    courseTest.showCourseInfo()
//
//    courseTest.enroll(studentTest)
//    courseTest.enroll(studentTestTwo)
//    courseTest.enroll(studentTestThree)
//
//    courseTest.unEnroll(studentTestThree)
//
//    courseTest.showAllEnrolledStudents()
//
    courseTest.enroll(studentArrayTest)
//
//    courseTest.calculateAvaregeGrade()
//    courseTest.checkIfItIsAboveAverage()


    courseTest.showAllEnrolledStudents()



    //It works
    val fakeStudent = Student("Test", "Not found", 8.0, 9)

    try {
        courseTest.checkIfTheStudentIsRegistered(studentTest)
    }catch (e: Exception){
       println(e)
    }
}