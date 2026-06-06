import java.util.ArrayList;
import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        ArrayList<Client> liste = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choix = -1;

        while (choix != 0) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Afficher les clients");
            System.out.println("2. Enregistrer un client");
            System.out.println("3. Facturer un client");
            System.out.println("4. Liberer un client");
            System.out.println("5. Rechercher un client");
            System.out.println("6. Afficher le nombre de clients enregistres");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");
            
            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:

                case 2:

                case 3:

System.out.print("ID du client a facturer : ");
                    int idFacture = scanner.nextInt();
                    boolean trouveFacture = false;
                    for (Client c : liste) {
                        if (c.id == idFacture) {
                            int montant = c.nbrNuit * 5000;
                            System.out.println("Facture pour " + c.prenom + "            " + c.nom + " : " + montant + " FCFA");
                            trouveFacture = true;
                            break;
                        }
                    }
                    if (!trouveFacture) {
                        System.out.println("Client introuvable.");
                    }
                    break;


                case 4:

                case 5:

                case 6:

                case 0:
                    System.out.println("Fermeture de l'application.");
                    break;

                default:
                    System.out.println("Option invalide, veuillez reessayer.");
            }
        }
        scanner.close();
    }
}

class Client {
    String nom;
    String prenom;
    int id;
    int nbrNuit;

    Client(String nom, String prenom, int id, int nbrNuit) {
        this.nom = nom;
        this.prenom = prenom;
        this.id = id;
        this.nbrNuit = nbrNuit;
    }
}

