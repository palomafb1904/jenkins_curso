package prueba;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProgramTest {

    @Test
    public void sumar5y7(){
        final int expected=12;
        final int actual=new Program().suma(5,7);
        assertEquals(actual,expected);

    }

    @Test
    public void sumar5y8(){
        final int expected=13;
        final int actual=new Program().suma(5,8);
        assertEquals(actual,expected);

    }
}
