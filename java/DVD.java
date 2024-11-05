public class DVD extends Document {
    public int duree;
    
    //Constructeur
    public DVD(String titre, String auteur, int datePublication, int duree, boolean disponible) {
        super(titre, auteur, datePublication, disponible);
        this.duree = duree;
    }
    //Accesseurs
    public int getDuree() {
        return duree;
    }
}
