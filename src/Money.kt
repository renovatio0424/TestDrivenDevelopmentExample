open class Money(var amount: Int) {
    override fun equals(other: Any?): Boolean {
        return amount == (other as Money).amount && javaClass == other.javaClass
    }
}