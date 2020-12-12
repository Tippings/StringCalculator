public class Calculator {
    public static int add(String inputString) {
       if(inputString.isEmpty())
           return 0;

       String[] numbers = inputString.split(",");
           int sum = 0;
           for (String number : numbers) {
               sum += Integer.valueOf(number);
           }

           return sum;
       }
    }

