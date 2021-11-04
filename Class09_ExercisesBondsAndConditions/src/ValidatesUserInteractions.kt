class ValidatesUserInteractions {

    fun  requestNumber() : Int{
        var  x  = -1
        var stopControl = true
        var userImput : String

        while (stopControl) {

            print("Please, enter a positive number: ")
            userImput = readLine()!!

            try {
                x = userImput.toIntOrNull()!!
                stopControl = false
            } catch (e: Exception) {
                println("Sorry, you didn't enter a number. Try again")
            }
        }

    return x

    }


fun validatePositiveNumbers(number : Int) : Boolean{
    var positiveNumber : Boolean  = number >= 0

    if(!positiveNumber) {
        println("Sorry, it looks like you entered a negative number. Please try again")
    }
    return positiveNumber
}

    fun requestSalary () : Float{
        var  x  = 0.0f
        var stopControl = true
        var userImput : String

        while (stopControl) {

            print("Enter the amount of your salary. If you don't have it, enter the number 0:")
            userImput = readLine()!!

            try {
                x = userImput.toFloatOrNull()!!
                stopControl = false
            } catch (e: Exception) {
                println("Sorry, you didn't file a valid salary")
            }
        }

        return x

    }

}


