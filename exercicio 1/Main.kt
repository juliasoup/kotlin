import java.security.SecureRandom

fun main(args: Array<String>) {

    val pessoa1 = Pessoa(nome = "julia", idade = 20)
    val pessoa2 = Pessoa(nome = "thiago", idade = 21)
    val pessoa3 = Pessoa(nome = "luciano", idade = 19)

    pessoa1.exibirInformacoes()
    pessoa2.exibirInformacoes()
    pessoa3.exibirInformacoes()
}