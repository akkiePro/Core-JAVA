
public class Practical2
{
   public void pattern(){
       int pass=5;
       int i;
       for (i=0;i<=pass;i++){
           switch (i){
                case 1:
                    System.out.println("        1");
                    break;
                case 2:
                    System.out.println("      2 2");
                    break;
                case 3:
                    System.out.println("    1 2 3");
                    break;
                case 4:
                    System.out.println("  4 4 4 4");
                    break;
                case 5:
                    System.out.println("1 2 3 4 5");
                    break;
           }
       }
   }
   public static void main(String[] args) 
   {
	Practical2 obj = new Practical2();
	obj.pattern();
   }
}