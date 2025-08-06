package `exercicio 10`

import FuncionarioHorista
import FuncionarioMensalista

fun main() {
    val horista = FuncionarioHorista("Nestor", 30, 3000f)
    val mensalista = FuncionarioMensalista("Julia", 30000f)

    horista.exibirInformacoes()
    mensalista.exibirInformacoes()
}
