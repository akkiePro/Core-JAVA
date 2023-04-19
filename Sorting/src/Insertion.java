public class Insertion {
    /*{5, 3, 4, 22, 2, 1}
     * len=6
     *
     * i=1
     * j=0   key=3   3 5 4 22 2 1
     *
     * i=2
     * j=1   key=4   3 * 5 22 2 1
     * j=0   key=4   3 4 5 22 2 1
     *
     * i=3
     * j=2   key=22  3 4 5 22 2 1
     *
     * i=4
     * j=3   key=2   3 4 5 * 22 1
     * j=2   key=2   3 4 * 5 22 1
     * j=1   key=2   3 * 4 5 22 1
     * j=0   key=2   2 3 4 5 22 1
     * */
    public void insertionSort(int[] arr, int len) {
        System.out.println("Welcome to Insertion Sort...");
        for(int i=1; i<len; i++) {
            int j = i-1;
            int key = arr[i];
            while(j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println("Insertion Sort is completed...");
        Sort.printArray(arr);
    }
    /*{5, 3, 4, 22, 2, 1}
    * len=6
    *
    *
    *
    *
    * */
    public void recursiveInsertionSort(int[] arr, int len) {
        if(len == 1)
            return;
        // Sort first len-1 elements
        recursiveInsertionSort( arr, len-1 );
        int key = arr[len-1];
        int j = len-2;
        while (j >= 0 && arr[j] > key)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = key;
    }
}
