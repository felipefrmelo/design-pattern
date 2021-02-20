package abstract_factory

class FabricaLg :Fabrica {
    override fun fabricaCarregador(): Carregador  = CarregadorLg(15,"TIPO C")
    override fun fabricaCelular(): Celular = CelularLg("Tela 6 ", 999)
}