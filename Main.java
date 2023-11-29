public class Main{
    public static void main(String[] args) {
        int m = 10, n = 10;
        Noticia monitorNoticias = new Noticia(10);
        Thread[] consumidores = new Thread[m];
        Thread[] produtores = new Thread[n];
        for (int i = 0; i < produtores.length; i++) {
            produtores[i] = new Thread(new Produtor(monitorNoticias));
            produtores[i].start();
        }
        for (int i = 0; i < consumidores.length; i++) {
            consumidores[i] = new Thread(new Consumidor(monitorNoticias));
            consumidores[i].start();
        }
        long t1 = System.currentTimeMillis();
        while (true) if(System.currentTimeMillis() - t1 == 15000) break;

        
    }
}