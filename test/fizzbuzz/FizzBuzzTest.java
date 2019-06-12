package fizzbuzz;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void shouldPrintSimpleNumbers() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> sequence = fizzBuzz.generateSequence(2);

        assertEquals(sequence, asList("1", "2"));
    }

    @Test
    public void shouldPrintFizzWhenDivisibleBy3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> sequence = fizzBuzz.generateSequence(4);

        assertEquals(sequence, asList("1", "2", "Fizz", "4"));
    }

    @Test
    public void shouldPrintBuzzWhenDivisibleBy5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> sequence = fizzBuzz.generateSequence(6);

        assertEquals(sequence, asList("1", "2", "Fizz", "4", "Buzz", "Fizz"));
    }

    @Test
    public void shouldPrintFizzBuzzWhenDivisibleBy3And5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> sequence = fizzBuzz.generateSequence(16);

        assertEquals(sequence, asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16"));
    }
}
