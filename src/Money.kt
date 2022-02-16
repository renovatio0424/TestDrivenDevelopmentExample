abstract class Money(var amount: Int) {

    abstract fun times(multiplier: Int): Money

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