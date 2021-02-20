package abstract_factory

class CarregadorSamsung(override var watts: Int, override var conector: String) : Carregador {
    override fun conectar() {
        println("conectado ao carregador Samsung: ${this}")
    }

    override fun toString(): String {
        return "CarregadorLg(watts=$watts, conector='$conector')"
    }
}