public class revue extends Document {
    public int numeroVolume;
    public int numero;
    //Constructeur
    public revue(String titre, String auteur, int datePublication, int numeroVolume, int numero, boolean disponible) {
        super(titre, auteur, datePublication, disponible);
        this.numeroVolume = numeroVolume;
        this.numero = numero;
        }
    //Accesseurs
    public int getNumeroVolume() {
        return numeroVolume;
    }
    public int getNumero(){
        return numero;
    }
}
