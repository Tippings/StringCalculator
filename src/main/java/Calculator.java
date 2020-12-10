public class Calculator {
    public int add(String inputString) {
       if(inputString.isEmpty())
           return 0;
       return Integer.parseInt(inputString);
    }
}
