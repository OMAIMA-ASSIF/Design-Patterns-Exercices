package ex2.structure;

import java.util.Arrays;

public class ImplAdaptee{
    // Signature de l'ancien système
    public int[] appliquerFiltre(String filterName, int[] data) {
        System.out.println("[Legacy] Application du filtre legacy '" + filterName + "'");
        return Arrays.stream(data).map(x -> x + 10).toArray();
    }
}
