
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void returnZero(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.add (""));
    }
    @Test
    public void returnNumber(){
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.add ("1"));
    }
    @Test
    public void returnNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add ("2"));
    }

}
