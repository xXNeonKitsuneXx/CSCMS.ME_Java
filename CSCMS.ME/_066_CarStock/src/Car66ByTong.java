import java.util.ArrayList;

public class Stock {
    ArrayList<Stock> stocks = new ArrayList<>();
    ArrayList<Car> cars = new ArrayList<>();
    public void AddStock(Stock stock){
        stocks.add(stock);
    }
    public void buy(Car car){
        cars.add(car);
    }
    public void printAllCar(){
        for(Car car:this.cars){
            System.out.println("Car Name : "+car.getName()+"\nCar Brand : "+car.getBrand()+"\nCar Price : "+car.getPrice());
        }
    }


}

public class StockOwner extends Stock {
    private String name;
    private int money;
    private int asset;

    public StockOwner(String name,int money){
        this.name= name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void buyCar(Stock stock,Car car){
        stock.buy(car);
        money-=car.getPrice();
        asset+=car.getPrice();
    }
    public int calculateAllAsset(){
        return asset;
    }
    public int getAmountofCar(){
        int cnt=0;
        for(Stock a:this.stocks){
                cnt+=a.cars.size();
        }
        return cnt;
    }
    public void buyAllCar(Stock stk1,Stock stk2){
        for(int i=0;i<stk2.cars.size();i++){
            stk1.buy(stk2.cars.get(i));
            money-=stk2.cars.get(i).getPrice();
            asset+=stk2.cars.get(i).getPrice();
        }
        stk2.cars.removeAll(stk1.cars);
    }
}

public class Car {
    private String name;
    private String brand;
    private int price;

    public Car(String name, String brand, int price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public Car(String name, String brand) {
        this.name = name;
        this.brand = brand;
        this.price = 1000000;
    }

    public Car(String name) {
        this.name = name;
        this.brand = "BMW";
        this.price = 1000000;
    }

    public Car() {
        this.name = "Car1";
        this.brand = "BMW";
        this.price = 1000000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }
}

public class CarStockTester {
    public static void main(String[] args){
        StockOwner Owner1 = new StockOwner("RichMan", 1000000000);
        Stock s1 = new Stock();
        Stock s2 = new Stock();
        Stock s3 = new Stock();
        Stock s4 = new Stock();
        Owner1.AddStock(s1);
        Owner1.AddStock(s3);
        Owner1.AddStock(s4);
        Car c1 = new Car();
        Car c2 = new Car("Rod");
        Car c3 = new Car("Spike","Benz",20000000);
        Car c4 = new Car("Lambo","Lambo");
        Car c5 = new Car("Noname");
        Car c6 = new Car("Unnamed","Unnamed",300000000);
        s2.buy(c1);
        s2.buy(c2);
        System.out.println("Money of Owner");
        System.out.println("Name : "+Owner1.getName());
        System.out.println("Money : "+Owner1.getMoney());
        System.out.println("___________________________");
        Owner1.buyCar(s1, c3);
        Owner1.buyCar(s3, c4);
        Owner1.buyCar(s3, c5);
        Owner1.buyCar(s4, c6);
        System.out.println("Money of Owner <After Buy>");
        System.out.println("Name : "+Owner1.getName());
        System.out.println("Money : "+Owner1.getMoney());
        System.out.println("___________________________");
        System.out.println("Car in Each Stock");
        System.out.println("Stock 1");
        s1.printAllCar();
        System.out.println("___________________________");
        System.out.println("Stock 2");
        s2.printAllCar();
        System.out.println("___________________________");
        System.out.println("Stock 3");
        s3.printAllCar();
        System.out.println("___________________________");
        System.out.println("Stock 4");
        s4.printAllCar();
        System.out.println("___________________________");
        Owner1.buyAllCar(s4, s2);
        System.out.println("Money of Owner <After Buy 2nd time>");
        System.out.println("Name : "+Owner1.getName());
        System.out.println("Money : "+Owner1.getMoney());
        System.out.println("___________________________");
        System.out.println("All asset");
        System.out.println("Value of Asset : "+Owner1.calculateAllAsset());
        System.out.println("Cars : "+Owner1.getAmountofCar());
        System.out.println("___________________________");
        System.out.println("Car in Each Stock");
        System.out.println("Stock 1");
        s1.printAllCar();
        System.out.println("___________________________");
        System.out.println("Stock 2");
        s2.printAllCar();
        System.out.println("___________________________");
        System.out.println("Stock 3");
        s3.printAllCar();
        System.out.println("___________________________");
        System.out.println("Stock 4");
        s4.printAllCar();
        System.out.println("___________________________");
    }
}

