package facade

import facade.WalletFacade

fun main() {
    var walletFacade = WalletFacade("abc", 123)
    walletFacade.addMoneyToWallet("abc", 123, 1000)
    walletFacade.deductMoneyFromWallet("abc", 123, 333)
}