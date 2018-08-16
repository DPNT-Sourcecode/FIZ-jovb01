package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    private FizzBuzzSolutionHelper fizzBuzzSolutionHelper = new FizzBuzzSolutionHelper();

    public String fizzBuzz(final Integer number) {
        final String numStr = number.toString();
        final boolean hasThree = numStr.contains("3");
        final boolean hasFive = numStr.contains("5");
        final boolean isDivisibleBy3 = number % 3 == 0;
        final boolean isDivisibleBy5 = number % 5 == 0;

        final boolean isFizz = isDivisibleBy3 || hasThree;
        final boolean isBuzz = isDivisibleBy5 || hasFive;
        final boolean isFizzBuzz = isFizz && isBuzz;

        final boolean isDeluxe = this.fizzBuzzSolutionHelper.isDeluxe(number);
        boolean isFizzDeluxe = isFizz && isDeluxe;
        boolean isBuzzDeluxe = isBuzz && isDeluxe;
        final boolean isFizzBuzzDeluxe = isFizzDeluxe && isBuzzDeluxe;

        final boolean isOdd = number % 2 != 0;
        final boolean isFakeDeluxe = isOdd && isDeluxe;
        final boolean isFizzFakeDeluxe = isFizz && isFakeDeluxe;
        final boolean isBuzzFakeDeluxe = isBuzz && isFakeDeluxe;
        final boolean isFizzBuzzFakeDeluxe = isFizzFakeDeluxe && isBuzzFakeDeluxe;

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

}
