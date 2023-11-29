public class Noticia {
    boolean wasSold = false;
    int id;
    String owner;
    final String produtor;
    String text="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor"+
     "incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation"+
     "ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit"+
     "in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat"+
     "cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    
    public Noticia(int id, String produtor) {
        this.id = id;
        this.produtor = produtor;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
     
}
