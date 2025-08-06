package exercicio4

fun main(args: Array<String>) {
    val funcionario = Funcionario(nome = "thiago", salario = 10000f)
    val gerente = Gerente(nome = "julia", salario = 120000f, departamento = "tecnologia")

    funcionario.exibirInformacoes()
    gerente.exibirInformacoes()
}
