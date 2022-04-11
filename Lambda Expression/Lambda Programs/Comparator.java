import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Product{
	int id;
	String name;
	float price;

	public Product(int id, String name, float price){
		// super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
class Comparator{
	public static void main(String[] args) {
		List<Product> values = new ArrayList<Product>();
		values.add(new Product(1, "Fastrack", 2500f));
		values.add(new Product(2, "Ajinomotto", 250f));
		values.add(new Product(3, "Sonata", 1500f));

		System.out.println("Sorting by name...");

		Collections.sort(values, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});

		for(Product p : values){
			System.out.println(p.id + " " + p.name + " " + p.price);
		}
	}
}