package `exercicio 3`

class Produto {

    var nome: String
    var preco: Double

    // Construtor primário (recebe nome e preco)
    constructor(nome: String, preco: Double) {
        this.nome = nome
        this.preco = preco
    }

    // Construtor secundário (recebe apenas nome)
    constructor(nome: String) {
        this.nome = nome
        this.preco = 0.0
    }

    fun mostrarInfo() {
        println("Produto: $nome | Preço: R$ $preco")
    }
}