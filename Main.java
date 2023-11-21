public class Main{
    public static void main(String[] args) {
        int n=1, m=1;
        Noticia[] noticias = new Noticia[10];
        Thread[] produtores = new Thread[n];
        Thread[] consumidores = new Thread[m];
        for (int i = 0; i < consumidores.length; i++) {
            Consumidor consumidor = new Consumidor(noticias);
            consumidores[i] = new Thread(consumidor, "Consumidor "+i);
        }
        for (int i = 0; i < produtores.length; i++) {
            Produtor produtor = new Produtor(noticias);
            consumidores[i] = new Thread(produtor, "Produtor "+i);
        }

    }
}