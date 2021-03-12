package mediator

class Seller(override val name: String) : Person {
    override  var mediator: Mediator? = null
    override fun toString(): String {
        return "Seller(name='$name')"
    }


}