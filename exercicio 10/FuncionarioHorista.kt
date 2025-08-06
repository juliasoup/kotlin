class FuncionarioHorista(nome: String, val horasTrabalhadas: Int, val valorHora: Float) : Funcionario(nome) {
    override fun calcularSalario(): Float {
        return horasTrabalhadas * valorHora
    }
}