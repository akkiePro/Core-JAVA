// #Normal_Life

/*
import java.util.Arrays;
import java.util.List;
class DivisibleBy5{
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68, 75);

		int result = 0;
		for (int i : values) {
			if(i%5 == 0){	
				// System.out.println(i);	// 20, 35, 55, 75
				result += i;	// 20+35+55+75
			}
		}
		System.out.println(result);		// 185
	}
}
*/


// #Thug_Life

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
class DivisibleBy5{
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68, 75);

		System.out.println(values.stream()
									.filter(i -> i%5==0)
									.reduce(0, Integer::sum));	// O/P: 185
		// using filter() life becomes more easy
	}
}


// how this filter worked let's understand in FilterExplain.java