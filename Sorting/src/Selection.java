public class Selection {
    /*{5, 3, 4, 22, 2, 1}
    * s=5
    * i=0
    * j=0   s=3
    * j=1   s=3
    * j=2   s=3
    * j=3   s=2
    * j=4   s=1
    * */
    public void selectionSort(int[] arr, int len) {
        System.out.println("Welcome to Selection Sort...");
        for (int i=0; i<len-1; i++) {
            int smallestIndex = i;
            for (int j=i; j<len-1; j++) {
                if (arr[smallestIndex] > arr[j+1]) {
                    smallestIndex = j+1;
                }
            }
            int temp = arr[smallestIndex];
            arr[smallestIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Selection Sort is completed...");
        Sort.printArray(arr);
    }
    public void recursiveSelectionSort(int[] arr, int len, int len2) {
        if(len == 1)
            return;
        recursiveSelectionSort(arr, len-1, len2);
        int smallestIndex = len-2;
        for (int i=len-2; i<len2-1; i++) {
            if (arr[smallestIndex] > arr[i+1]) {
                smallestIndex = i+1;
            }
        }
        int temp = arr[smallestIndex];
        arr[smallestIndex] = arr[len-2];
        arr[len-2] = temp;
    }
}
