public class CarnivorousPlant extends Plant {
    public CarnivorousPlant(String name, double height) {
      //  needOfWater = 0.1 + needOfWater;
        super(name, height);
    }
    public double calculateWater () {
        return getHeight()* 0.5;
    }

    public Liquids getLiquids() {

        return Liquids.PROTEIN_WATER;
    }
}
