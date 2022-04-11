import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class stream_filter{
	public static void main(String[] args) {
		// System.out.println("after adding orElse()");
		List<Integer> values = Arrays.asList(null,1,3,6,5,6);
		// List<Integer> values = new ArrayList<>();
		// for(int i=1; i<=10; i++){
		// 	values.add(i);
		// }
		System.out.println(values.stream().filter(i -> {
			System.out.println(values);
			return true;
		}).findFirst().orElse(0));
	}
}