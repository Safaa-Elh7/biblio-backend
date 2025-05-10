public class Magazine extends Document {
    public String FrequencePub;
    public Magazine(int id_Document, String title, String auteur, int anneePub,String FrequencePub) {
        super(id_Document, title, auteur, anneePub);
        this.FrequencePub = FrequencePub;
    }
    @Override
    public String toString() {
        return super.toString() +"Magazine [FrequencePub=" + FrequencePub + "]";
    }
    @Override
    public void getTypeDocument() {
        System.out.println("Magazine");
    }

}
