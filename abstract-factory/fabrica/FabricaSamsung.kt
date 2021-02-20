package abstract_factory

class FabricaSamsung :Fabrica {
    override fun fabricaCarregador(): Carregador  = CarregadorSamsung(15,"TIPO C")
    override fun fabricaCelular(): Celular = CelularSamsung("Tela 6 ", 999)
}