class ArrowSwitch {
    public static void main(String[] args) {
        String day = "Friday";
        // crazy arrow function removed break keyword
        /* switch(day) {
            case "Monday" -> System.out.println("Monday I hate you :(");
            case "Tuesday" -> System.out.println("Tuesday work");
            case "Wednesday" -> System.out.println("Wednesday work");
            case "Thursday" -> System.out.println("Thursday work");
            case "Friday" -> System.out.println("Friday yeah...");
            case "Saturday", "Sunday" -> System.out.println("Holidayyyyyy");
            default -> System.out.println("write properly.");
        } */

        // we can also use to return as following:
        String reaction = "";
        /* switch(day) {
            case "Monday" -> reaction = "Monday I hate you :(";
            case "Tuesday" -> reaction = "Tuesday work";
            case "Wednesday" -> reaction = "Wednesday work";
            case "Thursday" -> reaction = "Thursday work";
            case "Friday" -> reaction = "Friday yeah...";
            case "Saturday", "Sunday" -> reaction = "Holidayyyyyy";
            default -> reaction = "write properly.";
        }
        System.out.println(reaction); */
        
        // let's simplify this
        /* reaction = switch(day) {
            case "Monday" -> "Monday I hate you :(";
            case "Tuesday" -> "Tuesday work";
            case "Wednesday" -> "Wednesday work";
            case "Thursday" -> "Thursday work";
            case "Friday" -> "Friday yeah...";
            case "Saturday", "Sunday" -> "Holidayyyyyy";
            default -> "write properly.";
        };
        System.out.println(reaction); */
        
        // if you want to use colon(:) and don't want to use break yiefld can be a better option
        reaction = switch(day) {
            case "Monday" : yield "Monday I hate you :(";
            case "Tuesday" : yield "Tuesday work";
            case "Wednesday" : yield "Wednesday work";
            case "Thursday" : yield "Thursday work";
            case "Friday" : yield "Friday yeah...";
            case "Saturday", "Sunday" : yield "Holidayyyyyy";
            default : yield "write properly.";
        };
        System.out.println(reaction);
    }
}
