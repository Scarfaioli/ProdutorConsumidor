public class Consumidor implements Runnable{

    Noticia monitor;

    public Consumidor(Noticia monitor){
        this.monitor = monitor;
    }
    @Override
    public void run() {
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

}