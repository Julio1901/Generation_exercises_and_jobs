/*Enunciado: Utilizando o laço While
* Crie um programa para ler 4 notas e mostrar a média delas.
* */

fun main() {
    var somaTotalNotas = 0.0
    var mediaNotas = 0.0

    var i = 1

    while (i <=4){
        println("Por favor, entre com a $i º nota: ")
        //Nota: Aqui não foi verificado se o número estava entre 0..10
        somaTotalNotas += readLine()!!.toDouble()
        i++
    }

    mediaNotas = somaTotalNotas / 4
    println("Sua média final foi: $mediaNotas")

}