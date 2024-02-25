class Calculator {
    int num = 5;
    public int add(int n1, int n2) {
        System.out.println(num);
        return n1 + n2;
    }
}
class StackAndHeap {
    public static void main(String[] args) {
        int data = 10;
        Calculator obj = new Calculator();
        obj.num = 8;
        int r1 = obj.add(5, 4);
        System.out.println(r1);
        Calculator obj1 = new Calculator();
        obj1.add(3, 2);
    }
}
