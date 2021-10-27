/*Enunciado

Um cinema aplica descontos dependendo da idade do cliente.

O App pede para um usuário digitar a sua idade e checa se ele
está apto para o deconto do ingresso. A tabela de descontos é a seguinte

Idade                   Preço do Ingresso
Ingresso inteiro        18 Reais
Abaixo de 5 anos       60% de Desconto
Acima de 60 anos       55% Discount

3 - Codifique o app para calcular o preço correto do ingresso com base
na idade e mostre esse retorno para o usuário.

4 - Caso o usuário não tenha desconto, crie um sistema para a quantidade de
ingressos que ele quer e, se ele comprar dois ingressos
ou mais, terá um desconto de 30% em cada um.

*
* */


fun main() {
    val PRECO_INGRECO = 18.0
    //Aplicável para idades menores do que 5 anos
    val PORCENTAGE_DESCONTO_INFANTIL = 60
    //Aplicável para idades maiores do que 60 anos
    val PORCENTAGE_DESCONTO_IDOSOS = 55
    val PORCENTAGE_DESCONTO_QUANTIDADE = 30
    var totalDeIngressosComprados = 0
    var valorTotalCompra = 0.0

    var idadeUsuario: Int

    println("Por favor, entre com sua idade: ")
    idadeUsuario = readLine()!!.toInt()

    if (idadeUsuario < 5) {
        valorTotalCompra =
            PRECO_INGRECO - ((PRECO_INGRECO / 100) * PORCENTAGE_DESCONTO_INFANTIL)
    } else if (idadeUsuario > 60) {
        valorTotalCompra =
            PRECO_INGRECO - ((PRECO_INGRECO / 100) * PORCENTAGE_DESCONTO_IDOSOS)
    } else {
        valorTotalCompra = PRECO_INGRECO

        println("Por favor, entre com o número de ingressos que deseja comprar: ")
        totalDeIngressosComprados = readLine()!!.toInt()

        if (totalDeIngressosComprados > 1) {
            valorTotalCompra =
                (PRECO_INGRECO - ((PRECO_INGRECO / 100) * PORCENTAGE_DESCONTO_QUANTIDADE)) * totalDeIngressosComprados
        }
    }

    println(
        "Sua idade é $idadeUsuario" +
                "\nO valor total do ingresso será: R$$valorTotalCompra"
    )

}