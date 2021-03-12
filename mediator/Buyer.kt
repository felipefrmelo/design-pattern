package mediator

class Buyer(override val name: String) : Person {
    override  var mediator: Mediator? = null
    override fun toString(): String {
        return "Buyer(name='$name')"
    }


}