package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class firstTest {
    @Test
    void firsttest() {
        Assertions.assertTrue(3>=2);
    }
    @Test
    void secondtest() {
        Assertions.assertTrue(3>=1);
    }
}
