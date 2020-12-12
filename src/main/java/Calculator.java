public class Calculator {
    public static int add(String inputString) {
       if(inputString.isEmpty()) {
           return 0;
       } else if (inputString.contains(",")){
           String[] numbers = inputString.split(",");
           return Integer.parseInt(numbers[0])+Integer.parseInt(numbers[1]);
       }else {
           return Integer.parseInt(inputString);
       }
    }
}
