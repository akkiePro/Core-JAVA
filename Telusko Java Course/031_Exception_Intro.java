class ExceptionDemo {
    public static void main(String[] args) {
        int a = 15;
        int b = 0;
        double c = 0;
        String s = null;
        try {
            c = a / b; // critical statement. surround it by try/catch.
            System.out.println(c);
            System.out.println(s.length());
        } catch (ArithmeticException ae) {
            System.out.println("Attempted to divide by zero.");
            // ae.printStackTrace();   // to print stacktrace
        } catch (NullPointerException ne) {
            System.out.println("operation on null value...");
            // ne.printStackTrace();
        } catch (Exception e) {
            System.out.println("something went wrong...");
            e.printStackTrace();
        } finally { // used to close resource or connections.
            System.out.println(c);
        }
    }
}