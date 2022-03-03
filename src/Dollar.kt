class Dollar(
    amount: Int,
    currency: String = "USD"
) : Money(amount, currency) {
    override fun times(multiplier: Int): Money {
        return Dollar(amount * multiplier)
    }
}