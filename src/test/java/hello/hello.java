package hello;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class hello {
    @Test
    void myFirstTest() {
        assertEquals(Sample.add(1,2), 3);
    }
}
