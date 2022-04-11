/*class StaticDemo{
	public static void show(){
		System.out.println("i'm static method...");
	}
	public static int ILY = 143;
}

class static_programs{
	public static void main(String[] args) {
		StaticDemo.show();
		System.out.println(StaticDemo.ILY);
	}
}*/
package p1;
import p1.kaipn;
class simple{
	public void show(){
		System.out.println("i'm normal method...");
	}
	public int ILY = 143;
}

public class static_programs{
	public static void main(String[] args) {
		simple obj = new simple();
		obj.show();
		System.out.println(obj.ILY);

		kaipn.mainCaller();
	}
}