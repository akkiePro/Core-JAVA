import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class ReverseAndFormat {

    public static List<String> doReverseAndFormat(BigInteger num1, BigInteger num2){
        // reverse number...
        String s1 = numberReverse(num1);
        String s2 = numberReverse(num2);

        // format number... appending zeros if length is smaller
        List<String> formattedAndReversedNumbers = numberFormat(s1, s2);

        return formattedAndReversedNumbers;
    }

    public static String numberReverse(BigInteger num) {
        String s = num.toString();
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static List<String> numberFormat(String s1, String s2) {
        List<String> formattedNumbers = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int counter = 1;
        while(!(s1.length() == s2.length())) {
            if (s1.length() > s2.length()) {
                if(counter == 1) {
                    sb.append(s2);
                    counter++;
                }
                sb.append("0");
                s2 = String.valueOf(sb);
            }
            else {
                if(counter == 1) {
                    sb.append(s1);
                    counter++;
                }
                sb.append("0");
                s1 = String.valueOf(sb);
            }
        }
        formattedNumbers.add(0, s1);
        formattedNumbers.add(1, s2);
        return formattedNumbers;
    }

}
