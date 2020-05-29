public class Borrow implements Runnable {

    private Library l;

    public Borrow(Library l) {
        this.l = l;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (l) {
                while (l.getStock() == 0) {

                    try {
                        System.out.println("暂时无书本可以借出");
                        l.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                l.setStock(l.getStock()-1);
                System.out.println("当前库存：" + l.getStock());
                l.notifyAll();
            }
        }
    }
}