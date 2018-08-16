package befaster.solutions.FIZ;

import java.util.regex.Pattern;

public class FizzBuzzSolutionHelper {

    public boolean isDeluxe(final Integer number) {
        if(number > 10) {
            final Pattern pattern = Pattern.compile("^(\\d)\\1*$");
            return pattern.matcher(number.toString()).matches();
        }
        return false;
    }
}
