public class Main{
    public static void main(String[] args) {
        int m = 10, p = 10, c = 10;
        NoticiaMonitor monitorNoticias = new NoticiaMonitor(m, p, c);
        Thread[] consumidores = new Thread[c];
        Thread[] produtores = new Thread[p];
        for (int i = 0; i < produtores.length; i++) {
            produtores[i] = new Thread(new Produtor(monitorNoticias), ""+i);
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