// STEP 1:
/*
import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.BinaryOperator;	

class StreamMapEnhanced{
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

		// we are using f only once. so, let's remove it and put the implemetation where f is being used

		// we also have used b only once. so now you are smarter. do the same as above...

		Stream s = values.stream();		
		Stream s1 = s.map(new Function<Integer, Integer>(){		// implemetation of f has put here
			public Integer apply(Integer i){
				return i*2;
			}
		});		
								
		Integer result = (Integer)s1.reduce(0, new BinaryOperator<Integer>(){		// implemetation of b has put here
			public Integer apply(Integer i, Integer j){		
				return i+j;
			}
		});	

		System.out.println(result);;
	}
}
*/


// STEP 2: we are using @FunctionalInterface by java 1.8 so we can use lambda expression as well
/*
import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;	

class StreamMapEnhanced{
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

		Stream<Integer> s = values.stream();	// <Integer> added
		Stream<Integer> s1 = s.map(i -> i*2);		// lambda expression applied & <Integer> added
								
		Integer result = (Integer)s1.reduce(0, (c, e) -> c+e);	
		// lambda expression applied 
		 // and
		  // changed name from i, j to c, e
		   // where, c stands for carry and e stands for value.

		System.out.println(result);;
	}
}
*/



// STEP 3: now let's use map() finally...
/*
import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;	

class StreamMapEnhanced{
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

		Stream<Integer> s = values.stream();	
		// let's remove s1		
								
		Integer result = s.map(i -> i*2).reduce(0, (c, e) -> c+e);	// let's introduce map() here & use lambda expression

		System.out.println(result);;
	}
}
*/


// STEP 4: why we converting List to Stream separately ? 
// & even Integer result also don't required
/*
import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;	

class StreamMapEnhanced{
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

		// let's remove s			
								
		System.out.println(values.stream().map(i -> i*2).reduce(0, (c, e) -> c+e));	// write conversion List to Stream here
		// write the whole statement in S.o.p();
	}
}
*/


// STEP 5: Coding Standard
/*
import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;	

class StreamMapEnhanced{
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);		
								
		System.out.println(values.stream().map(i -> i*2).reduce(0, (c, e) -> Integer.sum(c,e)));
		// instead of manually adding(c+e) we can take help of sum() method	
	}
}
*/




// STEP 6: how we forgot METHOD REFERENCE

import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

class StreamMapEnhanced{
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);		
								
		System.out.println(values.stream().map(i -> i*2).reduce(0, Integer::sum));	// METHOD REFERENCE
	}
}
/*
O/P:
42
*/