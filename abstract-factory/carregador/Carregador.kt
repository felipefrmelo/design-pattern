package abstract_factory

interface Carregador {
    var watts: Int
    var conector: String
    fun carregar()
}