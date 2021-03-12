package mediator

interface Mediator {
    var accused: Person
    var accuser: Person
    fun openComplaint(accused: Person,accuser: Person)
    fun reply(r: Reply, person: Person)
    fun stateComplaint(): String
    var winner: Person?
}