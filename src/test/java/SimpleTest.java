import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SimpleTest {

    @Test
    @Tag("base")
    public void test1() {
        Assertions.assertTrue(true, "message");
    }

    @Test
    @Tag("base1")
    public void test2() {
        System.out.println("====================================");
        Assertions.assertTrue(true, "message");
        System.out.println("====================================");
    }
}
