import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
class same_stream{
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,23,3,4,5,6);

		Stream<Integer> s = values.stream();
		s.forEach(System.out::println); // will work
		s.forEach(System.out::println); // exception
	}
}