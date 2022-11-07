public class Car extends Vehicle {
    private double tankSize;
    private boolean isWiperOn;
    private double length;
    private double width;
    private double height;

    public Car(
            double length,
            String name, String numberPlate,
            String fuelType, int wheelCount, double speed
    ) {
        super(name, numberPlate, fuelType, 4, speed);
        this.tankSize = tankSize;
        this.isWiperOn = isWiperOn;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    @Override
    public void accelerate(double speed) {
        super.accelerate(speed);
    }

    @Override
    public void changeGear(int gear) {
        super.changeGear(gear);
    }

    @Override
    public void halt() {
        super.halt();
    }
}
