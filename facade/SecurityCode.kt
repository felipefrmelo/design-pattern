package facade

class SecurityCode(val securityCode: Int) {
    fun checkCode(code: Int) {
        if (this.securityCode != code)
            throw Exception("Security Code is incorrect")
        println("Security Verified")
    }

}
