public class Bubble {
    /*5 3 4 22 2 1
    l = 6

    i=5
    j=4
    3 5 4 22 2 1
    3 4 5 22 2 1
    3 4 5 2 22 1
    3 4 5 2 1 22
    i=4
    j=3
    3 4 5 2 1 22
    3 4 5 2 1 22
    3 4 2 5 1 22
    3 4 2 1 5 22
    i=3
    j=2
    3 4 2 1 5 22
    3 2 4 1 5 22
    3 2 1 4 5 22*/
    public void bubbleSort(int[] arr){
        System.out.println("Welcome to Bubble Sort...");
        int len = arr.length;
        for (int i=len-1; i>0; i--) {
            for (int j=0; j<i; j++) {
                if (arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Bubble Sort is completed...");
        Sort.printArray(arr);
    }

    /*1 2 3 4 5 6
    l = 6

    i=5
    j=0
    swap=f
    j=0 1 2 3 4 5 6
    j=1 1 2 3 4 5 6
    j=2 1 2 3 4 5 6
    j=3 1 2 3 4 5 6
    j=4 1 2 3 4 5 6
    */
    public void optimisedBubbleSort(int[] arr) {
        System.out.println("Welcome to Optimised Bubble Sort...");
        int len = arr.length;
        boolean swapped;
        for (int i=len-1; i>0; i--) {
            swapped = false;
            for (int j=0; j<i; j++) {
                if (arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false)
                break;
        }
        System.out.println("Optimised Bubble Sort is completed...");
        Sort.printArray(arr);
    }

    public void recursiveBubbleSort(int arr[], int n)
    {
        // Base case
        if (n == 1)
            return;

        int count = 0;
        // One pass of bubble sort. After
        // this pass, the largest element
        // is moved (or bubbled) to end.
        for (int i=0; i<n-1; i++) {
            if (arr[i] > arr[i + 1]) {
                // swap arr[i], arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count = count + 1;
            }
        }
        // Check if any recursion happens or not
        // If any recursion is not happen then return
        if (count == 0)
            return;

        // Largest element is fixed,
        // recur for remaining array
        recursiveBubbleSort(arr, n-1);
    }
}
