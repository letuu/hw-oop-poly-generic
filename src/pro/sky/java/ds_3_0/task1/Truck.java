package pro.sky.java.ds_3_0.task1;

public class Truck extends Transport implements Competing {

    public Truck(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.printf("Грузовая машина %s %s поехала\n",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void stopMoving() {
        System.out.printf("Грузовая машина %s %s остановилась\n",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public String toString() {
        return "Truck{" +
                "transport=" + super.toString() +
                '}';
    }

    @Override
    public void pitStop() {
        System.out.printf("Грузовая машина %s %s совершила Пит-стоп\n",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public int getBestLapTime() {
        return 646;
    }

    @Override
    public int getMaxSpeed() {
        return 205;
    }
}
