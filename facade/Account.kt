package facade

class Account(val accountID: String) {
    fun checkAccount(accountID: String) {
        if (this.accountID != accountID)
            throw Exception("Account Name is incorrect")
        println("Account Verified")

    }
}
