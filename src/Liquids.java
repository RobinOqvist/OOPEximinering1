public enum Liquids {
    NONE ("Ingen vätska"),
    MINERAL_WATER ("Mineral vatten"),        //Enum med förfinad String för utskrift.
    TAP_WATER ("Kran vatten"),
    PROTEIN_WATER ("Protein dryck");

    private final String name;

    Liquids(String name) {
        this.name = name;
    }
    public String toString() {
        return this.name;
    }
}
