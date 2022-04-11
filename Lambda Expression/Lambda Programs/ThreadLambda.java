class ThreadLambda{
	public static void main(String[] args) {
		// without lambda expression
		Runnable r1 = new Runnable(){
			public void run(){
				System.out.println("Thread1 is running(without lambda)...");
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();


		// with lambda expression
		Runnable r2 = () -> {
			System.out.println("Thread2 is running(with lambda)...");
		};
		Thread t2 = new Thread(r2);
		t2.start();
	}
}