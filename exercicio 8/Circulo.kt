package `exercicio 8`

class Circulo(val raio: Double) : Forma() {
    override fun calcularArea(): Double {
        return Math.PI * raio * raio //Fórmula de area do circulo: pi x raio ao quadrado
    }
}