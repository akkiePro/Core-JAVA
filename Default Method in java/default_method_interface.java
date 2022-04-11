interface Actor{
	void act();
	void speak();
	default void comedy(){
		System.out.println("Now i can also make people laugh");
	}
}
