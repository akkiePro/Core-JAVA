import java.math.BigInteger;
import java.util.List;

public class BinaryAddition {
    static BigInteger result;
    public static BigInteger binaryAddition(BigInteger num1, BigInteger num2) {
        // reverse and format number by appending zero to smaller length
        List<String> formattedAndReversedNumbers = ReverseAndFormat.doReverseAndFormat(num1, num2);

        int carry = 0;
        int additionOfDigits = 0;
        String s1 = formattedAndReversedNumbers.get(0);
        String s2 = formattedAndReversedNumbers.get(1);
        StringBuilder addedDigits = new StringBuilder();
        for (int i=0; i<=s1.length(); i++) { //doesn't matter if you break loop at s2.length() bcz both are same
            if(i == s1.length())
                addedDigits.append(carry);
            else {
                int digitOfS1 = Integer.parseInt(String.valueOf(s1.charAt(i)));
                int digitOfS2 = Integer.parseInt(String.valueOf(s2.charAt(i)));

                if (carry == 0) {
                    additionOfDigits = digitOfS1 + digitOfS2;
                    switch (additionOfDigits) {
                        case 0:
                            carry = 0;
                            additionOfDigits = 0;
                            break;
                        case 1:
                            carry = 0;
                            additionOfDigits = 1;
                            break;
                        case 2:
                            carry = 1;
                            additionOfDigits = 0;
                            break;
                        default:
                            throw new RuntimeException();
                    }
                } else {
                    additionOfDigits = carry + digitOfS1 + digitOfS2;
                    switch (additionOfDigits) {
                        case 0:
                            carry = 0;
                            additionOfDigits = 0;
                            break;
                        case 1:
                            carry = 0;
                            additionOfDigits = 1;
                            break;
                        case 2:
                            carry = 1;
                            additionOfDigits = 0;
                            break;
                        case 3:
                            carry = 1;
                            additionOfDigits = 1;
                            break;
                        default:
                            throw new RuntimeException();
                    }
                }
                addedDigits.append(additionOfDigits);
            }
        }
        result = new BigInteger(addedDigits.reverse().toString());
        return result;
    }
}
