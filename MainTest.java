import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testStudent() {
        assertEquals(-1, Main.kiemtrahocphi(true, -0.1));
        assertEquals(25000000, Main.kiemtrahocphi(true, 2));
        assertEquals(22000000, Main.kiemtrahocphi(true, 5.5));
        assertEquals(18000000, Main.kiemtrahocphi(true, 6.5));
        assertEquals(0, Main.kiemtrahocphi(true, 8));
        assertEquals(-1, Main.kiemtrahocphi(true, 10));
    }

    @Test
    public void testOther() {
        assertEquals(-1, Main.kiemtrahocphi(false, -0.1));
        assertEquals(30000000, Main.kiemtrahocphi(false, 2));
        assertEquals(26000000, Main.kiemtrahocphi(false, 5.5));
        assertEquals(22000000, Main.kiemtrahocphi(false, 6.5));
        assertEquals(0, Main.kiemtrahocphi(false, 8));
        assertEquals(-1, Main.kiemtrahocphi(false, 10));
    }
}
