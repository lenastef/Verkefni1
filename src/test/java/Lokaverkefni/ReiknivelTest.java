package Lokaverkefni;

import com.example.reiknivel.Reiknivel;
import org.junit.jupiter.api.Test;

public class ReiknivelTest {

    @Test
    public void testMinus() {
        Reiknivel calculator = new Reiknivel();
        Assert.assertEquals(0, calculator.minus(2, 2));
    }

    @Test
    public void testDivide() {
        Reiknivel calculator = new Reiknivel();
        Assert.assertEquals(2, calculator.divide(6, 3));
    }

}
