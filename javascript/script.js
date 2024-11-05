class Document  {
    #titre;
    #auteur;
    #datePublication;
    #clientID;
    #disponible = true;

    constructor(titre,auteur,datePublication) {
        this.#titre = titre;
        this.#auteur = auteur;
        this.#datePublication = datePublication;
    }
    get titre() {
        return this.#titre;
        }
    get  auteur() {
        return this.#auteur;
    }
    get datePublication() {
        return this.#datePublication;
        }
    set  titre(titre) {
        this.#titre = titre;
        }
    set  auteur(auteur) {
        this.#auteur = auteur
        }
    set datePublication(datePublication) {
        this.#datePublication = datePublication;
        }
    get  disponible() {
        return this.#disponible;
        }
    emprunt(clientID) {
        this.#clientID = clientID;
        if  (this.#disponible) {
            this.#disponible = false;
            console.log(`${this.#titre}  a été emprunté par ${clientID}`);
        } else {
            throw new error ("Le document est deja emprunté");
        }
    }
    rendu() {
        this.#disponible = true;
        console.log(`${this.#titre}  a été rendu`);
    }
    estDisponible() {
        if  (this.#disponible) {
            return true
    } else {
        return False
    }
}
}

class Livre extends Document  {
    #nbPages;
    constructor(titre,auteur,datePublication,nbPages) {
        super(titre,auteur,datePublication);
        this.#nbPages = nbPages;
    }
}

class DVD extends Document   {
    #duree;
    constructor(titre,auteur,datePublication,duree) {
        super(titre,auteur,datePublication);
        this.#duree = duree;
        }
}
class Revue extends Document {
    #numeroVolume;
    #numero;
    constructor(titre,auteur,datePublication,numeroVolume,numero) {
        super(titre,auteur,datePublication);
        this.#numeroVolume = numeroVolume;
        this.#numero = numero;
    }
}

// Programme principal
const livre = new Livre("Coder en JavaScript pour les Nuls", "La Manu","2024","500")
const dvd = new DVD("La Philosophie avec un Canard", "La Manu","2024","400")
livre.estDisponible()
livre.emprunt("Client1")
dvd.emprunt("Paul")
livre.rendu()
