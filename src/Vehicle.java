public class Vehicle {
    private String name;
    private String numberPlate;
    private String fuelType;
    private int wheelCount;
    private int currentGear;
    private double speed;

    public Vehicle(String name, String numberPlate, String fuelType, int wheelCount, double speed) {
        this.name = name;
        this.numberPlate = numberPlate;
        this.fuelType = fuelType;
        this.wheelCount = wheelCount;
        this.speed = speed;
    }

    public void accelerate(double speed) {
        this.speed += speed;
    }

    public void changeGear(int gear){
        this.currentGear = gear;
    }

    public void halt() {
        this.speed = 0;
    }


}
