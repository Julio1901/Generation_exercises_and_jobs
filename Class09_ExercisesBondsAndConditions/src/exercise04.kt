/*Enunciado:
*  Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por
* três  (imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário digita
* 5,  deveremos observar na tela a seguinte sequência: 5 15 45 135.
* */
fun main() {

    val validate = ValidatesUserInteractions()
    val MAX_NUMBER_VALUE = 100
    val MULTIPLIER_VALUE = 3
    var userInput : Int

    do {
        userInput = validate.requestNumber()
    }while (!validate.validatePositiveNumbers(userInput))

    while (userInput < MAX_NUMBER_VALUE){
        println(userInput)
        userInput *= MULTIPLIER_VALUE
    }

    if(userInput >= MAX_NUMBER_VALUE){
        println(userInput)
    }
}


