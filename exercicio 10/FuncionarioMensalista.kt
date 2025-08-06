class FuncionarioMensalista(nome: String, val salarioMensal: Float) : Funcionario(nome) {
    override fun calcularSalario(): Float {
        return salarioMensal
    }
}