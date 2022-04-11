class Thread_Interface implements Runnable{
	public static void main(String[] args) {
		Thread_Interface obj = new Thread_Interface();
		Thread t = new Thread(obj);
		t.start();
	}

	public void run(){
		System.out.println("run method via Runnable interface...");
	}
}