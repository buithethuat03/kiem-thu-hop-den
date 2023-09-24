import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testStudent1() {
        assertEquals(-1, Main.kiemtrahocphi(true, -0.1));
    }

    @Test
    public void testStudent2() {
        assertEquals(25000000, Main.kiemtrahocphi(true, 2));
        
    }

    @Test
    public void testStudent3() {
        assertEquals(22000000, Main.kiemtrahocphi(true, 5.5));
    }

    @Test
    public void testStudent4() {
        assertEquals(18000000, Main.kiemtrahocphi(true, 6.5));
    }

    @Test
    public void testStudent5() {
        assertEquals(0, Main.kiemtrahocphi(true, 8));
    }

    @Test
    public void testStudent6() {
        assertEquals(-1, Main.kiemtrahocphi(true, 10));
    }

    @Test
    public void testOther1() {
        assertEquals(-1, Main.kiemtrahocphi(false, -0.1));
    }

    @Test
    public void testOther2() {
        assertEquals(30000000, Main.kiemtrahocphi(false, 2));
    }

    @Test
    public void testOther3() {
        assertEquals(26000000, Main.kiemtrahocphi(false, 5.5));
        
    }

    @Test
    public void testOther4() {
        assertEquals(22000000, Main.kiemtrahocphi(false, 6.5));
    }

    @Test
    public void testOther5() {
        assertEquals(0, Main.kiemtrahocphi(false, 8));
    }

    @Test
    public void testOther6() {
        assertEquals(-1, Main.kiemtrahocphi(false, 10));
    }
}
