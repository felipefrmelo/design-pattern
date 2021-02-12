package refactoring_guru.facade.design_pattern.facade

class Wallet {
    private var _balance = 0
    var balance: Int = 0
        get() = this._balance


    fun creditBalance(amount: Int) {
        _balance += amount
        println("Wallet balance added successfully")
    }

    fun debitBalance(amount: Int) {
        if (_balance < amount) {
            return throw Exception("Balance is not sufficient")
        }
        println("Wallet balance is Sufficient")
        _balance -= amount
    }

}
