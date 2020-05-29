public class Test {
    public static void main(String[] args) {
        Library l = new Library();
        Borrow b = new Borrow(l);
        Return r =new Return(l);

        Thread t1 = new Thread(b);
        Thread t2 = new Thread(r);


        t1.start();
        t2.start();
    }

}
