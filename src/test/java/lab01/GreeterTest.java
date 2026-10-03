package lab01;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class GreeterTest {
    @Test
    void greetIncludesName() {
        assertTrue(Greeter.greet("Ali").contains("Ali"));
    }
}
