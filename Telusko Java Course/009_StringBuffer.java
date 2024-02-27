class StringBufferDemo {
    // StringBuffer and StringBuilder are mutable class for String
    // StringBuffer is Thread Safe.
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb);     // 
        System.out.println(sb.capacity());  // 16
        System.out.println(sb.length());    // 0
        
        StringBuffer sb1 = new StringBuffer("Akash");
        System.out.println(sb1);    // Akash
        System.out.println(sb1.capacity()); // 21
        System.out.println(sb1.length());   // 5

        StringBuffer sb2 = new StringBuffer("Akash");
        System.out.println(sb1 == sb2);     // false. that means new keyword created another object in heap.
        System.out.println(sb1.hashCode()); // 918221580
        System.out.println(sb2.hashCode()); // 2055281021
    }
}