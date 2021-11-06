package inheritanceExample

data class FakeDB( private var login: String = "admin", private var password :
String = "admin") {

    fun changeSystemPassword(newLogin: String, newPassword: String) {
        this.login = newLogin
        this.password = newPassword
    }


    fun getLogin() = this.login

    fun getPassword() = this.password


    fun verifyUser(userLogin : String , userPassword : String): Boolean {
        if (userLogin == login && userPassword == password) {
            println("Successful login")
            return true
        } else {
            println("If the user exists, the password is incorrect")
            return false
        }

    }

}








