package abstract_factory

interface Celular {
    val tela: String
    val preco: Int
    fun carregar(carregador: Carregador)
}