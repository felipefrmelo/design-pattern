package mediator

class Intermediate : Mediator {
    override lateinit var accused: Person
    override lateinit var accuser: Person
    var state: String = "open"


    override fun openComplaint(accused: Person, accuser: Person) {
        accused.mediator = this
        accuser.mediator = this
        this.accused = accused
        this.accuser = accuser

    }

    override fun reply(r: Reply, person: Person) {
        if (state == "closed") println("This complaint is closed")
        if (r == Reply.DENY){
            winner = person
            when (person) {
                accused -> println("Acussed deny by reason: ${r.msg}")
                accuser -> println("Acusser deny by reason: ${r.msg}")
            }
        }
        else {
            println("$person  ${r.msg}")
            this.state = "closed"
        }
    }

    override fun stateComplaint(): String = this.state
    override var winner: Person? = null

    override fun toString(): String {
        return "Intermediate(accused=$accused, accuser=$accuser, state='$state', winner=$winner)"
    }

}