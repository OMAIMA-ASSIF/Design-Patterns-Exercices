package ex2.structure;

public class ImageProcessor {
    private ImageFilter filter;
    private ImageCompressor compressor;

    // Permet de changer dynamiquement de filtre à l'exécution
    public void setFilter(ImageFilter filter) {
        this.filter = filter;
    }

    public void setCompressor(ImageCompressor compressor) {
        this.compressor = compressor;
    }

    public int[] process(int[] data) {
        System.out.println("\n--- Début du traitement ---");
        if (filter != null) {
            data = filter.filter(data);
        }
        if (compressor != null) {
            data = compressor.compresser(data);
        }
        System.out.println("--- Fin du traitement ---\n");
        return data;
    }
}
