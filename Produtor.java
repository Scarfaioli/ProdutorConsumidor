public class Produtor implements Runnable{

    NoticiaMonitor monitor;

    public Produtor(NoticiaMonitor monitor){
        this.monitor = monitor;
    }

    @Override
    public void run() {
        while (true) monitor.publica(Integer.parseInt(Thread.currentThread().getName()), "null");
    }
    
}
