public class Calculator {
    Seperator seperator;

    public Calculator(){
        seperator = new Seperator();
    }
    public int add(String inputString) throws Exception {
       if("".equals(inputString))
           return 0;

        String[] numbers = seperator.split(inputString);

        return addArray(numbers);
    }
    private int addArray (String [] numbers) throws Exception {
        for (String number : numbers) {
            if (convertToInt(number)<0){
                throw new Exception("Negative number not alowed!");
            }
        }

        int sum = 0;
        for (String number : numbers) {
            sum += convertToInt(number);
        }
        return sum;
     }
     private int convertToInt (String numbers){
        return Integer.valueOf(numbers);
    }
}

