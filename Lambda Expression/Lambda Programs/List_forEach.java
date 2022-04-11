import java.util.List;
import java.util.ArrayList;
public class List_forEach{
	public static void main(String[] args) {
		List<String> values = new ArrayList<>();
		values.add("Akash");
		values.add("Shruti");
		values.add("Khushi");
		values.add("Disu");

		values.forEach(
			i -> System.out.println(i)
		);
	}
}