/* Enunciado: Utilizando uma collection list
* 1. Crie um projeto chamado cadastroDeConvidados
2. Crie um loop (pode ser usado o while) e coloque um when dentro da estrutura,
* para simular um menu de escolhas:]
- O Loop precisa ficar ativo enquanto uma variável simNao
* estiver como "Sim", a partir do momento que o usuário digitar "Não" ou
* qualquer outra coisa, o programa precisa ser finalizado.
- Se o usuário escolher 1, abre as instruções para adicionar um novo convidado
- Se o usuário escolher 2, abre as instruções para remover um convidado
- Se o usuário escolher 3, lista os convidados
3. Use a List para cadastrar cada convidado
4. Teste para ver se tudo funciona
*
*
* */


fun main() {

    var continuePromgram = "SIM"
    var escolhaUsuario : Int
    var listaConvidados = mutableListOf<String>()

    while (continuePromgram == "SIM"){
        println("\nDeseja exibir o menu com opções do programa?" +
                "\nDigite 'Sim' para exibir" +
                "\nDigite 'Não' ou qualquer outra palavra para encerrar o " +
                "programa: ")

        continuePromgram = readLine()!!.uppercase()

        if(continuePromgram != "SIM"){
            break
        }else {
            println("Entre com a opção desejada: \n" +
                    "1-Adicionar um convidado\n" +
                    "2-Remover um convidado\n" +
                    "3-Listar todos os convidados\n" +
                    "Opção desejada: ")

            escolhaUsuario = readLine()!!.toInt()

            when(escolhaUsuario){
                1-> listaConvidados = adicionaConvidado(listaConvidados)
                2-> listaConvidados = removeConvidado(listaConvidados)
                3-> exibirConvidados(listaConvidados)
            }
        }
    }



}


fun adicionaConvidado(list : List<String>) : MutableList<String> {
    var novoConvidado : String
    var localList = list.toMutableList()

    println("Por favor, entre com o nome do convidado que deseja adicionar a " +
            "lista: ")
    novoConvidado = readLine()!!
    localList.add(novoConvidado)

    return localList
}

fun removeConvidado(list : List<String>) : MutableList<String>{
    val localList = list.toMutableList()
    var convidadoParaDeletar : String
    var mensagemFinal = "Convidado deletado com sucesso!"

    println("Os convidados que você pode deletar são: ")
    list.forEach{ println(it)}

    println("Por favor, digite o nome do convidado que deseja deletar: ")
    convidadoParaDeletar = readLine()!!

    if (!localList.remove(convidadoParaDeletar)){
        mensagemFinal = "Desculpe, o convidado com nome $convidadoParaDeletar não " +
                "foi encontrado na lista. Verifique o nome e tente novamente"

        println(mensagemFinal)
    }else{
        println(mensagemFinal)
    }

    return localList
}

fun exibirConvidados(list : List<String>){

    if(!list.isEmpty()){
        println("Verifique abaixo de maneira vertical todos os nomes contidos na lista" +
                " de convidados: ")

        list.forEach{
            println("$it")
        }
    }else{
        println("A lista está, até o momento, vazia.")
    }
}