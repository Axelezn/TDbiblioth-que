class Document : 
    def __init__(self, titre, auteur, date_publication):
        self.titre = titre
        self.auteur = auteur
        self.date_publication =  date_publication
        self.disponible = True

        def get_titre(self) :
            return self.titre
        def get_auteur(self) :
            return self.auteur
        def get_date_publication(self) :
            return self.date_publication
        def get_disponible(self) :
            return self.disponible
        

class Livre(Document):
    def __init__(self, titre, auteur, date_publication, nb_pages):
        super().__init__(titre, auteur, date_publication)
        self.nb_pages = nb_pages
    
    def get_nbpages(self) : 
        return self.nb_pages

class Dvd(Document):
    def __init__(self, titre,auteur,date_publication,duree):
        super().__init__(titre,auteur,date_publication)
        self.duree = duree
    
    def get_duree(self):
        return self.nb_pages

class revue(Document):
    def __init__(self, titre,auteur,date_publication, numero_volume,numero):
        super().__init__(titre,auteur,date_publication)
        self.numero_volume = numero_volume
        self.numero = numero
    
    def  get_numero_volume(self):
        return self.numero_volume
    
    def get_numero(self):
        return self.numero



#Utilisation : 
LeLivre= Livre("Ma vie", "Axel Eouzan", '2020',300)
Ledvd= Dvd("Ma vie","Axel Eouzan","2020",148)
Larevue = revue("Ma vie", "Axel Eouzan",2020,5,3)

print(LeLivre.get_disponible())
Ledvd.dispo()
Larevue.dispo()

print(LeLivre.emprunt())
print(Ledvd.emprunt())
print(Larevue.emprunt())

print(LeLivre.rendu())
print(Ledvd.rendu())
Larevue.rendu()

print(LeLivre.dispo())
print(Ledvd.dispo())
print(Larevue.dispo())