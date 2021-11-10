package service

import model.Student
import java.util.HashMap
import model.Course

class StudentService {
    private val students: MutableMap<String?, Student> = HashMap()

    fun subscribeStudent(student: Student) {
        students[student.id] = student
    }

    fun findStudent(studentId: String?): Student? {
        return if (students.containsKey(studentId)) {
            students[studentId]
        } else null
    }

    fun isSubscribed(studentId: String?) = if(studentId!= null) students
        .containsKey(studentId) else false

    //TODO make a test
    fun showSummary() {
       students.forEach { println(it.value.toString())}
    }

    fun enrollToCourse(studentId: String?, course: Course?) {
        if (students.containsKey(studentId)) {
            students[studentId]!!.enrollToCourse(course)
        }
    }
}