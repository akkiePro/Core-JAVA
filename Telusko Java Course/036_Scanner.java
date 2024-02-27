import java.util.Scanner;

class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value 1");
        int num1 = sc.nextInt();
        
        System.out.println("Enter value 2");
        int num2 = sc.nextInt();

        System.out.println("addition = " + (num1 + num2));
    }
}
