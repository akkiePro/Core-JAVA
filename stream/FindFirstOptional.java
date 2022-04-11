/*
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class FindFirstOptional{
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(6, 88,  99);

		System.out.println(values.stream()
									.filter(i -> i%5 == 0)
									.map(i -> i*2)
									.findFirst());		
	}
}
*/
/*
O/P:
Optional.empty
*/


// now we can't provide Optional.empty as output to user.
// so, we have orElse() method

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class FindFirstOptional{
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(6, 88,  99);

		System.out.println(values.stream()
									.filter(i -> i%5 == 0)
									.map(i -> i*2)
									.findFirst()
									.orElse(0));		
	}
}
/*
O/P:
0
*/

// Whatever we did, is it really efficient?
// let's compare with #Normal_Life 
	/*
	List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68, 75);
	
	// for just finding first element after filter in #Normal_Life
	int result = 0;
	for (int i : values) {
		if(i%5 == 0){
			result = i*2;
			break;
		}				
	}
	System.out.println(result);
	*/	

// As we can see, for finding first element, First we think that #Normal method is more efficient
// bcz it just normally checks for number divisible by 5.
// if yes, then simply break the loop and print

// while in #Thug_Life,
// we takes all stream
// then we apply filter(which will get ALL ELEMENTS which are divisible by 5)
// then mapping (ALL numbers which are divisible by 5 will multiply with 2)
// then we get first element

// So, here we think #Normal_Life wins
// But, NO, StreamAPI is smart

// to understand this you have to see next program : FindFirst_is_efficient_proof.java...