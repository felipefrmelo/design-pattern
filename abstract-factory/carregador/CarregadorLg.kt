package abstract_factory

class CarregadorLg(override var watts: Int, override var conector: String) : Carregador {
    override fun carregar() {
        println("conectado ao carregador LG")
    }
}