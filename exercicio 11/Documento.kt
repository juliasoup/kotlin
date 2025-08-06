package `exercicio 11`

class Documento(val titulo: String) : Imprimivel {

    override fun imprimir() {
        println("imprimindo:  $titulo")
    }

}