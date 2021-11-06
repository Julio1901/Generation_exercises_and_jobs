package inheritanceExample

class HrMember (override var name: String , override var login: String,
                override
var password  :
String) : User{

   private val fakeDB = FakeDB()

   override fun singIn() : Boolean {
      return fakeDB.verifyUser(login, password)
   }

}