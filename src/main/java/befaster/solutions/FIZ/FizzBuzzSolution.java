package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(final Integer number) {
        final String numStr = number.toString();
        final boolean hasThree = numStr.contains("3");
        final boolean hasFive = numStr.contains("5");
        if((hasThree && hasFive) || (number % 3 == 0 && number % 5 == 0)) {
            return "fizz buzz";
        } else if(number % 5 == 0) {
            return "buzz";
        } else if(number % 3 == 0) {
            return "fizz";
        }
        return numStr;
    }

}
