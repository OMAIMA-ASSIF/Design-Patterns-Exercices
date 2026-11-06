package ex2.structure;

class PNGCompressor extends ImageCompressor {
    @Override
    protected int[] doCompress(int[] data) {
        System.out.println("[Compression] Algorithme PNG appliqué.");
        return data;
    }
}