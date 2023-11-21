import java.util.List;

public class Produtor implements Runnable{

    Noticia[] noticias;
    Produtor(Noticia[] noticias){
        this.noticias=noticias;
    }

    @Override
    public void run() {
        Noticia n = new Noticia(0, Thread.currentThread().getName());
        publicarNoticia(noticias, n);
    }

    private synchronized void publicarNoticia(Noticia[] noticias2, Noticia n) {
    }
    
}
