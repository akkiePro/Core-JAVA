//Input : "This is the example of string" Output : "sihT si eht elpmaxe fo gnirts"
//sanjay@softvan.in
import java.util.*;
class Test{
	public static void main(String[] args) {
		String[] ip = "This is the example of string".split(" ");
		String rev = "";
		Test obj = new Test();
		obj.rev(ip, rev);
	}
	public void rev(String[] ip, String rev){
		for(int i=0; i<ip.length; i++){
			String word = ip[i];
			String reverse = "";
			for(int j=word.length()-1; j>=0; j--){
				reverse = reverse + word.charAt(j);
			}
			rev = rev + reverse + " ";
		}
		System.out.println("reverse = "+rev);
	}
}