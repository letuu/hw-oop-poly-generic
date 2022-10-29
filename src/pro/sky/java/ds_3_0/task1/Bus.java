package pro.sky.java.ds_3_0.task1;

import java.util.concurrent.ThreadLocalRandom;

public class Bus extends Transport implements Competing {

    public Bus(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.printf("Автобус %s %s поехал\n",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void stopMoving() {
        System.out.printf("Автобус %s %s остановился\n",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public String toString() {
        return "Bus{" +
                "transport=" + super.toString() +
                '}';
    }

    @Override
    public void pitStop() {
        System.out.printf("Автобус %s %s совершил Пит-стоп\n",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public int getBestLapTime() {
        return ThreadLocalRandom.current().nextInt(500, 600);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(180, 200);
    }
}
