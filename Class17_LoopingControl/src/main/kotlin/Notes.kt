fun main(args: Array<String>) {


    /*Laços de repetição
    *
    *
    *
    *     //Lembre-se do % para verificar se um número é divisíveio por outro
    *
    *
    var num = 1
    var soma = 0
    var numerosDigitados = ""

    while(num != 0){
        println("Digite um número para ser somado diferente de 0: ")
        num = readLine()!!.toInt()
        soma+= num

        numerosDigitados = numerosDigitados + num

    }


    *     println(numerosDigitados)
    *
    *
    * */

    //Exemplo do..while prático
    /*
    var num = 0
    var count = 0
    var soma = 0

    println("Digite um número para soma de 1 até ele mesmo: ")
    soma = readLine()!!.toInt()

    do {
        count++
        soma += count

    }while (count <= num)

    */

    //Estrutura for:
    //Note que a variável i do for é local do looping, não influencia no resto do
    // código.
    //Lembre-se que ranges são include, eles não excluem os números iniciais e finais

    /* var i = "teste"

    for(i in 0..10){
        println(i)
    }

    println(i)

    //Podemos escrever o range de uma maneira decrescente também

    for (i in 10 dowTo 1){

    }


    //Podemos usar o step no for para pular com base em uma ocorrência:

    for (i in 1..10 step 2)  vai pular de 2 em 2







    var multiplicador = 2
    var multiplicando = 0
    var produto : Int


    for (i in 0..10){
        produto = multiplicador * multiplicando
        println("$multiplicador x $multiplicando = $produto")
        multiplicando++
    }



    //Exemplo do uso dos Arrays (vetores)

    var arrayNum = arrayOf("Henrique", "Rogerio", "Reginaldo", 1, 2)

    arrayNum[1] = "teste"


    for (i in arrayNum){
        println(i)
    }
    */


    //Tabuada

    var num = readLine()!!.toInt()

    for(i in 1..10){
        println("$num X $i = ${num * i}")
    }

}