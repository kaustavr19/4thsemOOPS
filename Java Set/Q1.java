class Q1 {
    public static void main(String[] args) {
        Bus bus=new Bus(18295001,80.0,"Red","Suvra","Tata Motors");
        bus.showData();
        Car car=new Car(22569082,60.0,"Blue","Shaw","Mahindra");
        car.showData();
    }}
class Vehicle {
    protected int regnNumber;
    protected double speed;
    protected String color;
    protected String ownerName;
    void showData() {
        System.out.println("This is a vehicle class");
    }}
class Bus extends Vehicle {
    private String routeNumber;
    Bus(int regnNumber,double speed,String color,String ownerName,String routeNumber) {
        this.regnNumber=regnNumber;
        this.speed=speed;
        this.color=color;
        this.ownerName=ownerName;
        this.routeNumber=routeNumber;
    } void showData() {
        System.out.println(String.format("Registration No. %d", regnNumber));
        System.out.println(String.format("Speed - %f", speed));
        System.out.println(String.format("Color - %s", color));
        System.out.println(String.format("Owner - %s", ownerName));
        System.out.println(String.format("Route No. %s", routeNumber));
        super.showData();

    }}
class Car extends Vehicle {
    private String manufacturerName;
    Car(int regnNumber,double speed,String color,String ownerName,String manufacturerName) {
        this.regnNumber=regnNumber;
        this.speed=speed;
        this.color=color;
        this.ownerName=ownerName;
        this.manufacturerName=manufacturerName;
    } void showData() {
        System.out.println(String.format("Registration No. %d", regnNumber));
        System.out.println(String.format("Speed - %f", speed));
        System.out.println(String.format("Color - %s", color));
        System.out.println(String.format("Owner - %s", ownerName));
        System.out.println(String.format("Manufacturer - %s", manufacturerName));
        super.showData();
    }}