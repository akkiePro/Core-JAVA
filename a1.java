
class array{
	public static array []student = new array[10];
	String name;
	int no;
	boolean result;

	public array(String name, int no, boolean result){
		this.name = name;
		this.no = no;
		this.result = result;
	}

	public String toString(){
		return this.name + " enrollment no. " + this.no + " is " + this.result;
	}

	public static void f1(){
		for(int i=0; i<student.length; i++){
			System.out.println(student[i]);
		}
	}
	public static void main(String[] args) {
		array s1 = new array("Akash", 21, true);
		student[1] = s1;
		array s2 = new array("Disha", 10, false);
		student[0] = s2;

		for(int i=0; i<student.length; i++){
			System.out.println("record no. " + i + " = " + student[i]);
		}
		// array x = new array("Priyansi", 31, true);
		// student[3] = x;
		// f1();

		// System.out.println(student[1]);
		// System.out.println(student[0]);
	}
}