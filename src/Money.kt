open class Money(
    var amount: Int,
    private val currency: String
) : Expression {

    fun times(multiplier: Int): Money {
        return Money(amount * multiplier, currency)
    }

    fun currency(): String = currency

    override fun equals(other: Any?): Boolean {
        return amount == (other as Money).amount && currency == other.currency()
    }

    override fun toString(): String {
        return "$amount $currency"
    }

    fun plus(addend: Money): Expression {
        return Money(amount + addend.amount, currency)
    }

    companion object {
        fun dollar(amount: Int): Money {
            return Money(amount, "USD")
        }

        fun franc(amount: Int): Money {
            return Money(amount, "CHF")
        }
    }
}