package pro.sky.java.ds_3_0.task1;

public class HwOop41 {
    public static void main(String[] args) {

        Car audi = new Car("Audi", "A6", 2.3f);
        Car bmw = new Car("BMW", "X3", 1.6f);
        Car kia = new Car("Kia", "Spectra", 1.8f);
        Car opel = new Car("Opel", "Astra", 1.3f);
        DriverB ivanov = new DriverB("Ivanov", 5, opel);

        Truck volvo = new Truck("Volvo", "655", 3.2f);
        Truck maz = new Truck("MAZ", "64684", 3.0f);
        Truck kamaz = new Truck("Kamaz", "3553", 3.4f);
        Truck iveco = new Truck("Iveco", "V985", 3.6f);
        DriverC leonov = new DriverC("Leonov", 4, kamaz);

        Bus paz = new Bus("PAZ", "09840", 2.8f);
        Bus liaz = new Bus("Liaz", "896t5", 3.5f);
        Bus ikarus = new Bus("Ikarus", "8955t", 3.3f);
        Bus gaz = new Bus("GAZ", "78738", 2.4f);
        DriverD petrov = new DriverD("Petrov", 6, ikarus);

        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(opel);
        System.out.println();
        audi.startMoving();
        opel.stopMoving();
        System.out.println();

        System.out.println(volvo);
        System.out.println(maz);
        System.out.println(kamaz);
        System.out.println(iveco);
        System.out.println();
        maz.startMoving();
        iveco.stopMoving();
        System.out.println();

        System.out.println(paz);
        System.out.println(liaz);
        System.out.println(ikarus);
        System.out.println(gaz);
        System.out.println();
        liaz.startMoving();
        ikarus.stopMoving();
        System.out.println();

        audi.pitStop();
        System.out.printf("Лучшее время круга гонки легковых машин: %s секунд у автомобиля %s %s\n",
                bmw.getBestLapTime(), bmw.getBrand(), bmw.getModel());
        System.out.printf("Максиммальная скорость гонки легковых машин: %s км/ч у автомобиля %s %s\n",
                kia.getMaxSpeed(), kia.getBrand(), kia.getModel());
        System.out.println();

        volvo.pitStop();
        System.out.printf("Лучшее время круга гонки грузовых машин: %s секунд у автомобиля %s %s\n",
                kamaz.getBestLapTime(), kamaz.getBrand(), kamaz.getModel());
        System.out.printf("Максиммальная скорость гонки грузовых машин: %s км/ч у автомобиля %s %s\n",
                maz.getMaxSpeed(), maz.getBrand(), maz.getModel());
        System.out.println();

        paz.pitStop();
        System.out.printf("Лучшее время круга гонки автобусов: %s секунд у автомобиля %s %s\n",
                ikarus.getBestLapTime(), ikarus.getBrand(), ikarus.getModel());
        System.out.printf("Максиммальная скорость гонки автобусов: %s км/ч у автомобиля %s %s\n",
                gaz.getMaxSpeed(), gaz.getBrand(), gaz.getModel());
        System.out.println();

        System.out.println(ivanov);
        System.out.println(leonov);
        System.out.println(petrov);

    }
}
