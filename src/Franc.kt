class Franc(
    amount: Int,
    currency: String = "CHF"
) : Money(amount, currency) {
    override fun times(multiplier: Int): Money {
        return Franc(amount * multiplier)
    }
}