package refactoring_guru.facade.design_pattern.facade

class Ledger {

    fun makeEntry(accountID: String, txnType: String, amount: Int) {
        println("Make ledger entry for accountId ${accountID} with txnType ${txnType} for amount ${amount}\n")
    }
}
