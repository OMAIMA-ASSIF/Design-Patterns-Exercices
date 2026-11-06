package ex2.structure;

import java.util.Arrays;

class SharpenFilter implements ImageFilter {
    @Override
    public int[] filter(int[] data) {
        System.out.println("[Filtre] Application du filtre Netteté (Sharpen)");
        return Arrays.stream(data).map(x -> x * 2).toArray();
    }
}
