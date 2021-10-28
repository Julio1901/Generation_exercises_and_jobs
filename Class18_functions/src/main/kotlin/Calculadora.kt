import kotlin.math.pow

/*Enunciado:

Exercício 1

1 - Criem um novo projeto que se chama Calculadora
2 - Implemente uma função para cada operação aritmética

- Adição
- Subtração
- Multiplicação
- Divisão

3 - Na função Main, chame todas as funções com valores diferentes (pelo menos uma vez)
4 - Se desafiem, adicionando, ainda, uma função para calcular a potência de um número, com qualquer expoente.
NOVO

*
* */


fun main() {

    /*Os prints poderiam ter sido feitos dentro das funções para o código ficar
     mais limpo, porém, a título de estudo, decidi fazer as funções recebendo
     parâmetros */

    var primeiroParametro : Double
    var segundoParametro : Double

    println("Por favor, entre com o primeiro parâmetro: ")
    primeiroParametro = solicitaNumeros()
    println("Por favor, entre com o segundo parâmetro: ")
    segundoParametro = solicitaNumeros()
    println(calculaPotencia(primeiroParametro, segundoParametro))
    //Ex função oneLine
    println(calculaPotenciaOneLine(primeiroParametro, segundoParametro))

    println("Por favor, entre com o primeiro parâmetro: ")
    primeiroParametro = solicitaNumeros()
    println("Por favor, entre com o segundo parâmetro: ")
    segundoParametro = solicitaNumeros()

    println(divide(primeiroParametro, segundoParametro))
    //Ex função oneLine
    println(divideOneLine(primeiroParametro, segundoParametro))

    println("Por favor, entre com o primeiro parâmetro: ")
    primeiroParametro = solicitaNumeros()
    println("Por favor, entre com o segundo parâmetro: ")
    segundoParametro = solicitaNumeros()
    println(multiplica(primeiroParametro, segundoParametro))
    //Ex função oneLine
    println(multiplicaOneLine(primeiroParametro, segundoParametro))

    println("Por favor, entre com o primeiro parâmetro: ")
    primeiroParametro = solicitaNumeros()
    println("Por favor, entre com o segundo parâmetro: ")
    segundoParametro = solicitaNumeros()
    println(soma(primeiroParametro, segundoParametro))
    //Ex função oneLine
    println(somaOneline(primeiroParametro, segundoParametro))

    println("Por favor, entre com o primeiro parâmetro: ")
    primeiroParametro = solicitaNumeros()
    println("Por favor, entre com o segundo parâmetro: ")
    segundoParametro = solicitaNumeros()
    println(subtrai(primeiroParametro, segundoParametro))
    //Ex função oneLine
    println(subtraiOneLine(primeiroParametro, segundoParametro))
}

//Valida entrada numérica usuário
fun solicitaNumeros() : Double{
    var controler = true
    var input = 0.0
    do {

        var inputNumero = readLine()!!
        try {
            input = inputNumero.toDouble()
            controler = false
        }catch (e : Exception){
            println("Desculpe, você não digitou um número válido. Tente " +
                    "novamente")
        }

    }while (controler)

    return input
}

//Funções com retorno recebendo parâmetros
fun soma(num1 : Double, num2 : Double) : Double{
    return num1 + num2
}

fun subtrai(num1 : Double, num2 : Double) : Double{
    return  num1 - num2
}

fun multiplica(num1 : Double, num2 : Double) : Double{
    return num1 * num2
}


fun divide(num1 : Double, num2 : Double) : Double{
    return num1 / num2
}


fun calculaPotencia(num1 : Double, expoente : Double) : Double{
    return num1.pow(expoente)
}

// Funções oneline
fun somaOneline(num1 : Double, num2 : Double) = num1 + num2

fun subtraiOneLine(num1 : Double, num2 : Double) = num1 - num2

fun multiplicaOneLine(num1 : Double, num2 : Double) = num1 * num2

fun divideOneLine(num1 : Double, num2 : Double) = num1 / num2

fun calculaPotenciaOneLine(num1 : Double, expoente : Double) = num1.pow(expoente)