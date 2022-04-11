/*
import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

class StreamMapExplain{
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

		Stream s = values.stream();		// but we don't want to create object

		System.out.println(s);
	}
}
*/

/*
import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

class StreamMapExplain{
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

		Stream s = values.stream();		
		s.map(null);		// but for this we have to implement Function

		System.out.println(s);
	}
}
*/

/*
it's a Functional Interface (so there will be only one abstract method)

Syntax of Function:
@FunctionalInterface
Function<T, R> obj = new Function<T, R>(){
	// R apply(T t);
}; 
where T=DataType and R=ReturnType
*/

/*
import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.function.Function;		// this import required

class StreamMapExplain{
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

		Function<Integer, Integer> f = new Function<Integer, Integer>(){
			public Integer apply(Integer i){
				return i*2;
			}
		};
		Stream s = values.stream();		
		Stream s1 = s.map(f);		
		Stream s2 = s1.reduce(null);	// reduce will take 2 parameter initial and object of binary operator

		// System.out.println(s);
		System.out.println(values.stream());
	}
}
*/

/*
it's a @FunctionalInterface
Syntax of BinaryOperator:
public interface BinaryOperator<T> extends BiFunction<T, T, T> {

}
No methods in  BinaryOperator

what's BiFunction?
it's @FunctionalInterface
public interface BiFunction<T, U, R> {
	// R apply(T t, U u);
}
*/

import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.BinaryOperator;	// this import required  // came in java 1.8

class StreamMapExplain{
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

		Function<Integer, Integer> f = new Function<Integer, Integer>(){
			public Integer apply(Integer i){
				return i*2;		// 2 4 6 8 10 12
			}
		};

		BinaryOperator<Integer> b = new BinaryOperator<Integer>(){
			public Integer apply(Integer i, Integer j){
				return i+j;
			}
		};

		Stream s = values.stream();		
		Stream s1 = s.map(f);		
								// 2 4 6 8 10 12
		Integer result = (Integer)s1.reduce(0, b);	
/*
		how it works?
		0 is initial value.
		so, 0+2=2 	// according to apply(Integer i, Integer j) function
		then, 2+4=6
		then, 6+6=12
		then, 12+8=20
		then, 20+10=30
		then, 30+12=42 // final O/P
*/
		System.out.println(result);;
	}
}
/*
O/P:
42
*/

/*
for this program compilation you'll get this NOTES:
C:\Users\Akki Pro\Desktop\java\stream> javac StreamMapExplain.java
Note: StreamMapExplain.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
*/

/*
if you'll follow Notes you'll get following 2 warnings :
C:\Users\Akki Pro\Desktop\java\stream>javac -Xlint:unchecked StreamMapExplain.java
StreamMapExplain.java:112: warning: [unchecked] unchecked call to <R>map(Function<? super T,? extends R>) as a member of the raw type Stream
                Stream s1 = s.map(f);
                                 ^
  where R,T are type-variables:
    R extends Object declared in method <R>map(Function<? super T,? extends R>)
    T extends Object declared in interface Stream
StreamMapExplain.java:114: warning: [unchecked] unchecked call to reduce(T,BinaryOperator<T>) as a member of the raw type Stream
                Integer result = (Integer)s1.reduce(0, b);
                                                   ^
  where T is a type-variable:
    T extends Object declared in interface Stream
2 warnings
*/



// let's enhance this code OR let's make this code efficient(refer StreamMapEnhanced)