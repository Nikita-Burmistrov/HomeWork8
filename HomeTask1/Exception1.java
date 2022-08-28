package HomeTask1;

public class Exception1 {
     static void MbTrouble(int a,int b) {
        if (b == 0) {
            throw new ArithmeticException("Здесь нельзя делить на ноль!");
        }
        int oof = a / b;
        System.out.println(oof);
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        WillBeTrouble();
    }

    private static void WillBeTrouble() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
