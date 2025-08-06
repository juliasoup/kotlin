package exercicio4

open class Funcionario(val nome: String, val salario: Float) {

    constructor(somenteNome: String) : this(somenteNome, 0f)

    open fun exibirInformacoes() {
        println("nome: $nome, salario: $salario")
    }
}