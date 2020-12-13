
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();
    @Test
    public void returnZero(){
        assertEquals(0, calculator.add (""));
    }
    @Test
    public void returnNumber(){
        assertEquals(1, calculator.add ("1"));
    }
    @Test
    public void returnNumbers(){
        assertEquals(2, calculator.add ("2"));
    }
    @Test
    public void numberCommaNumberSum (){
        assertEquals(3, calculator.add("1,2"));

    }
    @Test
    public void manyNumberCommaSum (){
        assertEquals(15, calculator.add("1,2,5,4,3"));
    }
    @Test
    public void handleNewLines (){
        assertEquals(6, calculator.add("1\n2,3"));
    }
    @Test
    public void handleAnyDelimiter (){
        assertEquals(3, calculator.add("//;\n1;2"));
    }

}
