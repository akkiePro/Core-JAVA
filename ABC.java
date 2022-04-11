class Test{
	public void show(){
		System.out.println("Test.show()");
	}
}

class XYZ extends Test{
	public XYZ(){
		super();
	}
	public void display(){
		System.out.println("XYZ.display()");
		super.show();
	}
	public static void main(String[] args) {
		XYZ t = new XYZ();
		t.display();
	}
}