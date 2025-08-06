class Pessoa (val nome: String, val idade: Int){
    constructor(somenteNome: String) : this (somenteNome, 0)

    fun exibirInformacoes() {
        println("nome: $nome, idade: $idade")
    }
}
