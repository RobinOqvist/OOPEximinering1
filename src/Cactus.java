public class Cactus extends Plant{
    public Cactus(String name, double height) {

        super(name, height);
    }

    public double calculateWater () {
        return 0.02;
    }

    public Liquids getLiquids() {

        return Liquids.MINERAL_WATER;
    }
}
