/*Enunciado: Utilizando o lado Do while:
*Crie um programa que leia um número do teclado até que encontre um número
igual a zero. No final, mostre:

- A soma dos números digitados.
- A média deles
- O menor número digitado
- O maior número digitado
*
* */

fun main() {
    var entradaUsuario : Int
    var somaTodosOsNumeros = 0
    var mediaEntreNumerosDigitados = 0.0
    var maiorNumeroDigitado = 0
    var menorNumeroDigitado = 0
    var i = 0

    do {
        println("Por favor, entre com um número inteiro.\n" +
                "Caso deseje encerrar o programa, entre com o número 0: ")
        entradaUsuario = readLine()!!.toInt()
        //Estabelece que a primeira entrada do usuário sempre será o menor número
        if (i == 0){
            menorNumeroDigitado = entradaUsuario
        }
        if (entradaUsuario != 0){
            i++
            somaTodosOsNumeros+= entradaUsuario
            if (entradaUsuario > maiorNumeroDigitado){
                maiorNumeroDigitado = entradaUsuario
            }else if (entradaUsuario < menorNumeroDigitado){
                menorNumeroDigitado = entradaUsuario
            }
        }
    }while (entradaUsuario != 0)

    if (somaTodosOsNumeros != 0) {
        mediaEntreNumerosDigitados = (somaTodosOsNumeros / i).toDouble()
        println(
            "Soma de todos os números digitados: $somaTodosOsNumeros" +
                    "\nMédia do valor total: $mediaEntreNumerosDigitados" +
                    "\nMaior número digitado: $maiorNumeroDigitado" +
                    "\nMenor número digitado: $menorNumeroDigitado"
        )
    } else{
        println("Programa encerrado sem entradas do usuário para serem somadas.")
    }
}
