
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();
    @Test
    public void returnZero() throws Exception {
        assertEquals(0, calculator.add (""));
    }
    @Test
    public void returnNumber() throws Exception {
        assertEquals(1, calculator.add ("1"));
    }
    @Test
    public void returnNumbers() throws Exception {
        assertEquals(2, calculator.add ("2"));
    }
    @Test
    public void numberCommaNumberSum () throws Exception {
        assertEquals(3, calculator.add("1,2"));

    }
    @Test
    public void manyNumberCommaSum () throws Exception {
        assertEquals(15, calculator.add("1,2,5,4,3"));
    }
    @Test
    public void handleNewLines () throws Exception {
        assertEquals(6, calculator.add("1\n2,3"));
    }
    @Test
    public void handleAnyDelimiter () throws Exception {
        assertEquals(3, calculator.add("//;\n1;2"));
    }
    @Test
    public void negativeNumber () throws Exception {
        calculator.add("-1");

    }

}
