/*class forName{
	public static void main(String[] args) throws Exception {
		Class.forName("Demo");	
	}
}
class Demo {
	{
		System.out.println("in instance {block}...");
	}
	static {
		System.out.println("in static {block}...");
	}
}*/
/*o/p : 
in static {block}...*/

class forName{
	public static void main(String[] args) throws Exception {
		Class.forName("Demo").newInstance();
	}
}
class Demo {
	{
		System.out.println("in instance {block}...");
	}
	static {
		System.out.println("in static {block}...");
	}
}
/*
O/P : 
in static {block}...
in instance {block}...
*/