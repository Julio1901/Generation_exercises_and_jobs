package inheritanceExample

class SalesManager(firstName : String, lastName : String, age : Int) : Employee
    (firstName, lastName, age) {

        private val teamMembers = mutableMapOf< Int ,SalesRap>()

        fun addMemberToTeam(newMember : SalesRap){
            teamMembers.put(newMember.getRegistration(), newMember)
        }

        fun addMemberToTeam(newMembers : List<SalesRap>){

            newMembers.forEach{
                teamMembers.put(it.getRegistration(), it)
            }
        }

        fun displayATeamMember(key : Int){
               teamMembers.get(key)!!.showAllInformations()
        }

        fun showAllTeamMembers(){
            println("####################################")
            println("Showing team members")
            teamMembers.forEach {
                println("_________________________")
                it.value.showAllInformations()
            }
        }
        fun calculateCommission(){
            var totalSoldByTheTeam = 0.0
            var totalCommission = 0.0
            teamMembers.forEach {
                totalSoldByTheTeam += it.value.getSalesMade()
            }

            totalCommission = 0.03 * totalSoldByTheTeam
            println("Total Commission: $totalCommission")

        }

}