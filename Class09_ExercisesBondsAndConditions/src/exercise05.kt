/*Enunciado:
* Faça um programa que mostre uma contagem na tela de 233 a 456, só que contando
* de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
* */

fun main() {
    var initialValue = 233

    val finalValue = 456
    val initialDelimitatorToAlterJump = 300
    val finalDelimitatorToAlterJump = 400
    var jumpControl = Numbers.FIVE.number

    do {
        println(initialValue)

        if(initialValue >= initialDelimitatorToAlterJump && initialValue <= finalDelimitatorToAlterJump){
            jumpControl = Numbers.THREE.number
        }else if (initialValue > finalDelimitatorToAlterJump){
            jumpControl = Numbers.FIVE.number
        }else if(initialValue > finalDelimitatorToAlterJump){
           //Aqui eu estabeleci que, o valor final tem que ser considerado como um valor que receberá um salto
            initialValue += jumpControl
            println(initialValue)
        }

        initialValue += jumpControl

    }while (initialValue <= (finalValue + Numbers.FIVE.number))
}