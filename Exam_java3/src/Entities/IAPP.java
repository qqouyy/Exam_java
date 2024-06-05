package Entities;

import java.util.ArrayList;
import java.util.List;
// Interface pour interagir avec l'utilisateur
interface IApplication {
    void ajouterModule();
    void afficherModules(); // Changement "listerModules" en "afficherModules" pour plus de clarté
    void creerCours();
    void afficherTousCours(); // Changement "listerTousCours" en "afficherTousCours" pour plus de clarté
    void afficherCoursModuleProf(); // Changement "listerCoursModuleProfesseur" en "afficherCoursModuleProf" pour plus de concision
    void quitter();
} 