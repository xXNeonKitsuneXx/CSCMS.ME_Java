class Car {
    private String id; //atri
    private String name;
    private String color;
    private long velocity;
    private long distance;
    public static long accumulate_distance;
    Car(String id,String name,String color,long velocity){ //constructer
        this.id=id;
        this.name=name;
        this.color=color;
        this.velocity=velocity;
    }
    long drive(int time){ //method สามารถ return ่ค่าได้ 200
        distance = velocity * time;
        accumulate_distance += distance;
        return distance;
    }
    long getDistance(){
        return distance;
    }
    String getColor(){
        return color;
    }
    String getName(){
        return name;
    }
    long getVelocity(){
        return velocity;
    }
    String getId(){
        return id;
    }
    void setColor(String colorTar){ //ไม่มี return ไม่มีไรออก
        this.color = colorTar;
    }
    //String setColor(String colorTar){ ถ้า set มี return
    //this.color = colorTar;
    // return color;
    //}
    void setVelocity(int velocityTarSpeed){
        this.velocity = velocityTarSpeed;
    }
    void setName(String name){
        this.name = name;
    }
    void setId(String idTarKak){
        this.id = idTarKak;
    }
}

public class Application {
    public static void main(String[] args) {
        Car car1 = new Car("101", "Car 1", "Blue", 20);
        Car car2 = new Car("R9", "Car 2", "#f2f2f2", 35);
        Car car3 = new Car("AZ-204", "Car 3", "Lightly Green", 2);

        car1.drive(10);
        System.out.println(car1.getDistance());
        System.out.println(Car.accumulate_distance);

        car2.setColor("Red");
        // System.out.println(car2.setColor("Red")); in case set มี return
        System.out.println(car2.getColor());

        System.out.println(car1.getName());
        System.out.println(car3.getDistance());
        System.out.println(car3.getVelocity());

        car3.setVelocity(100);
        car3.drive(20);
        car2.drive(60);
        System.out.println(Car.accumulate_distance);

        car1.setName("New Name");
        car3.setId("AZ-303");
        System.out.println(car1.getName());
        System.out.println(car3.getId());
    }
}
