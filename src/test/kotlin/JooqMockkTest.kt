import io.mockk.mockk
import org.jooq.impl.TableImpl
import org.junit.jupiter.api.Test

class JooqMockkTest {
    @Test
    fun `should mock jOOQ TableImpl class`() {
        // given
        val table = mockk<TableImpl<*>>()

        // when
        // then
    }
}
