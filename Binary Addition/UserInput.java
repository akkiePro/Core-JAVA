import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    static BigInteger num;
    public static BigInteger userInput() {
        Scanner sc = new Scanner(System.in);
        try{
            num = sc.nextBigInteger();
            num = checkForBinaryNumber(num);
        }catch (InputMismatchException inputMismatchException) {
            System.out.println("please enter valid choice...");
            userInput();
        }
        return num;
    }

    private static BigInteger checkForBinaryNumber(BigInteger num) {
        String no = String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < no.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(no.charAt(i)));
            if(digit >= 0 && digit <= 1){
                sb.append(no.charAt(i));
            }
            else
                throw new InputMismatchException();
        }
        return new BigInteger(String.valueOf(sb));
    }
}
