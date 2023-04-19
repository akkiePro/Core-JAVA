import java.util.Scanner;
import java.util.Arrays;
class Sort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 22, 2, 1};
//        int[] arr = {6, 5, 4, 3, 2, 1};
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        int[] arr = {1};
        int len = arr.length;

        System.out.println("before sorting...");
        Sort obj = new Sort();
        obj.printArray(arr);

        Scanner usrIp = new Scanner(System.in);
        System.out.println("please select an algo...");
        System.out.println("1. Insertion Sort");
        System.out.println("2. Bubble Sort");
        System.out.println("3. Optimised Bubble Sort");
        System.out.println("4. Recursive Bubble Sort");
        System.out.println("5. Recursive Insertion Sort");
        System.out.println("6. Selection Sort");
        System.out.println("7. Recursive Selection Sort");
        String selectedAlgo = usrIp.nextLine();
        switch(selectedAlgo) {
            case "1":
                Insertion insertion = new Insertion();
                insertion.insertionSort(arr, len);
                break;
            case "2":
                Bubble bubble = new Bubble();
                bubble.bubbleSort(arr, len);
                break;
            case "3":
                Bubble optimised = new Bubble();
                optimised.optimisedBubbleSort(arr, len);
                break;
            case "4":
                Bubble recursive = new Bubble();
                recursive.recursiveBubbleSort(arr, len);
                System.out.println("Welcome to Optimised Recursive Bubble Sort...");
                System.out.println(Arrays.toString(arr));
                break;
            case "5":
                Insertion recursiveInsertion = new Insertion();
                recursiveInsertion.recursiveInsertionSort(arr, len);
                System.out.println("Welcome to Recursive Insertion Sort...");
                System.out.println(Arrays.toString(arr));
                break;
            case "6":
                Selection selection = new Selection();
                selection.selectionSort(arr, len);
                break;
            case "7":
                Selection recursiveSelection = new Selection();
                recursiveSelection.recursiveSelectionSort(arr, len, len);
                System.out.println("Welcome to Recursive Selection Sort...");
                System.out.println(Arrays.toString(arr));
                break;
            default:
                System.out.println("enter valid choice...");
                break;
        }
    }

    public static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

}