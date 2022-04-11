interface Sayable{
	String say(String message);
}
class MultipleStatements{
	public static void main(String[] args) {
		Sayable person = message -> {
			String str1 = "I would like to say,";
			String str2 = str1 + message;
			return str2;
		};
		System.out.println(person.say(" time is precious."));
	}
}

/*
O/P:
I would like to say, time is precious.
*/