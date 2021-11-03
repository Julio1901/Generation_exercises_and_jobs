package liveCodeClass
//var global = "test"

//global = "teste 2"

fun main() {

   // val maria = Pessoa()


    //val conta = liveCodeClass.ContaBanco("Henrique")


  // println( conta.proprietario)


}


//Declaranco um objeto anônimo
object  ListaContas {

    val listaContas = mutableListOf<ContaBanco>()

    fun addContas(contas: ContaBanco){
        listaContas.add(contas)

    }



}