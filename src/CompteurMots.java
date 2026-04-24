import java.io.File;
import java.util.Scanner;

public class CompteurMots {

    public static void main(String[] args) {

        int totalMots = 0;
        int numeroLigne = 0;

        try {
            File fichier = new File("texte.txt");
            Scanner lecteur = new Scanner(fichier);

            System.out.println("=== Compteur de mots ===");
            System.out.println();

            // On lit chaque ligne du fichier
            while (lecteur.hasNextLine()) {
                String ligne = lecteur.nextLine();
                numeroLigne++;

                // On sépare les mots avec l'espace comme délimiteur
                String[] mots = ligne.trim().split(" ");
                int nombreMots = mots.length;

                System.out.println("Ligne " + numeroLigne + " (" + nombreMots + " mots) : " + ligne);

                // On ajoute au total
                totalMots += nombreMots;
            }

            lecteur.close();

            System.out.println();
            System.out.println("Total de mots : " + totalMots);

        } catch (Exception e) {
            System.out.println("Fichier introuvable : " + e.getMessage());
        }
    }
}