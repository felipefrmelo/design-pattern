package mediator

fun main() {
    var b = Buyer("Joao")
    var s = Seller("maria")
    var intermediate = Intermediate()
    intermediate.openComplaint(s, b)

    s.reply(Reply.DENY.reason("Não gostei"))
    s.reply(Reply.DENY.reason("Não goste2"))

    b.reply(Reply.OK)

    println(intermediate)
}