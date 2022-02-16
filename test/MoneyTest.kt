import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test

class MoneyTest {
    @Test
    fun testEquality() {
        assertEquals(Dollar(5), Dollar(5))
        assertNotEquals(Dollar(5), Dollar(6))

        assertEquals(Franc(5), Franc(5))
        assertNotEquals(Franc(5), Franc(6))

        assertNotEquals(Franc(5), Dollar(5))
    }
}