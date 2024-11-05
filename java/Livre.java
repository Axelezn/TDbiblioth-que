public class Livre extends Document {
    public int nbPages;

    //Constructeur
    public Livre(String titre,  String auteur, int nbPages, int datePublication, boolean disponible){
        super(titre, auteur, datePublication, disponible);
        this.nbPages = nbPages;
    }
    //Accesseurs
    public int getNbpages() {
        return nbPages;
    }
}