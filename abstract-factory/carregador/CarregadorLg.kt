package abstract_factory

class CarregadorLg(override var watts: Int, override var conector: String) : Carregador {
    override fun conectar() {
        println("conectado ao carregador LG: ${this}")
    }

    override fun toString(): String {
        return "CarregadorLg(watts=$watts, conector='$conector')"
    }

}