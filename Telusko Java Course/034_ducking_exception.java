import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// custom exception
class DivisorZeroException extends ArithmeticException {
    public DivisorZeroException(String errorMessage) {
        super(errorMessage);
    }
}

class Summation {
    public int sum(List<Integer> args) {
        int result = 0;
        for (int i : args) {
            result += i;
        }
        return result;
    }
}

class Divide {
    public double division(int dividend, int divisor) {
        if (divisor == 0) {
            throw new DivisorZeroException("Divisor is Zero");
        }
        return (double) dividend / divisor;
    }
}

class Service {
    public double findMedian(List<Integer> nums) throws DivisorZeroException {     // ducked down by using throws so that findMedian don't need to worry about divide by zero situation 
        double finalResult = 0;
        int sum = new Summation().sum(nums);
        finalResult = new Divide().division(sum, nums.size());
        return finalResult;
    }
}

class DuckingException {
    public static void main(String[] args) throws IOException {
        // int num1 = 15, num2 = 3, num3 = 5;
        int i = 0;
        String input;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inputStreamReader);  // primitive method(brfore Scanner class(java 1.5)) of taking user input from java
        List<Integer> nums = new ArrayList<>();
        System.out.println("press ok when you're done with enerting values...");
        do{
            System.out.println("enter value " + (i+1) + ":");
            input = br.readLine();  // can throw IOException
            if(!input.equals("ok")){
                nums.add(Integer.parseInt(input));
                i++;
            }
        }while (!input.equals("ok"));
        try {
            System.out.println(new Service().findMedian(nums));
        } catch (DivisorZeroException dze) {
            System.out.println(dze);
        } finally {
            br.close();
        }
    }
}