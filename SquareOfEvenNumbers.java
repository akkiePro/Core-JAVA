class SquareOfEvenNumbers{
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6};
		int result[] = new int[a.length];
		fun(a,result);	

		for (int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
	public static void fun(int []a, int r[]){
		int count=0;
		for (int i=0; i<a.length; i++) {
			if(a[i]%2==0){
				r[count] = a[i] * a[i];
				count++;
			}
		}
	}
}