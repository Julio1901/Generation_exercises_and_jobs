package liveCodeClass

class ContaBanco (val proprietario: String, val saldo : Double){

    var tipo = 0



    constructor(proprietario: String, saldo : Double, tipo : Int) : this
        (proprietario = "Foi criado com construtor secundário", saldo){
            //O this eu referencio uma variável global declarada na classe
            //E faço mensão a ela dentro do meu escopo de código
            this.tipo = tipo

        }


    fun teste (){
        this.tipo
    }


    /*
    *
    *
    *
    * */





  /*
    var proprietario = ""
        get() = field.uppercase()
        set(value) {
            field = value
        }
    var saldo = 0.0
    var tipo = 1
        set(value) = if (value <= 0 ){
            println("Tipo de conta inválida! Conta definida automaticamente para o" +
                    " tipo 1")
            field = 1
        }else{
            field = value
        }
    */





}