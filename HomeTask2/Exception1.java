package HomeTask2;

public class Exception1 {
    public Lol lul;

    public void foo() {
        try {
            lul.show();
            System.out.println(100 / 0);
        } catch (NullPointerException  | ArithmeticException e ) {
            e.printStackTrace();
        }finally {
            System.out.println("Конец для foo!");
        }
    }
}
