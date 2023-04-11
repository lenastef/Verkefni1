package Lokaverkefni;

import com.example.reiknivel.Reiknivel;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ReiknivelTest {

    private Reiknivel reiknivel;

    @BeforeAll
    public void setUp() {
        reiknivel = new Reiknivel();
    }

    @Test
    public void testLausn() {
        reiknivel.lausn();
        assert reiknivel.getLausnargluggi().getText().equals("0");

    }

}
