import javafx.scene.paint.Stop;

public class Return implements Runnable{

    Library l = new Library();

    public Return(Library l) {
        this.l = l;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (l) {
                while (l.getStock() == l.getLimit()) {

                    try {
                        System.out.println("无需还书");
                        l.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                l.setStock(l.getStock()+1);
                l.notifyAll();
            }
        }
    }
}