class StringDemo {
    // every string stores inside String Constant Pool
    public static void main(String[] args) {
        String s = "Hello String";
        String s1 = new String("Hello again String");
        // s and s1 both are same first one is shorthand method to initialize String

        String name = "Akash";
        System.out.println(name);
        // System.out.println(name.hashCode());

        String member = "Akash";
        System.out.println(member);

        System.out.println(name == member);     // there's only one "Akash" which is referenced by member and name.
        System.out.println(name.hashCode());    // 63313388
        System.out.println(member.hashCode());  // 63313388

        String name2 = "akash";
        name2 = name2 + " prajapati";
        System.out.println(name2);  // akash prajapati
        // after watching 008_String_Heap_Updated.png you realise that String is immutable. because, it creates new heap storage location for updated string
    }
}
