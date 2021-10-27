/*Enunciado: Usando laço While

*  Crie um programa que leia 10 valores e identifique a quantidade de números pares e
*  ímpares
* */


fun main() {
    var quantNumersPares = 0
    var quantNumersImpares = 0
    var entradaUsuario : Int

    var i = 0

    while (i < 10){
        i++
        println("Por favor, entre com um número: ")
        entradaUsuario = readLine()!!.toInt()
        if (entradaUsuario % 2 == 0){
            quantNumersPares++
        }else{
            quantNumersImpares++
        }
    }

    println("Quantidade números pares: $quantNumersPares \nQuantidade números " +
            "ímpares: $quantNumersImpares")

}