class OuterClass {
    int age;
    public void show() {
        System.out.println("in show");
    }
    class InnerClass {
        public void config() {
            System.out.println("in config");
        }
    }
}

class InnerClassDemo {
    public static void main(String[] args) {
        OuterClass obj1 = new OuterClass();
        obj1.show();    // in show

        OuterClass.InnerClass obj2 = obj1.new InnerClass();
        obj2.config();  // in config 
    }
}