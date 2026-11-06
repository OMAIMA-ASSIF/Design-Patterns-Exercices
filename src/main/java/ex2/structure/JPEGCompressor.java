package ex2.structure;

import java.util.Arrays;

class JPEGCompressor extends ImageCompressor {
    @Override
    protected int[] doCompress(int[] data) {
        System.out.println("[Compression] Algorithme JPEG appliqué.");
        return Arrays.stream(data).map(x -> x - 1).toArray();
    }
}

