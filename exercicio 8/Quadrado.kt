package `exercicio 8`

class Quadrado(val lado: Double) : Forma() {
    override fun calcularArea(): Double {
        return lado * lado
    }
}