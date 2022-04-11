class a2{
	public static void main(String[] args) {
		int a[] = new int[10];
		for (int i=0; i<10; i++) {
			a[i] = (i+1) * (i+1);
			System.out.println(a[i]);
		}
		System.out.println(a[5]);
	}
}