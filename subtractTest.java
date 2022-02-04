import static org.junit.Assert.*;
import org.junit.Test;

public class subtractTest {
    @Test
    public void sub() {
        subtract ex = new subtract();
        int ans = 3;
        assertEquals(ans,ex.sub(5,2)); //failing test
    }
}
