public class Plant {

    private String name;
    private double height;
    private double needOfWater;

    public Plant(String name, double height) { //Denna skulle nog vara bättre som abstrakt.
        this.name = name;
        this.height = height;
        this.needOfWater = needOfWater;
    }

    public Plant() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getNeedOfWater() {
        return needOfWater;
    }

    public void setNeedOfWater(double needOfWater) {
        this.needOfWater = needOfWater;
    }

    public Liquids getLiquidType () { //Polymorfism för vätskan med en enum.
        return Liquids.NONE; //Retunerar none för att klassen borde ha varit abstrakt.
    }




    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", needOfWater=" + needOfWater +
                '}';
    }
}

