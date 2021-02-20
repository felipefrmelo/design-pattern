package abstract_factory

interface Fabrica {
    fun fabricaCarregador(): Carregador
    fun fabricaCelular(): Celular
}