/////////////////////////////////////////// Inherritance (extends)
//import java.util.*;
//public class Application {
//    public static void main(String[] args) {
//
//    }
//}
//
//class SIT{
//    private String name;
//    private int id;
//
//    public SIT (String name, int id){
//        this.name = name;
//        this.id = id;
//    }
//    public String getName() {
//        return name;
//    }
//
//    public int getId() {
//        return id;
//    }
//}
//
//class CS extends SIT{
//    private int year;
//    public CS(String name, int id, int year){
//        super(name,id);
//        this.year = year;
//    }
//}

//===================================================================================================================================

/////////////////////////////////////////// Abstract  implementations
//import java.util.*;
//public class Application {
//    public static void main(String[] args) {
//
//    }
//}
//
//abstract class SIT{
//    private String name;
//    private int id;
//
//    public SIT (String name, int id){
//        this.name = name;
//        this.id = id;
//    }
//    public String getName() {
//        return name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public abstract void sayHello();
//}
//
//class CSgirl extends SIT{
//    private int year;
//    public CSgirl(String name, int id, int year){
//        super(name,id);
//        this.year = year;
//    }
//    public void sayHello(){
//        System.out.println("Sawaddee KAAA");
//    }
//}
//
//class CSboy extends SIT{
//    private int year;
//    public CSboy(String name, int id, int year){
//        super(name,id);
//        this.year = year;
//    }
//    public void sayHello(){
//        System.out.println("Sawaddee Krub");
//    }
//}
//
//
//

//===========================================================================================================================================

/////////////////////////////////////////////// ArrayList
import java.util.*;
// import java.util.Scanner;
// import java.util.ArrayList;

ArrayList<Car> cars = new Arraylist<>(); //ไม่มีขอบเขตช่อง จดเข้าห้องสอบ
Arraylist methods
1.add()
2.remove()
3.size() // == length()
4.contains()
5.get(index)

cars = {car1, car2, car3}
cars.get(2); // ได้ car3

cars.add(car4); // ได้ {car1 , car2 ,car3 ,car4}

cars.contains(car6); // ถ้ามี จะ return true
                    // ถ้าไม่มี จะ return fail
                    // อันนี้ตอบไม่มี

cars.size(); // == 3

cars.remove(car2); // ได้ {car1, car3}

public class Application {
    public static void main(String[] args) {

    }
}
abstract class SIT{
    private String name;
    private int id;

    public SIT (String name, int id){
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public abstract void sayHello();
}

class CSgirl extends SIT{
    private int year;
    public CSgirl(String name, int id, int year){
        super(name,id);
        this.year = year;
    }
    public void sayHello(){
        System.out.println("Sawaddee KAAA");
    }
}

class CSboy extends SIT{
    private int year;
    public CSboy(String name, int id, int year){
        super(name,id);
        this.year = year;
    }
    public void sayHello(){
        System.out.println("Sawaddee Krub");
    }
}
