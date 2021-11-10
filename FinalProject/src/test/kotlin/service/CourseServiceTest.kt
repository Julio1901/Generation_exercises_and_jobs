package service

import model.Course
import model.Module
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class CourseServiceTest {

    //Test scenario
    val fakeModule = Module("1234", "Kotlin", "Introduction to language and " +
            "fundamentals")
    var fakeCourse = Course("abcd","Kotlin",20, fakeModule)
    var fakeCourseTwo = Course("efg","SLQ",20, fakeModule)
    var fakeCourseService = CourseService()

    @Test
    fun getCourse(){
        fakeCourseService.registerCourse(fakeCourse)
        assertEquals(fakeCourse, fakeCourseService.getCourse("abcd"))
    }

}