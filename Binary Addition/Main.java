import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter your first binary number : ");
        BigInteger num1 = UserInput.userInput();
        System.out.println("enter your second binary number : ");
        BigInteger num2 = UserInput.userInput();
        BigInteger result = BinaryAddition.binaryAddition(num1, num2);
        System.out.println("result = " + result);
    }
}