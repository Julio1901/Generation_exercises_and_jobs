/**
 * Enunciado:
 *
 * Criarem uma estrutura de when em que consigamos passar um número
 * inteiro entre 1 e 12. O programa precisará, então, retornar o mês referente
 * ao número digitado
 */

fun main() {
    var numeroMes : Int

    println("Por favor, entre com um número de 1 a 12 correspondente ao " +
            "mês de referência do mesmo: ")

    numeroMes = readLine()!!.toInt()

    when(numeroMes){
        1 -> println("O mês escolhido foi Janeiro")
        2 -> println("O mês escolhido foi Fevereiro")
        3 -> println("O mês escolhido foi Março")
        4 -> println("O mês escolhido foi Abril")
        5 -> println("O mês escolhido foi Maio")
        6 -> println("O mês escolhido foi Junho")
        7 -> println("O mês escolhido foi Julho")
        8 -> println("O mês escolhido foi Agosto")
        9 -> println("O mês escolhido foi Setembro")
        10 -> println("O mês escolhido foi Outubro")
        11 -> println("O mês escolhido foi Novembro")
        12 -> println("O mês escolhido foi Dezembro")

        else -> println("Número inválido, por favor, tente novamente")
    }
}
