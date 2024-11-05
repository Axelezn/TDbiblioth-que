public class Document {
    public String titre;
    public String auteur;
    public int datePublication;
    public boolean disponible;

    // Constructeur pour initialiser le document
    public Document(String titre, String auteur, int datePublication, boolean disponible) {
        this.titre = titre;
        this.auteur = auteur;
        this.datePublication = datePublication;
        this.disponible = true;
    }
    //Accesseurs (getters) & Setters
    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getAuteur() {
        return auteur;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public int getDatePublication() {
        return datePublication;
    }
    // Méthodes
    public void emprunt() {
        disponible = false; 
    }
    public void retour() {
        disponible = true;
    }
    public boolean estDisponible() {
        return disponible;
    }
}

