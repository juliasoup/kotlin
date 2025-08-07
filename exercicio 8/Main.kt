package `exercicio 8`

Main:
fun main() {
    val formas: List<Forma> = listOf(
        Circulo(2.0),
        Quadrado(4.0),
        Circulo(3.5),
        Quadrado(1.5)
    )

    for (forma in formas) {
        println("Área: ${forma.calcularArea()}")
    }
}