import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SimpleTest {

    @Test
    @Tag("base")
    public void test1() {
        Assertions.assertTrue(true, "message");
    }
}
