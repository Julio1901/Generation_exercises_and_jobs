/*Enunciado:

* Desenvolver um sistema que efetue a soma de todos os números ímpares que são
* múltiplos de três e que se encontram no conjunto dos números de 1 até 500.

* */

fun main() {
    var somaTotal = 0
    var x = 1
    /*
    * OUtro modo de fazer:
    *
    * (1..500).forEach{
    * }
* */
    for (x in x..500){
        if((x % 3).equals(0) and !(x % 2).equals(0)){
            somaTotal += x
        }
    }
    println(somaTotal)
}