package fizzbuzz;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class FizzBuzz {

    public List<String> generateSequence(int size) {
        return IntStream.rangeClosed(1, size).mapToObj(this::toElement).collect(toList());
    }

    private String toElement(int i) {
        if (i % 15 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(i);
    }
}
