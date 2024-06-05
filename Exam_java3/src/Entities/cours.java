
// Classe pour représenter un cours
class Cours {
    private int id;
    private LocalDate date;
    private LocalTime heureDebut;
    private LocalTime heureFin;
    private Professeur professeur;
    private Module module;

    public Cours(int id, LocalDate date, LocalTime heureDebut, LocalTime heureFin, Professeur professeur, Module module) {
        this.id = id;
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.professeur = professeur;
        this.module = module;
    }

    public Cours(LocalDate date, LocalTime heureDebut, LocalTime heureFin, Professeur professeur, Module module) {
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.professeur = professeur;
        this.module = module;
    }

    // ... (getters, setters et autres méthodes)
}
