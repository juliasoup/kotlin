package `exercicio 9`

fun main() {
    val calc = Calculadora()

    val resultadoInt = calc.somar(10, 5)
    val resultadoDouble = calc.somar(4.5, 3.2)

    println("Soma de inteiros: $resultadoInt")
    println("Soma de doubles: $resultadoDouble")
}