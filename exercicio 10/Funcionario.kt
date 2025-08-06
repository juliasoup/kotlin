abstract class Funcionario(val nome: String) {
    abstract fun calcularSalario(): Float

    open fun exibirInformacoes() {
        println("Nome: $nome, Salário: ${calcularSalario()}")
    }
}