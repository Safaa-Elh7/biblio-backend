public class Livre extends Document {
    public int nbrePages;
    public Genre genre;
    public Livre(int id_Document, String title, String auteur, int anneePub,int nbrePages, Genre genre) {
        super(id_Document, title, auteur, anneePub);
        this.nbrePages = nbrePages;
        this.genre = genre;
    }
    @Override
    public String toString() {
        return super.toString() +"Livre{" + "nbrePages=" + nbrePages + '}';
    }
    @Override
    public void getTypeDocument() {
        System.out.println("Livre");
    }

}
