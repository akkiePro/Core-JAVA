// Predicate is a @FunctionalInterface. So, it supports lambda expressions
// Predicate accepts only one argument T => Predicate<T>
// Predicate returns one Boolean valued function.
// Predicate has one abstract method which is following:
/*
@FunctionalInterface
public interface Predicate<T>{
	boolean test(T t);
}
*/
/*
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Predicate;	// this import required

class FilterExplain{
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68, 75);

		// System.out.println(values.stream().filter(i -> i%5 == 0).reduce(0, Integer::sum));
		// let's understand this filter logic, how it works?

		Predicate<Integer> p = new Predicate<Integer>(){
			public boolean test(Integer i){
				return i%5 ==0;		// returns boolean value
			}
		};
		System.out.println(values.stream().filter(p).reduce(0, Integer::sum));	// filter using some Predicate logic here so let's implement Predicate p
	}
}
*/



// now let's enhance it...
// STEP 1:
/*
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Predicate;

class FilterExplain{
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68, 75);

		// p is used only once. so, we don't required separate object
		System.out.println(values.stream()
									.filter(new Predicate<Integer>(){
												public boolean test(Integer i){
													return i%5 ==0;	
												}
											})		//instead of p we put implemetation of p here
									.reduce(0, Integer::sum));	
	}
}
*/


// STEP 2: more efficient, more enhance...
/*
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
// import java.util.function.Predicate;  // now not required

class FilterExplain{
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68, 75);

		System.out.println(values.stream()
									.filter(i -> i%5 ==0)	// only one abstract method. so, don't required to override(define/declare again)
										// no return requied in lambda 
									.reduce(0, Integer::sum));	
	}
}
*/



// STEP 3: what if someone say give me sum of DOUBLE of DivisibleBy5
// simply we can use map() over here...

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class FilterExplain{
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68, 75);

		System.out.println(values.stream()
									.filter(i -> i%5 ==0)
									.map(i -> i*2)		// 40, 70, 110, 150	
									.reduce(0, Integer::sum));	// 40+70+110+175 = 370
	}
}