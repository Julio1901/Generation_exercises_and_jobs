/*Enunciado
* Crie um programa onde o usuário digite as notas referente a 4 bimestres e
 calcule a média. No final, verifique a situação do aluno com base nesses dados:

- Reprovado se a média for 4 ou menos
- Regular se a média for maior que 4 e menor ou igual a 5
- Boa se a média for maior do que 5 e menor ou igual a 8
- Excelente se a média for maior do que 8 e menor ou igual a 10
- Se a média der um número negativo ou     uma nota fora da escala de 0 a 10, deverá
* ser printado média inválida
*
* */

fun main(args: Array<String>) {
    val reprovado = 4.0
    val regular = 5.0
    val boa = 8.0
    val excelente = 10.0

    var nota1 : Double
    var nota2 : Double
    var nota3 : Double
    var nota4 : Double
    var totalBimestres = 4


    val MEDIA_MINIMA = 0.0
    val MEDIA_MAXIMA = 10.0

    var mediaFinal = 0.0

    var invalidMensage = "Média inválida. Por favor verifique um ou mais valores " +
            "digitados e tente novamente"

    println("Digite a primeira nota: ")
    nota1 = readLine()!!.toDouble()
    println("Digite a segunda nota: ")
    nota2 = readLine()!!.toDouble()
    println("Digite a terceira nota: ")
    nota3 = readLine()!!.toDouble()
    println("Digite a quarta nota: ")
    nota4 = readLine()!!.toDouble()

    mediaFinal = (nota1 + nota2 + nota3 + nota4) / totalBimestres

    if(mediaFinal < MEDIA_MINIMA || mediaFinal > MEDIA_MAXIMA) {
        println(invalidMensage)
    }else if (mediaFinal <= reprovado){
        println("Desculpe, você foi reprovado.")
    }else if (mediaFinal > reprovado && mediaFinal <= regular){
        println("Sua média final foi regular!")
    }else if (mediaFinal > regular && mediaFinal <= boa){
        println("Sua média final foi boa")
    }else {
        println("Sua media final foi excelente!")
    }
    //Acrescentado para efeito de verificação mesmo sem o enunciado solicitar
    println("Sua média entre os 4 bimestres foi: $mediaFinal")

}