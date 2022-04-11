// findFirst() will give us the first value of stream

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class FindFirst{
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68, 75);

		System.out.println(values.stream()
									.filter(i -> i%5 == 0)
									.map(i -> i*2)
									.findFirst());		
	}
}
/*
O/P:
Optional[40]
*/

// why Optional?
// bcz when there's no matching any stream value then it'll show you Optional.emplty instead of throwing Exception/Error
// example: FindFirstOptional.java