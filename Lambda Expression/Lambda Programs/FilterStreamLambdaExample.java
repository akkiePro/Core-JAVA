import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

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
class FilterStreamLambdaExample{
	public static void main(String[] args) {
		List<Product> values = new ArrayList<Product>();		
		values.add(new Product(1, "Sonata", 100000f));
		values.add(new Product(2, "Fastrack", 2500f));
		values.add(new Product(3, "Ajinomotto", 250f));
		values.add(new Product(4, "Samsung", 150000f));
		values.add(new Product(5, "iPhone", 200000f));
		values.add(new Product(6, "intex", 15000f));

		System.out.println("filtering data costlier than 20k");

		Stream<Product> filtered_data = values.stream().filter(p -> p.price > 20000);

		filtered_data.forEach(
			product -> System.out.println(product.name + ":" + product.price)
		);
	}
}