class WrapperDemo {
    public static void main(String[] args) {
        // initialization
        int num = 20;
        // one way
        Integer wNum = new Integer(21);
        // another way
        Integer wNum2 = 22;

        // Autoboxing and Auto-Unboxing
        int x = 23;
        Integer y = x;  // Autoboxing
        int z = y;  // Auto-unboxing

        String a = "24";
        int b = Integer.parseInt(a);
        System.out.println(b*3);    // 72
    }
}