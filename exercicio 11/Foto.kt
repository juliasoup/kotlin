package `exercicio 11`

class Foto (val arquivo : String) : Imprimivel {

    override fun imprimir() {
        println("imprimindo:  $arquivo")
    }
}