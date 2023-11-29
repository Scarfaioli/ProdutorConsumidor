public class NoticiaMonitor {
    
    private int[] monitora;
    private int count = 0;
    private int[] publicou;
    private int[] consumiu;
    
    public NoticiaMonitor(int nMonit, int nProd, int nCons) {
        this.monitora = new int[nMonit];
        this.publicou = new int[nProd];
        this.consumiu = new int[nCons];
    }

    public synchronized void publica(int id, String texto){

    }

    public synchronized void consome(int id){

    }
}
