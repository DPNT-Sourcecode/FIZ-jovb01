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
        Assertions.assertThat(this.sut.isDeluxe(33)).isTrue();
        Assertions.assertThat(this.sut.isDeluxe(44)).isTrue();
        Assertions.assertThat(this.sut.isDeluxe(555)).isTrue();
        Assertions.assertThat(this.sut.isDeluxe(9999)).isTrue();
        Assertions.assertThat(this.sut.isDeluxe(223)).isFalse();
        Assertions.assertThat(this.sut.isDeluxe(9989)).isFalse();
    }
}
