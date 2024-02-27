import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CollectionsSort {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };
        List<Integer> nums = new ArrayList<>();
        nums.add(21);
        nums.add(33);
        nums.add(43);
        nums.add(16);
        nums.add(95);
        
        // Collections.sort(nums);
        Collections.sort(nums, comparator); // sorting based on last digit

        System.out.println(nums);   // [21, 43, 33, 95, 16]
    }
}