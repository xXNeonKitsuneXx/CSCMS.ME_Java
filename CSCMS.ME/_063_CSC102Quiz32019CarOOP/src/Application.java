import java.util.*;
class Car {
    private long idC; //attributes
    private String brandC;
    private String colorC;
    private String ownerC;
    private double totalDrivingDistC;
    public static double accumulatedDist;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public Car (long id,String brand,String color,String owner){ //constructor
        idC = id;
        brandC = brand;
        colorC = color;
        ownerC = owner;
    }
    public Car (long id){
        idC = id;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void drive(double distance){
        totalDrivingDistC += distance;
        accumulatedDist += distance;
    }
//**************************************************************************************************************
    public long getId(){  //method
        return idC;
    }
    public String getBrand(){
        return brandC;
    }
    public String getColor(){
        return colorC;
    }
    public String getOwner(){
        return ownerC;
    }
    public double getTotalDrivingDist(){
        return totalDrivingDistC;
    }
    public void setBrand (String brandM){
        brandC = brandM;
    }
    public void setColor (String colorM){
        colorC = colorM;
    }
    public void setOwner (String ownerM){
        ownerC = ownerM;
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Application{
    public static void main(String[] args){
        Car car1 = new Car(15012016);
        Car car2 = new Car(20022011, "Jajuar XKR-S", "Blue", "Paul");
        Car car3 = new Car(11112015, "Mercedes-AMG GT", "Yellow", "Smith");

        car1.setBrand("Lamborghini Veneno");
        car1.setColor("Black");
        car1.setOwner("James");

        car1.drive(120);
        car2.drive(300);
        car2.drive(50);
        car1.drive(15);

        System.out.println("----- car1 Info -----");
        System.out.println("id: "+car1.getId()+
                " brand: "+ car1.getBrand() +
                " color: "+ car1.getColor() +
                " owner: "+ car1.getOwner() +
                " total driving distance: " + car1.getTotalDrivingDist());

        System.out.println("----- car2 Info -----");
        System.out.println("id: "+car2.getId()+
                " brand: "+ car2.getBrand() +
                " color: "+ car2.getColor() +
                " owner: "+ car2.getOwner() +
                " total driving distance: " + car2.getTotalDrivingDist());

        System.out.println("----- car3 Info -----");
        System.out.println("id: "+car3.getId()+
                " brand: "+ car3.getBrand() +
                " color: "+ car3.getColor() +
                " owner: "+ car3.getOwner() +
                " total driving distance: " + car3.getTotalDrivingDist());

        System.out.println("---Accumulated Driving Distance---");
        System.out.println(Car.accumulatedDist);
    }
}