// Anonymous = unnamed

/*
SYNTAX:
class outerClass {
    // defining anonymous class
    object1 = new Type(parameterList) {
         // body of the anonymous class
    };
}
*/

/*
Advantages of Anonymous Classes :
In anonymous classes, objects are created whenever they are required. 
That is, objects are created to perform some specific tasks.
*/

/*
This program will create total 3 following .class files :
	HavingName.class
	AnonymousClass.class
	AnonymousClass$1.class 	// this one will be that anonymous class
	AnonymousMain.class
*/

class HavingName{
	public void show(){
		System.out.println("having_name");
	}
}

class AnonymousClass{
	public void display(){
		HavingName hn_obj = new HavingName(){	// here one anonymous class will be created
			public void show(){		// Overriden show() method here
				System.out.println("having_name with help of AnonymousClass");
			}
		};
		hn_obj.show();
	} 	
}

class AnonymousMain{
	public static void main(String[] args) {
		AnonymousClass ac_obj = new AnonymousClass();
		ac_obj.display();
	}
}

/*
O/P:
having_name with help of AnonymousClass
*/