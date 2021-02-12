package refactoring_guru.facade.design_pattern.facade

interface IWalletFacade {
    fun addMoneyToWallet(accountID: String, securityCode: Int, amount: Int)
    fun deductMoneyFromWallet(accountID: String, securityCode: Int, amount: Int)
}

class WalletFacade(accountID: String, securityCode: Int) : IWalletFacade {

    var account: Account
    var wallet: Wallet
    var securityCode: SecurityCode
    var notification: Notification
    var ledger: Ledger

    init {
        println("Starting create account")
        this.account = Account(accountID)
        this.securityCode = SecurityCode(securityCode)
        this.wallet = Wallet()
        this.notification = Notification()
        this.ledger = Ledger()
        println("Account created")
    }

    override fun addMoneyToWallet(accountID: String, securityCode: Int, amount: Int) {
        println("Starting add money to wallet")
        account.checkAccount(accountID)
        this.securityCode.checkCode(securityCode)
        wallet.creditBalance(amount)
        notification.sendWalletCreditNotification()
        ledger.makeEntry(accountID, "credit", amount)
    }

    override fun deductMoneyFromWallet(accountID: String, securityCode: Int, amount: Int) {
        println("Starting debit money to wallet")
        account.checkAccount(accountID)
        this.securityCode.checkCode(securityCode)
        wallet.debitBalance(amount)
        notification.sendWalletDebitNotification()
        ledger.makeEntry(accountID, "credit", amount)
    }
}

