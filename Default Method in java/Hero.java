public class Hero implements Actor{
	public void act(){
		System.out.println("I can Act");
	}
	public void speak(){
		System.out.println("I can Speak");
	}
	public void comedy(){
		System.out.println("I can make people laugh");
	}
	public static void main(String[] args) {
		Hero h = new Hero();
		h.act();
		h.speak();
		h.comedy();
	}
}