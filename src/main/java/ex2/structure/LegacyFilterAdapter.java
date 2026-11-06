package ex2.structure;

class LegacyFilterAdapter implements ImageFilter {
    private ImplAdaptee legacySystem;
    private String filterName;

    public LegacyFilterAdapter(String filterName) {
        this.legacySystem = new ImplAdaptee();
        this.filterName = filterName;
    }

    @Override
    public int[] filter(int[] data) {
        // Adaptation : on traduit l'appel moderne vers l'ancienne signature
        return legacySystem.appliquerFiltre(filterName, data);
    }
}
