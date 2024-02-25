class TypeConversion {
    public static void main(String[] args) {

        int a = 12;
        // byte b = a; // not allowed
        byte b = (byte) a; // Type casting to byte
        System.out.println(b);

        byte x = 127;
        int i = x;  // alowed direct casting in broad type
        x++;
        i++;
        System.out.println(x);  // -128 cz range of byte is from 2^-7 to 2^7 - 1 (-128 to 127)
        System.out.println(i);  // 128

        // auto promoting type cast
        byte value1 = 10;   // allowed bcz it's in range
        byte value2 = 30;   // allowed bcz it's in range
        System.out.println(value1 * value2);    // 10*30=300 not allowed byte but auto promoted to int
    }
}
