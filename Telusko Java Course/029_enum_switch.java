enum Status {
    Running, Panding, Failed, Success;
}
class EnumsSwitch {
    public static void main(String[] args) {
        Status stat = Status.Panding;
        
        switch (stat) {
            case Running -> System.out.println("All good.");
            case Panding -> System.out.println("Please wait...");
            case Failed -> System.out.println("Failed.");
            default -> System.out.println("Success.");
        }
    }
}