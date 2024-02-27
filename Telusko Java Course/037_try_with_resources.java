import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Demo 1. finally{} for closing resources
/* class TryWithResource {
    public static void main(String[] args) throws NumberFormatException, IOException {
        InputStreamReader inputStreamReader = null;
        BufferedReader br = null;
        try {
            inputStreamReader = new InputStreamReader(System.in);
            br = new BufferedReader(inputStreamReader);
            System.out.println("Enter num1: ");
            int num1 = Integer.parseInt(br.readLine());
            System.out.println("Enter num2: ");
            int num2 = Integer.parseInt(br.readLine());

            System.out.println("sum = " + (num1 + num2));

        } finally {
            br.close();
        }
    }
}
*/

// Demo 2. try with resource
class TryWithResource {
    public static void main(String[] args) throws NumberFormatException, IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter num1: ");
            int num1 = Integer.parseInt(br.readLine());
            System.out.println("Enter num2: ");
            int num2 = Integer.parseInt(br.readLine());

            System.out.println("sum = " + (num1 + num2));
        }
    }
}
/** 
 * try with resource is used to close resources.
 * where, even finally{} is not required.
 * automatically closes the opened resources.
 */
