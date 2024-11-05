<?php
class Document {
    public $titre;
    public $auteur;
    public $datePublication;
    public $disponible;

    // Constructeur
    public function __construct($titre, $auteur, $datePublication, $disponible) {
        $this->titre = $titre;
        $this->auteur = $auteur;
        $this->datePublication = $datePublication;
        $this->disponible = $disponible;
    }

    public function getTitre() {
        return $this->titre;
    }

    public function getAuteur() {
        return $this->auteur;
    }

    public function getDatePublication() {
        return $this->datePublication;
    }

    public function getDisponible() {
        return $this->disponible;
    }

    public function emprunt() {
        if ($this->disponible) {
            $this->disponible = false;
            echo "Le document a été emprunté.\n";
        } else {
            echo "Le document est déjà emprunté.\n";
        }
    }

    public function rendu() {
        if (!$this->disponible) {
            $this->disponible = true;
            echo "Le document a été rendu.\n";
        } else {
            echo "Vous ne pouvez pas rendre un document déjà disponible.\n";
        }
    }

    public function dispo() {
        if ($this->disponible) {
            echo "Le document est disponible.\n";
        } else {
            echo "Le document n'est pas disponible.\n";
        }
    }
}

class Livre extends Document {
    public $nbPages;

    public function __construct($titre, $auteur, $nbPages, $datePublication, $disponible) {
        parent::__construct($titre, $auteur, $datePublication, $disponible);
        $this->nbPages = $nbPages;
    }

    // Accesseur
    public function getNbPages(){
        return $this->nbPages;
    }
}

// Exemple d'utilisation
$livre = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", 96, "1943-04-06", true);
$livre->dispo(); 
$livre->emprunt(); 
$livre->dispo(); 
$livre->rendu(); 
$livre->dispo();
?>