interface Adder{
	int add(int num1, int num2);
}

class Addable{
	public static void main(String[] args) {
		Adder a_obj1 = (int a, int b) -> (a+b);
		System.out.println(a_obj1.add(10,20));

		Adder a_obj2 = (a, b) -> (a+b);		// proving that it's OK if we don't define type... 
		System.out.println(a_obj2.add(100, 200));
	}
}

/*
O/P:
30
300
*/