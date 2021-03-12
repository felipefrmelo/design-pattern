package mediator

interface Person {
    var mediator: Mediator?
    fun reply(s: Reply) {
        mediator?.reply(s, this)
    }
    val name: String

}