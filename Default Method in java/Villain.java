public class Villain implements Actor{
	public void act(){
		System.out.println("I can Act");
	}
	public void speak(){
		System.out.println("I can Speak");
	}
	public void rude(){
		System.out.println("I am rude");
	}

	public static void main(String[] args) {
		Villain v = new Villain();
		v.act();
		v.speak();
		v.rude();
		v.comedy();
	}
}