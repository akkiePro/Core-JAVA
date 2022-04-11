class sum{
	static int fun(int no){
		if(no<1){
			System.out.println("enter valid choice...");
		}
		else if(no==1) {
			return no;
		}
		else{
			no = no + fun(no-1);
		}
		return no;
	}
	public static void main(String[] args) {
		int num = 10;
		System.out.println(fun(num));
	}
}