import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Task: sort Strings based on their length.
class Exercise1 {
    public static void main(String[] args) {
        Comparator<String> comp = new Comparator<String>() {
            public int compare(String i, String j) {
                if(i.length() > j.length())
                    return 1;
                else
                    return -1;
            }
        };

        List<String> vaakya = new ArrayList<>();
        vaakya.add("Bhagvati");
        vaakya.add("Akash");
        vaakya.add("Trilochan");
        vaakya.add("Shruti");
        vaakya.add("null");

        Collections.sort(vaakya, comp);

        System.out.println(vaakya);
    }
}
