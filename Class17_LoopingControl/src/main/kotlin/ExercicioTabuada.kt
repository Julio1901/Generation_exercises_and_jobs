/*Enunciado:
* Utilizando o laço for  Faça um programa que leia um valor e imprima sua tabuada
*  (aceite apenas números entre 1 e 10). Imprima, logo em seguida,
* a tabuada ao contrário
*
* */

fun main() {

    var numEscolhido : Int

    println("Por favor, entre com um número no intervalo entre 1 e 10 para que " +
            "seja exibido a sua tabuada: ")
    numEscolhido = readLine()!!.toInt()

    if(numEscolhido in 1..10){
        for (i in 0..10){
            println("$i X $numEscolhido = ${i * numEscolhido}")
        }

        println("============================================")

        for (i in 10 downTo 0){
            println("$i X $numEscolhido = ${i * numEscolhido}")
        }

    }else{
        println("Desculpe, número inválido. Tente novamente")
    }
}