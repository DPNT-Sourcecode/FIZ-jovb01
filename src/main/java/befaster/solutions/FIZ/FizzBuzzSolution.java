package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(final Integer number) {
        final String numStr = number.toString();
        boolean hasThree = numStr.contains("3");
        boolean hasFive = numStr.contains("5");
        boolean isDivisibleBy3 = number % 3 == 0;
        boolean isDivisibleBy5 = number % 5 == 0;
        boolean isFizz = isDivisibleBy3 || hasThree;
        boolean isBuzz = isDivisibleBy5 || hasFive;
        boolean isFizzBuzz = isDivisibleBy3 && isDivisibleBy5;
        boolean isFizzAndBuzz = isFizz && isBuzz;

        if(isFizzAndBuzz || isFizzBuzz){
            return "fizz buzz";
        } else if(isFizz) {
            return "fizz";
        } else if (isBuzz) {
            return "buzz";
        }
        return String.valueOf(number);
    }

}
