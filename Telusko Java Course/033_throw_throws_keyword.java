class DivisorZeroException extends RuntimeException {
    public DivisorZeroException(String errorMessage) {
        super(errorMessage);
    }
}

class Divide {
    public double division(int dividend, int divisor) throws DivisorZeroException {
        if (divisor == 0) {
            throw new DivisorZeroException("Divisor is Zero");
        }
        return dividend / divisor;
    }
}

class ThrowDemo {
    public static void main(String[] args) {
        int num1 = 15, num2 = 3;
        Divide obj = new Divide();
        try {
            System.out.println("result = " + obj.division(num1, num2));
        } catch (DivisorZeroException e) {
            System.out.println(e);
        }
    }
}