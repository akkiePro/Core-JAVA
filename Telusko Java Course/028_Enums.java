enum Status {
    Running, Panding, Failed, Success;
}
class Enums {
    public static void main(String[] args) {
        Status stat = Status.Panding;
        System.out.println(stat);   // pending
        System.out.println(stat.ordinal()); // 1

        for (Status s : Status.values()) {
            System.out.println(s + " : " + s.ordinal());
        }
    }
}