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
        boolean isFizzBuzz = isDivisibleBy3 && isDivisibleBy5;
        boolean isFizzAndBuzz = isFizz && isBuzz;
        boolean isDeluxe = this.fizzBuzzSolutionHelper.isDeluxe(number);
        boolean isFizzBuzzDeluxe = isFizzAndBuzz && isDeluxe;
        boolean isFizzAndIsDeluxe = isFizz && isDeluxe;
        boolean isBuzzAndIsDeluxe = isBuzz && isDeluxe;
        boolean isOdd = number % 2 != 0;
        boolean isFakeDeluxe = isOdd && isDeluxe;
        boolean isFizzAndFakeDeluxe = isFizz && isFakeDeluxe;
        boolean isBuzzAndFakeDeluxe = isBuzz && isFakeDeluxe;
        boolean isFizzAndIsBuzzAndIsFakeDeluxe = isFizz && isBuzz && isFakeDeluxe;
        boolean isFizzDeluxe = isDivisibleBy3 && hasThree;
        boolean isBuzzDeluxe = isDivisibleBy5 && hasFive;
        boolean isFizzDeluxeBuzzDeluxe = isFizzDeluxe && isBuzzDeluxe;

        /*if(isFizzAndIsBuzzAndIsFakeDeluxe) {
           return "fizz buzz fake deluxe";
        } else if(isFizzAndFakeDeluxe){
            return "fizz fake deluxe";
        } else if(isBuzzAndFakeDeluxe) {
            return "buzz fake deluxe";
        } else if(isFakeDeluxe){
            return "fake deluxe";
        } else if(isFizzBuzzDeluxe) {
            return "fizz buzz deluxe";
        } else if(isFizzAndIsDeluxe){
            return "fizz deluxe";
        } else if (isBuzzAndIsDeluxe) {
            return "buzz deluxe";
        } else*/
        if(isFizzAndIsBuzzAndIsFakeDeluxe) {
            return "fizz buzz fake deluxe";
        } else if(isFizzAndFakeDeluxe){
            return "fizz fake deluxe";
        } else if(isBuzzAndFakeDeluxe) {
            return "buzz fake deluxe";
        } else if(isFakeDeluxe){
            return "fake deluxe";
        } else if(isFizzDeluxeBuzzDeluxe){
            return "fizz deluxe buzz deluxe";
        } else if(isFizzDeluxe) {
            return "fizz deluxe";
        } else if(isBuzzDeluxe) {
            return "buzz deluxe";
        }  else if(isFizzAndBuzz || isFizzBuzz){
            return "fizz buzz";
        } else if(isFizz) {
            return "fizz";
        } else if(isBuzz) {
            return "buzz";
        } else if(isDeluxe) {
            return "deluxe";
        }
        return numStr;
    }


}
