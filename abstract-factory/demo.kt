package abstract_factory

fun getFabrica(marca: String): Fabrica  = when (marca){
    "lg" -> FabricaLg()
    "samsung" -> FabricaSamsung()
    else -> throw Exception("Marca não encotrada")
}

fun main() {

    val fabricaSamsung = getFabrica("samsung")

    val celularSamsung = fabricaSamsung.fabricaCelular()
    val carregadorSamsung = fabricaSamsung.fabricaCarregador()
    celularSamsung.carregar(carregadorSamsung)

    println()

    val fabricaLg = getFabrica("lg")
    val celularLg = fabricaLg.fabricaCelular()
    val carregadorLg = fabricaLg.fabricaCarregador()
    celularLg.carregar(carregadorLg)

}