public class Consumidor implements Runnable{

    NoticiaMonitor monitor;

    public Consumidor(NoticiaMonitor monitor){
        this.monitor = monitor;
    }

    @Override
    public void run() {
        while (true) monitor.consome(Integer.parseInt(Thread.currentThread().getName()));
    }

}