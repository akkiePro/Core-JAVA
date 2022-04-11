class tredd extends Thread{
	public static void main(String[] args) {
		tredd t = new tredd();
		t.start();
	}
	public void run(){
		System.out.println("this is run method...");
	}
}