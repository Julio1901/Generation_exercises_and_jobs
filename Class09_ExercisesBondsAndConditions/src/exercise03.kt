/*Enunciado:
*  Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
* apresente no final o total do somatório, a média e o total de valores lidos. O programa
* deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
* positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
* */

fun main() {

    var someNumber  = 0
    var totalValue = 0
    var counter = 0
    var mediaTotal = 0

    val validate = ValidatesUserInteractions()

    while (someNumber >= 0) {

        someNumber = validate.requestNumber()

        if (someNumber < 0){
            break
        }
        totalValue += someNumber
        counter++
    }

    if(counter != 0){
        mediaTotal = totalValue / counter
    }

    println("O valor total da soma entre os números digitados é: " + totalValue)
    println("A media entre os valores é: " + mediaTotal)
}
