public class Seperator {

    protected String [] split (String inputString){
        String inputDelimiters = pullOutDelimiters(inputString);
        String [] numbers = pullOutValues(inputString, inputDelimiters);
        return numbers;
    }

    private String [] pullOutValues (String inputString, String inputDelimiters){
        if (inputString.startsWith("//"));
        inputString = inputString.substring(4);
        String [] numbers = inputString.split(inputDelimiters);
        return numbers;

    }
    private String pullOutDelimiters (String inputString){
        String inputDelimiters = ",|\n";
        if (inputString.startsWith("//"));
        inputDelimiters+= "|" + inputString.substring(2, 3);
        return inputDelimiters;
    }
}
