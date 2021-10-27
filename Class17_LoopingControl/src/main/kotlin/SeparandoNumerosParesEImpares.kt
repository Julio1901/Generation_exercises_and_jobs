/*Enunciado: Usando laço for ler 10 números e imprimir quantos são pares e quantos
são ímpares.
*
* */

fun main() {
    var totalNumPar = 0
    var totalNumImpar = 0
    var entradaUsuario : Int

    var exibindoNumsPar = ""
    var exibindoNumsImpar = ""

    /*Concatenei a string ao invés de jogar valores num array
    * afim de verificar o comportamento da concatenação dentro do looping
    * */
    for (i in 1..10){
        println("Por favor, entre com um número inteiro: ")
        entradaUsuario = readLine()!!.toInt()

        if (entradaUsuario % 2 == 0 ){
            totalNumPar++
            exibindoNumsPar = exibindoNumsPar + "\n$entradaUsuario"
        }else{
            totalNumImpar++
            exibindoNumsImpar = exibindoNumsImpar + "\n$entradaUsuario"
        }
    }

    println("Total de números pares digitados: $totalNumPar \n Lista números Pares:")
    println(exibindoNumsPar)

    println("Total de números impares digitados: $totalNumImpar" +
            "\nLista Números Impares")
    println(exibindoNumsImpar)

}

