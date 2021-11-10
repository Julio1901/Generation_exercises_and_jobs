package model


import java.util.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test


internal class StudentTest {
    //Test scenario

    //The Date Constructor is deprecated
    var fakeStudent = Student("a1b2", "Julio", "fakemail@gmail.com", Date(1997,1,19))
    var kotlinModule = Module("A1B2", "Kotlin", "Introduction and fundamentals of " +
            "language")
    var fakeCourse = Course ("T1B2", "Kotlin", 10, kotlinModule)

    @Test
    fun enrollToCourse(){
       fakeStudent.enrollToCourse(null)
        assertEquals(0, fakeStudent.countCourses())

        fakeStudent.enrollToCourse(fakeCourse)
        assertEquals(1, fakeStudent.countCourses() )
    }


    @Test
    fun isCourseApproved(){
        fakeStudent.registerApprovedCourse(fakeCourse)

        assertEquals(true, fakeStudent.isCourseApproved("T1B2"))
        assertFalse(fakeStudent.isCourseApproved("FAKECODE"))
        assertFalse(fakeStudent.isCourseApproved(null))
    }

    @Test
    fun isAttendingCourse(){
        fakeStudent.enrollToCourse(fakeCourse)
        assertTrue(fakeStudent.isAttendingCourse(fakeCourse.code))
        assertFalse(fakeStudent.isAttendingCourse("FAKECODE"))

    }

    @Test
    fun getApprovedCourses(){
        fakeStudent.registerApprovedCourse(fakeCourse)
        var fakeList = fakeStudent.getApprovedCourses()
        assertEquals(fakeCourse, fakeList!!.get(0))

    }


}