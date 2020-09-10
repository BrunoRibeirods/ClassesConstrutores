package br.com.digitalhouse.listaexc

class Fatorial(var num: Int) {
    fun fatorial(){
        if (num == 0) {
            1
        }
        var resultado = num
        while (num > 2) {
            resultado *= --num
        }
        println(resultado)
    }
}