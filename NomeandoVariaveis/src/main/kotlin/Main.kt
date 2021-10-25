/*
* Enunciado:
*
* 1 - Crie um novo projeto chamado NomeandoVariaveis
2 - Crie variáveis que armazenem o nome do usuário, idade, preferência de emprego, nacionalidade e tipo sanguíneo
3 - Pense como você pode nomear essas variáveis para ficarem fáceis de serem identificadas
4 - Use a idade do usuário para calcular o ano de seu nascimento, usando o ano atual como base (2021)
5 - No fim, printe todos os valores no console, juntamente com o ano em que o usuário nasceu
*
* */


fun main(args: Array<String>) {
    var nomeUsuario = "Julio Cesar"
    var idadeUsuario = 24
    var preferenciaProfissaoUsuario = "Desenvolvedor Mobile"
    var nacionalidadeUsuario = "Brasileiro"
    var tipoSanguineoUsuario = "A+"
    val ANO_ATUAL = 2021
    var anoNascimentoUsuario : Int

    anoNascimentoUsuario = ANO_ATUAL - idadeUsuario

    println("Nome usuário: $nomeUsuario\nIdade usuário: $idadeUsuario\n" +
            "Preferência profissão: $preferenciaProfissaoUsuario\nNacionalidade: $nacionalidadeUsuario" +
            "\nTipo Sanguíneo: $tipoSanguineoUsuario" +
            "\nO usuário nasceu em: $anoNascimentoUsuario")

}