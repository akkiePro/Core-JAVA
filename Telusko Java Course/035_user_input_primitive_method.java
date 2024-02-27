import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class UserInput {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inputStreamReader);
        System.out.println("Enter num1: ");
        int num1 = Integer.parseInt(br.readLine());
        System.out.println("Enter num2: ");
        int num2 = Integer.parseInt(br.readLine());

        System.out.println("sum = " + (num1 + num2));

        br.close();
    }
}