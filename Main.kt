package br.com.digitalhouse.listaexc

fun main() {
    //Classe Fatorial ->
    val num = Fatorial(3)
    num.fatorial()

    //Classe Pessoa ->
    val pessoa = Pessoa(65, "M", 30)
    println(pessoa.aposentar())

    //Classe Numeros ->
    val arrayList = arrayListOf<Int>(1, 4, 7)
    val numeros = Numeros(arrayList)
    numeros.produto()
}


