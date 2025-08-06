package exercicio4

class Gerente(nome: String, salario: Float, val departamento: String) : Funcionario(nome, salario) {

    override fun exibirInformacoes() {
        println("nome: $nome, salário: $salario, departamento: $departamento")
    }
}
