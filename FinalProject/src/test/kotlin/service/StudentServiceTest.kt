package service

import model.Student
import org.junit.jupiter.api.Test
import java.util.*
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class StudentServiceTest {

    //Test scenario

    //The Date Constructor is deprecated
    var fakeStudent = Student("a1b2", "Julio", "fakemail@gmail.com", Date(1997,1,19))


    @Test
    fun isSubscribed(){
        val studentServiceTest = StudentService()
        studentServiceTest.subscribeStudent(fakeStudent)

        assertTrue(studentServiceTest.isSubscribed(fakeStudent.id))
        assertFalse(studentServiceTest.isSubscribed("FAKEID"))
        assertFalse(studentServiceTest.isSubscribed(null))
    }


}