abstract class Money(
    var amount: Int,
    private val currency: String
) {

    abstract fun times(multiplier: Int): Money
    fun currency(): String = currency

    override fun equals(other: Any?): Boolean {
        return amount == (other as Money).amount && javaClass == other.javaClass
    }

    companion object {
        fun dollar(amount: Int): Dollar {
            return Dollar(amount)
        }

        fun franc(amount: Int): Franc {
            return Franc(amount)
        }
    }
}