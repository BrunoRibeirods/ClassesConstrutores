package br.com.digitalhouse.listaexc

class Numeros(var array: ArrayList<Int>) {
    fun produto() {
        var total = 1
        var i = 0
        while (i < array.size) {
            total *= array[i]
            i++
        }
        println(total)
    }
}