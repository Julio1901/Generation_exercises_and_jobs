/*Enunciado:
* O App deve calcular a comissão dos representantes de vendas com base neste
* gráfico usado pela loja de varejo:

Faixa de Vendas        Comissão
acima de R$10000    30%
R$5001 - R$9999        20%
R$1001 - R$4999        10%
abaixo de R$1000     N / D

* */

fun main() {
    var totalVendasMensal : Double
    var comissaoVendedor : Double
    var percentualComissao = 0

    println("Por favor, entre com o valor total de vendas mensal realizado pelo vendedor:")
    totalVendasMensal = readLine()!!.toDouble()

    //PS: Considerei que o valor de 5000 não caracterizava 20 % de comissão
    if (totalVendasMensal  >= 1001.0 && totalVendasMensal < 5001.0){
        percentualComissao = 10
    }else if(totalVendasMensal >= 5001.0 && totalVendasMensal <= 10000){
        percentualComissao = 20
    }else if(totalVendasMensal > 10000){
        percentualComissao = 30
    }

    comissaoVendedor = (totalVendasMensal / 100) * percentualComissao

    println("O total de vendas no mês foi: $totalVendasMensal\nO percentual" +
            "de comissão do vendedor foi: $percentualComissao%" +
            "\nO valor total da comissão do vendedor foi R$: $comissaoVendedor")


}