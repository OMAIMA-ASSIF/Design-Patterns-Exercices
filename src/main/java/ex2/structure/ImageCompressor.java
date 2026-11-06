package ex2.structure;

abstract class ImageCompressor {

    // Le squelette de l'algorithme (méthode finale pour ne pas être redéfinie)
    public final int[] compresser(int[] data) {
        System.out.println("[Compression] Préparation des données...");
        data = doCompress(data); // Délégation des détails aux sous-classes
        System.out.println("[Compression] Finalisation...");
        return data;
    }

    // Les détails sont délégués aux sous-classes
    protected abstract int[] doCompress(int[] data);
}

