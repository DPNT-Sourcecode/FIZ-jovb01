package befaster.solutions.FIZ;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzSolutionHelperTest {

    private FizzBuzzSolutionHelper sut;

    @Before
    public void setUp() {
        this.sut = new FizzBuzzSolutionHelper();
    }

    @Test
    public void shouldExpectTrueOrFalseBasedOnInputProvided() {
        Assertions.assertThat(this.sut.isDeluxe(11)).isTrue();
        Assertions.assertThat(this.sut.isDeluxe(22)).isTrue();
        Assertions.assertThat(this.numberService.isDeluxe(33)).isTrue();
        Assertions.assertThat(this.numberService.isDeluxe(44)).isTrue();
        Assertions.assertThat(this.numberService.isDeluxe(555)).isTrue();
        Assertions.assertThat(this.numberService.isDeluxe(9999)).isTrue();
        Assertions.assertThat(this.numberService.isDeluxe(223L)).isFalse();
        Assertions.assertThat(this.numberService.isDeluxe(9989L)).isFalse();
    }
}
