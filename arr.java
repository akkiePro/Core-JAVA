class arr{
	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4}, {5,6,7}};
		System.out.println("array length = ["+(arr[0].length-1)+"]["+(arr[1].length-1)+"]");
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++){
				System.out.println(arr[i][j]);
			}
		}
	}
}