package ex2.structure;

import java.util.Arrays;

class BlurFilter implements ImageFilter {
    @Override
    public int[] filter(int[] data) {
        System.out.println("[Filtre] Application du filtre Flou (Blur)");
        return Arrays.stream(data).map(x -> x / 2).toArray();
    }
}