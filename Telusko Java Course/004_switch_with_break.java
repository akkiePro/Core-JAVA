// boring switch with break statement
class Switch {
    public static void main(String[] args) {
        String day = "Friday";
        switch(day) {
            case "Monday":
                System.out.println("Monday work");
                break;
            case "Tuesday":
                System.out.println("Tuesday work");
                break;
            case "Wednesday":
                System.out.println("Wednesday work");
                break;
            case "Thursday":
                System.out.println("Thursday work");
                break;
            case "Friday":
                System.out.println("Friday work");
                break;
            /* case "Saturday":
            case "Sunday": */
            case "Saturday", "Sunday":
                System.out.println("Holidayyyyyy");
                break;
            default:
                System.out.println("write properly.");

        }
        
    }
}
