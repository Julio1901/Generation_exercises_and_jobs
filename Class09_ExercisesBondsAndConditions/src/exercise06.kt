/*Faça um programa que pegue um número do teclado e calcule a soma de todos os
*números  de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois
* 1+2+3+4+5+6+7=28.
* */

fun main() {

    var userInput: Int
    var i = Numbers.ONE.number
    var totalSum = Numbers.ZERO.number
    val validate = ValidatesUserInteractions()

    //Validation of user Input
    do {
        userInput = validate.requestNumber()
    }while (!validate.validatePositiveNumbers(userInput))

    do {
        totalSum += i
        i++
    }while(i <= userInput)

    println("The sum total is: $totalSum" )
}