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

    @Test
    public void shouldExpectFizzBuzzForMultiplesOf15 (){
        Assertions.assertThat(this.sut.fizzBuzz(15)).isEqualTo("fizz buzz");
        Assertions.assertThat(this.sut.fizzBuzz(30)).isEqualTo("fizz buzz");
        Assertions.assertThat(this.sut.fizzBuzz(45)).isEqualTo("fizz buzz");
        Assertions.assertThat(this.sut.fizzBuzz(60)).isEqualTo("fizz buzz");
        Assertions.assertThat(this.sut.fizzBuzz(75)).isEqualTo("fizz buzz");
    }

    @Test
    public void shouldExpectFizzWhenNumberContains3() {
        Assertions.assertThat(this.sut.fizzBuzz(3)).isEqualTo("fizz");
        Assertions.assertThat(this.sut.fizzBuzz(13)).isEqualTo("fizz");
        Assertions.assertThat(this.sut.fizzBuzz(23)).isEqualTo("fizz");
        Assertions.assertThat(this.sut.fizzBuzz(32)).isEqualTo("fizz");
        Assertions.assertThat(this.sut.fizzBuzz(33)).isEqualTo("fizz");
        Assertions.assertThat(this.sut.fizzBuzz(43)).isEqualTo("fizz");
        Assertions.assertThat(this.sut.fizzBuzz(343)).isEqualTo("fizz");
    }

    @Test
    public void shouldExpectFizzWhenNumberContains5() {
        Assertions.assertThat(this.sut.fizzBuzz(5)).isEqualTo("buzz");
        Assertions.assertThat(this.sut.fizzBuzz(25)).isEqualTo("buzz");
        Assertions.assertThat(this.sut.fizzBuzz(50)).isEqualTo("buzz");
        Assertions.assertThat(this.sut.fizzBuzz(55)).isEqualTo("buzz");
        Assertions.assertThat(this.sut.fizzBuzz(752)).isEqualTo("buzz");
        Assertions.assertThat(this.sut.fizzBuzz(959)).isEqualTo("buzz");
    }

    @Test
    public void shouldExpectFizzBuzzWhenIsFizzAndIsBuzz() {
        Assertions.assertThat(this.sut.fizzBuzz(456)).isEqualTo("fizz buzz");
        Assertions.assertThat(this.sut.fizzBuzz(546)).isEqualTo("fizz buzz");
    }
}
