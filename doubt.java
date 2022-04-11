import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

class Test{
	private int id=50;
	private String name, dept;
	public Test(int id, String name){
		this.id = id;
		this.name=name;
	}
	public Test(String dept, int id){
		this.dept = dept;
		this.id = id;
	}
	public int getId(){
		return id;
	}
}
class doubt{
	public static void main(String[] args) {

		List<Test> values1 = new ArrayList<Test>();
		values1.add(new Test(1, "Akash"));
		values1.add(new Test(2, "Vishal"));
		values1.add(new Test(3, "Disha"));

		List<Test> values2 = new ArrayList<Test>();
		values2.add(new Test("IT", 1));
		values2.add(new Test("CS", 2));
		values2.add(new Test("Mech", 3));

		// System.out.println(values1.get(0).getId());
 
		System.out.println(values1.stream().filter(status -> status.getId().equals(values2.get(0).getId()).findFirst().orElse(null))); 
	}
}