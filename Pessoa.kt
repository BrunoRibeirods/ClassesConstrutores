package br.com.digitalhouse.listaexc

class Pessoa(var idade: Int, var sexo: String, var anosCont: Int) {
    fun aposentar(): Boolean{
        return if(sexo == "F" && idade >= 60 && anosCont >= 30){
            true
        }else sexo == "M" && idade >= 65 && anosCont >= 30
    }
}