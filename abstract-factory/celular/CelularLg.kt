package abstract_factory

import abstract_factory.Carregador
import abstract_factory.Celular

class CelularLg(override val tela: String, override val preco: Int) : Celular {

    override fun carregar(carregador: Carregador) {
        println("CelularLg carregar")
        carregador.conectar()
    }
}