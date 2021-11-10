package model

import java.util.*
//TODO:Make attributes to private
class Student(id: String?, name: String?, email: String?, birthDate:
Date?) : Person(id, name, email, birthDate),
    Evaluation {
    private val average = 0.0

    private val courses: MutableList<Course> = ArrayList()
    private val approvedCourses: MutableMap<String, Course> = HashMap()

    override fun getAverage(): Double {
        return average;
    }

    fun enrollToCourse(course: Course?) {
        if(course != null){
            courses.add(course)
            println("Enrollment completed successfully")
        }else
            println("Invalid value passed. Course not registered please try again")
    }

    fun registerApprovedCourse(course: Course) {
        approvedCourses[course.code] = course
    }

    fun isCourseApproved(courseCode: String?) = if (courseCode != null)
        approvedCourses.contains(courseCode) else false


    fun isAttendingCourse(courseCode: String?): Boolean {
        var result = false

        if(courseCode != null){
            courses.forEach {
                if (it.code == courseCode)
                result = true
            }
        }
        return result
    }

    override fun getApprovedCourses(): List<Course>? {
        return approvedCourses.values.toList()
    }

    override fun toString(): String {
        return "Student {" + super.toString() + "}"
    }

    //Created for unit testing
    fun countCourses() = this.courses.count()
}
