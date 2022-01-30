import java.util.stream.Stream;

public interface IntSequence {

    static Stream<Integer> of(Integer... numbers) {
        Stream<Integer> stream = Stream.of(numbers);
        Stream<Integer> streamInfinity = Stream.generate(() -> 1).limit(100);
        return Stream.concat(stream, streamInfinity);
    }

    static Stream<Integer> squares(int number) {
        return Stream.iterate(number, x -> x + 1).map(x -> x * x).limit(100);
    }
}
