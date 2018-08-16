package befaster.solutions.FIZ;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzSolutionTest {

    private FizzBuzzSolution sut;

    @Before
    public void setUp(){
        this.sut = new FizzBuzzSolution();
    }

    @Test
    public void shouldExpectFizzForMultiplesOf3 (){
        Assertions.assertThat(this.sut.fizzBuzz(3)).isEqualTo("fizz");
        Assertions.assertThat(this.sut.fizzBuzz(6)).isEqualTo("fizz");
        Assertions.assertThat(this.sut.fizzBuzz(9)).isEqualTo("fizz");
        Assertions.assertThat(this.sut.fizzBuzz(12)).isEqualTo("fizz");
        Assertions.assertThat(this.sut.fizzBuzz(18)).isEqualTo("fizz");
    }

    @Test
    public void shouldExpectBuzzForMultiplesOf5 (){
        Assertions.assertThat(this.sut.fizzBuzz(5)).isEqualTo("buzz");
        Assertions.assertThat(this.sut.fizzBuzz(10)).isEqualTo("buzz");
        Assertions.assertThat(this.sut.fizzBuzz(20)).isEqualTo("buzz");
        Assertions.assertThat(this.sut.fizzBuzz(25)).isEqualTo("buzz");
        Assertions.assertThat(this.sut.fizzBuzz(40)).isEqualTo("buzz");
    }
}
