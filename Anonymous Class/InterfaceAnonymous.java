interface I{
	public void show();
}

class Anonymous{
	public void display(){
		I i_obj = new I(){
			public void show(){
				System.out.println("show() in Anonymous class");
			}
		};
		i_obj.show();
	}
}

class InterfaceAnonymous{
	public static void main(String[] args) {
		Anonymous a_obj = new Anonymous();
		a_obj.display();
	}
}

/*
O/P:
show() in Anonymous class
*/

// 4 .class file will be created: 1) I.class 	2) Anonymous.class 	 3) Anonymous$1.class 	4) InterfaceAnonymous.class