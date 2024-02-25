class DataType {
    public static void main(String[] args) {
        // we can use hexadecimal, octal etc numbers in int.
        int hex = 0x01E;
        System.out.println(hex);    // 30

        // to count thousands, lakhs or crores we can use _ here
        int salaryPackage = 9_00_000;
        System.out.println(salaryPackage + " Annual salary.");  // 900000 Annual salary.

        // very big number such as 12 raise to 10
        double epsilonLargeNumber = 12e10;
        System.out.println(epsilonLargeNumber); // 1.2E11

        // increment char
        char c = 'a';
        c++;
        System.out.println(c); // b
    }    
}
