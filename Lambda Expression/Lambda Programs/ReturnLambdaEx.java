interface Sayable{
	public String say();
}
class ReturnLambdaEx{
	public static void main(String[] args) {
		Sayable s = () -> {
			return "I have nothing to say...";
		};
		System.out.println(s.say());
	}
}

/*
O/P:
I have nothing to say...
*/