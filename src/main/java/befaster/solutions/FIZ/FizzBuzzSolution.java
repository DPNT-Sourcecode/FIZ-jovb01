package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    private FizzBuzzSolutionHelper fizzBuzzSolutionHelper = new FizzBuzzSolutionHelper();

    public String fizzBuzz(final Integer number) {
        final String numStr = number.toString();
        boolean hasThree = numStr.contains("3");
        boolean hasFive = numStr.contains("5");
        boolean isDivisibleBy3 = number % 3 == 0;
        boolean isDivisibleBy5 = number % 5 == 0;
        boolean isFizz = isDivisibleBy3 || hasThree;
        boolean isBuzz = isDivisibleBy5 || hasFive;
        boolean isFizzBuzz = isFizz && isBuzz;

        boolean isDeluxe = this.fizzBuzzSolutionHelper.isDeluxe(number);
        boolean isFizzDeluxe = isFizz && isDeluxe;
        boolean isBuzzDeluxe = isBuzz && isDeluxe;
        boolean isFizzBuzzDeluxe = isFizzDeluxe && isBuzzDeluxe;

        boolean isOdd = number % 2 != 0;
        boolean isFakeDeluxe = isOdd && isDeluxe;
        boolean isFizzFakeDeluxe = isFizz && isFakeDeluxe;
        boolean isBuzzFakeDeluxe = isBuzz && isFakeDeluxe;
        boolean isFizzBuzzFakeDeluxe = isFizzFakeDeluxe && isBuzzFakeDeluxe;

        //isFizzDeluxe = isDivisibleBy3 && hasThree;
        //isBuzzDeluxe = isDivisibleBy5 && hasFive;

        if(isFizzBuzzFakeDeluxe) {
           return "fizz buzz fake deluxe";
        } else if(isFizzFakeDeluxe){
            return "fizz fake deluxe";
        } else if(isBuzzFakeDeluxe) {
            return "buzz fake deluxe";
        } else if(isFakeDeluxe){
            return "fake deluxe";
        } else if(isFizzBuzzDeluxe) {
            return "fizz buzz deluxe";
        } else if(isFizzDeluxe){
            return "fizz deluxe";
        } else if(isBuzzDeluxe) {
            return "buzz deluxe";
        } else if(isDeluxe) {
            return "deluxe";
        } else if(isFizzBuzz){
            return "fizz buzz";
        } else if(isFizz) {
            return "fizz";
        } else if(isBuzz) {
            return "buzz";
        }
        return numStr;
    }

    private boolean isDeluxe(final Integer number) {
        return false;
    }

}
