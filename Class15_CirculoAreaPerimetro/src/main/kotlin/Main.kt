/*Enunciado
*
1 - Crie um projeto no IntelliJ com o nome CirculoAreaPerimetro
2 - Crie um código que pede para o usuário digitar o diâmetro de um círculo (que será uma variável do tipo Int) e calcule a área e o perímetro (que serão Doubles).
4 - Faça uma conversão de tipos (de Int para Double) quando for calcular os resultados
*
* */


import java.util.*

fun main(args: Array<String>) {
    //dobro do raio
    var diametroDoCirculo : Int
    var raioCirculo : Double
    var areaCirculo : Double
    var perimetroCirculo : Double
    val PI = 3.14
    val scanerObj = Scanner(System.`in`)


    println("Por favor, entre com o diâmetro do círculo: ")
    diametroDoCirculo = scanerObj.nextInt()
    raioCirculo = (diametroDoCirculo / 2).toDouble()
    //O calculo do perímetro me parece redundante, irei pesquisar mais afundo se há diferença entre ele e o diâmetro
    perimetroCirculo = raioCirculo * 2
    areaCirculo = PI * (raioCirculo * raioCirculo)

    //Resultado exibido a título de verificação visual mesmo sem ter sido solicitado no enunciado:
    println("A área do círculo é $areaCirculo" +
            "\nO Raio do Circulo é $raioCirculo" +
            "\nO perímetro do Circulo é $perimetroCirculo")







}