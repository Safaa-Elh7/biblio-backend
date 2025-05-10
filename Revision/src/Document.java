public abstract class  Document {
    private int id_Document;
    private String title;
    private String auteur;
    private int anneePub;
    public Document(int id_Document, String title, String auteur, int anneePub) {
        this.id_Document = id_Document;
        this.title = title;
        this.auteur = auteur;
        this.anneePub = anneePub;
    }
    @Override
    public String toString() {
        return title + "\t" + auteur + "\t" + anneePub + "\t" + id_Document;
    }
    public abstract void getTypeDocument();
}
