class OuterClass {
    int age;
    public void show() {
        System.out.println("in show");
    }
    static class InnerClass {
        public void config() {
            System.out.println("in config");
        }
    }
    // Note: You can make only inner class as static.
}

class StaticClassDemo {
    public static void main(String[] args) {
        OuterClass obj1 = new OuterClass();
        obj1.show();    // in show

        // OuterClass.InnerClass obj2 = obj1.new InnerClass();
        OuterClass.InnerClass obj2 = new OuterClass.InnerClass();   // another approach
        obj2.config();  // in config 
    }
}