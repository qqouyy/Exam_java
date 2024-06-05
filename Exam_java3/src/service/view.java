import java.util.List;
import java.util.Scanner;



import Entities.cours;
import Entities.IAPP;
import Entities.modules;
import Entities.professeur;

public class View {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        CoursServices coursService= new EtudiantServices();
        IAPPServices IAPPService= new InscriptionServices();
        ModulesServices modulesService=new ClasseServices();
        ProfesseurServices professeurService=new ProfesseurServices();
        List<Cours> cours= coursService.listerClasse();
        List<Modules> modules=  modulesService.listerEtudiant();
        List<Professeur> professeur= professeurService.listerProfesseurs();
        int choix;
        do {
            System.out.println("1-Ajouter un module");
            System.out.println("4-Lister les modules");
            System.out.println("5-Creer un cours");
            System.out.println("6-lister tous les cours");
            System.out.println("7-Lister les cours d'un module et d'un professeur");
            System.out.println("12-Quitter");
            System.out.println("Faites un choix");
            choix=sc.nextInt();
            sc.nextLine();
            switch (choix) {
                case 1:
                    System.out.println("Entrer le Libellé");
                    String Libelle=sc.nextLine();
                    Modules mdl=new Modules();
                    cl.setLibelle(Libelle);
                    ModulesService.ajouterModules(mdl);
                break;
                case 2:
                    
                Modules=  ModulesService.listerModules();
                    for (Modules Modules: Modules) {
                        System.out.println("Libelle "+ Modules.getLibelle());
                        System.out.println("=================================");
                    }
                break;
                case 3:
                    System.out.println("Entrer le grade du professeur");
                    String grade=sc.nextLine();
                    System.out.println("Entrer le nom et le prenom du professeur");
                    String nomCompletp=sc.nextLine();
                    System.out.println("Entrer le NCI du professeur");
                    String NCI=sc.nextLine();
                    
                    Professeur prof=new Professeur();
                    prof.setGrade(grade);
                    prof.setNci(NCI);
                    prof.setNomCompletp(nomCompletp);
                    professeurService.AjouterProf(prof);
                   
                    
                break;
                case 4:
                professeurs=  professeurService.listerProfesseurs();
                for (Professeur professeur: professeurs) {
                    System.out.println("nom "+ professeur.getNomCompletp());
                    System.out.println("=================================");
                }
                break;

                case 5:
                

                break;
                case 6:
                   // Demander les informations sur le cours  à l'utilisateur
                    Cours etd = new Etudiant();
                    System.out.println("Entrez le nom de l'étudiant : ");
                    String nomComplet = sc.nextLine();
                    etd.setNomComplet(nomComplet);
                    System.out.println("Entrez le numéro de matricule : ");
                    String matricule = sc.nextLine();
                    etd.setMatri(matricule);
                    

                    // Insérer le cours dans la base de données
                    Cours CoursInsere = CoursService.ajouterCours(crs);

                   
                       

                    
                    
                break;
                
            }
        }while(choix!=12);
        sc.close();
    }
}
