public class Palm extends Plant {


    public Palm(String name, double height) {
        super(name, height);

    }

    public double PalmLiquid () {
        return 0.5;
    }


    public Liquids getLiquids() {

        return Liquids.TAP_WATER;
    }

}