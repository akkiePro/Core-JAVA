// without lambda
/*
interface Drawable{  
    public void draw();  
}  
public class LambdaExpressionExample {  
    public static void main(String[] args) {  
        int width=10;  
  
        //without lambda, Drawable implementation using anonymous class  
        Drawable d=new Drawable(){  
            public void draw(){System.out.println("Drawing "+width);}  
        };  
        d.draw();  
    }  
}  
*/


//with lambda
@FunctionalInterface    // it's optional
interface Drawable{
    void draw();
}
public class LambdaExpressionExample{
    public static void main(String[] args) {
        int width = 10;

        Drawable d = () -> {
            System.out.println("Drawing "+width);
        };
        d.draw();
    }
}
/*
O/P:
Drawing 10
*/