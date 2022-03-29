import org.junit.jupiter.api.Test

import static org.junit.Assert.assertEquals

class DemoTest {
    def name = "John"
    def result = "Hello ${name}!"

    @Test
    public void mySimpleEqualsTest() {
        assertEquals("Hello John!", result.toString())
    }
}
