/*
// totally efficient

import java.util.Arrays;
import java.util.List;
class FindFirst_is_efficient_proof{
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68, 75);

		// for just finding first element after filter in #Normal_Life
		int result = 0;
		for (int i : values) {
			if(i%5 == 0){		// 12 rejected, 20 will pass
				result = i*2;	// 20*2 = 40 will pass
				break;			// breaks loop
			}				
		}	
		System.out.println(result);		//40
	}
}
*/

// let's prove stream is also efficient...

// #Thug_Life
/*

*/
// filter() and map() are lazy methods / lazy evaluation methods
// where findFirst() is eagar / terminal method

// what's lazy evaluation vs terminal method?
// => LAZY EVALUATION method will complete it's whole task then further method can work
// 		for ex. here filter() will complete it's whole task then map() will do and so on...
// 			for general ex. assignments are given to complete in a week but in between faculty ask for an assignment everyone will say yes it's done but actually it's not done & when if faculty just ask for pic of completion we will take hours of time to provide pic. this is how lazy evaluation works.

// but if apply any terminal approach like findFirst() then it'll just ask above method(.map() here) to provide only first element.
// and above method will ask its above method(.filter() here) to provide just first element. & so on...
// so in reality they only brings only first element(40 here).

// but is it really happens like this?

// let me prove it...

// #PROOF
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class FindFirst_is_efficient_proof{
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68, 75);

		System.out.println(values.stream()
									.filter(FindFirst_is_efficient_proof::isDivisible)
									.map(FindFirst_is_efficient_proof::mapDouble)
									.findFirst()
									.orElse(0));		
	}
	public static boolean isDivisible(int i){
		System.out.println("is Divisible " + i);
		return i%5 == 0;
	}
	public static int mapDouble(int i){
		System.out.println("in mapDouble " + i);
		return i*2;
	}
}
/*
O/P:
is Divisible 12		// 12 rejected
is Divisible 20		// 20 approved and passed to map() from filter()
in mapDouble 20		// 20*2 passed to findFirst() from map()
40					// 40 passed as o/p by findFirst() 
*/

// Prooved with Respect++