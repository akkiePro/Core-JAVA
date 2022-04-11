import java.util.*; 
import java.io.*;

class Main {

  public static String MathChallenge(int num1, int num2) {
    // code goes here  
    String x="false";
    if(num1==num2){
      return "-1";
    }
    else if(num1<num2){
      return "true";
    }
    return x;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    int num1=s.nextInt();
    int num2=s.nextInt();
    System.out.print(MathChallenge(num1, num2).toString()); 
  }

}