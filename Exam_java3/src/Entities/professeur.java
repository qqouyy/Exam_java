// Classe pour représenter un professeur
class Professeur {
    private int id;
    private String nom;
    private String prenom;
    private String telephone;

    public Professeur(int id, String nom, String prenom, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
    }

    public Professeur(String nom, String prenom, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
    }

    // ... (getters, setters et autres méthodes)
}
