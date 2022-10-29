package pro.sky.java.ds_3_0.task1;

import java.util.concurrent.ThreadLocalRandom;

public class Car extends Transport implements Competing {

    public Car(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.printf("Легковая машина %s %s поехала\n",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void stopMoving() {
        System.out.printf("Легковая машина %s %s остановилась\n",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public String toString() {
        return "Car{" +
                "transport=" + super.toString() +
                '}';
    }

    @Override
    public void pitStop() {
        System.out.printf("Легковая машина %s %s совершила Пит-стоп\n",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public int getBestLapTime() {
        return ThreadLocalRandom.current().nextInt(900, 1000);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(300, 370);
    }
}
