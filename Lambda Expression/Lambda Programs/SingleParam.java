interface Sayable{
	public String say(String name);
}
class SingleParam{
	public static void main(String[] args) {
		Sayable s = (name) -> {
			return "Hello " + name;
		};
		System.out.println(s.say("Akash"));

		Sayable s1 = name -> {		// I was just proving that for a single argument paranthesis not required
			return name + " Bye";
		};
		System.out.println(s1.say("Akash"));
	}
}