package refactoring_guru.facade.design_pattern.facade

fun main() {
    var walletFacade = WalletFacade("abc", 123)
    walletFacade.addMoneyToWallet("abc", 123, 1000)
    walletFacade.deductMoneyFromWallet("abc", 123, 333)
}