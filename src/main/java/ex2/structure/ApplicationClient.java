package ex2.structure;

import java.util.Arrays;
import java.util.Scanner;

public class ApplicationClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ImageProcessor processor = new ImageProcessor();

        // Image simulée
        int[] imageData = {100, 150, 200, 250};
        System.out.println("Image originale: " + Arrays.toString(imageData));

        try {
            // Récupère automatiquement le nom du package ("ex2.structure")
            String packageName = ApplicationClient.class.getPackageName();

            // --- 1. Choix dynamique du Filtre (Strategy / Adapter) ---
            System.out.println("\nFiltres disponibles: BlurFilter, SharpenFilter, LegacyFilterAdapter");
            System.out.print("Entrez le nom de la classe du filtre : ");
            String filterClassName = scanner.nextLine().trim();

            ImageFilter chosenFilter;
            if (filterClassName.equals("LegacyFilterAdapter")) {
                // Cas spécial : l'adaptateur a besoin d'un paramètre
                System.out.print("Entrez le nom du filtre legacy : ");
                String legacyName = scanner.nextLine().trim();
                chosenFilter = new LegacyFilterAdapter(legacyName); // CORRECTION ICI
            } else {
                // On construit le nom complet : "ex2.structure.SharpenFilter"
                String fullClassName = packageName + "." + filterClassName;

                // Instanciation dynamique par Réflexion
                Class<?> filterClass = Class.forName(fullClassName);
                chosenFilter = (ImageFilter) filterClass.getDeclaredConstructor().newInstance();
            }
            processor.setFilter(chosenFilter);

            // --- 2. Choix dynamique du Compresseur ---
            System.out.println("\nCompresseurs disponibles: JPEGCompressor, PNGCompressor");
            System.out.print("Entrez le nom de la classe du compresseur : ");
            String compressorClassName = scanner.nextLine().trim();

            // On construit le nom complet : "ex2.structure.JPEGCompressor"
            String fullCompressorClassName = packageName + "." + compressorClassName;

            // Instanciation dynamique par Réflexion
            Class<?> compressorClass = Class.forName(fullCompressorClassName);
            ImageCompressor chosenCompressor = (ImageCompressor) compressorClass.getDeclaredConstructor().newInstance();
            processor.setCompressor(chosenCompressor);

            // --- 3. Exécution du traitement ---
            int[] result = processor.process(imageData);
            System.out.println("Image résultante: " + Arrays.toString(result));

            // --- 4. Preuve du changement dynamique à l'exécution ---
            System.out.println("\n>>> Changement dynamique de filtre à l'exécution <<<");
            processor.setFilter(new SharpenFilter()); // On change la Strategy à la volée
            processor.process(imageData);

        } catch (ClassNotFoundException e) {
            System.err.println("Erreur : La classe n'existe pas. Vérifiez l'orthographe (ex: SharpenFilter).");
        } catch (Exception e) {
            System.err.println("Erreur lors de l'exécution : " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}