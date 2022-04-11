// blocks will automatically called when object is created

/*class static_block{
	public static void main(String[] args) {
		Demo obj = new Demo();	// blocks of Demo automatically called
	}
}

class Demo{
	static{
		System.out.println("in static block...");
	}
	{
		System.out.println("in instance(obj) block...");
	}
}*/
/*
O/P :
in static block...
in instance(obj) block...
*/


// even if we type static block later still staic{} will execute first while creation of instance
class static_block{
	public static void main(String[] args) {
		new Demo();	// static{} will execute first...
	}
}

class Demo{
	{
		System.out.println("in instance(obj) block...");
	}
	static{
		System.out.println("in static block...");
	}
}
/*
O/P :
in static block...
in instance(obj) block...
*/