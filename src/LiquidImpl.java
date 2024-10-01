public class LiquidImpl implements InterfaceLiquid {

    public double calculateLiquid(Plant plant) {
        if (plant.getClass().equals(Palm.class)) {
            return plant.getHeight() * ((Palm) plant).PalmLiquid(); //TODO KALKULATION SKALL LiGGA I KLASS!.
        } else if (plant.getClass().equals(Cactus.class)) {
            return 0.02;
        } else if (plant.getClass().equals(CarnivorousPlant.class)) {
            return 0.1 + plant.getHeight() * 0.2;

        } else {
            return 0;
        }
    }
}
