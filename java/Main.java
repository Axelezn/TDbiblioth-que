public class Main {
    public static void main(String[] args) {
        // Création des docs
        DVD dvd1 = new DVD("Je m'appelle teuse", "Pouet", 2024, 90, true);
        Livre livre1 = new Livre("et moi sonneuse", "Pouet2", 100, 2024, true);
        revue revue1 = new revue("et toi ture", "Pouet3", 2024, 1, 1, true);

        // Affichage de la disponibilité
        System.out.println("DVD disponible: " + dvd1.estDisponible());
        System.out.println("Livre disponible: " + livre1.estDisponible());
        System.out.println("Revue disponible: " + revue1.estDisponible());

        emprunterDocument(dvd1);
        emprunterDocument(livre1);
        emprunterDocument(revue1);

        // Dispo après emprunt
        System.out.println("Après emprunt:");
        System.out.println("DVD disponible: " + dvd1.estDisponible());
        System.out.println("Livre disponible: " + livre1.estDisponible());
        System.out.println("Revue disponible: " + revue1.estDisponible());

        // Rendre
        rendreDocument(dvd1);
        rendreDocument(livre1);
        rendreDocument(revue1);

        // Vérifier la disponibilité après retour
        System.out.println("Après retour:");
        System.out.println("DVD disponible: " + dvd1.estDisponible());
        System.out.println("Livre disponible: " + livre1.estDisponible());
        System.out.println("Revue disponible: " + revue1.estDisponible());
    }

    public static void emprunterDocument(Document document) {
        if (document.disponible) {
            document.disponible = false; // Marquer comme non disponible
            System.out.println("Emprunté: " + document.titre);
        } else {
            System.out.println("Le document " + document.titre + " n'est pas disponible.");
        }
    }

    public static void rendreDocument(Document document) {
        document.disponible = true; 
        System.out.println("Rendu: " + document.titre);
    }
}