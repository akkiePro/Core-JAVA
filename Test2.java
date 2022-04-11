class Test2{
 //     1
 //    22
 //   123
 //  4444
 // 12345

	public static void main(String[] args) {
		int num=1;
		for(int i=1; i<5; i++){
			for(int j=5; j>i; j--){
				System.out.print(" ");
			}
			for(int k=0; k<i; k++){
				if(i%2==0){
					System.out.print(i);					
				}
				else{
					System.out.print(num);
					num+=1;
				}
			}
			System.out.println();
		}
	}
}