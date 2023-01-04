class Factory{
    private double _iron;
    private double _copper;
    private double _silver;
    private double _gold;
    private int _circuitBoard;
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public Factory (double iron, double copper, double silver, double gold){
        _iron = iron;
        _copper = copper;
        _silver = silver;
        _gold = gold;
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void buildCircuitBoard(double number){
        _silver = _silver - ((number*2)/1_000_000);
        _gold = _gold - ((number*0.01)/1_000_000);
        _copper = _copper - ((number*5)/1_000_000);
        _circuitBoard += number;
    }
////////////////////////////////////////////////////////////////////////////////////////////////
    public double getIron (){
        return _iron;
    }
    public double getCopper (){
        return _copper;
    }
    public double getSilver (){
        return _silver;
    }
    public double getGold (){
        return _gold;
    }
    public int getCircuitBoard (){
        return _circuitBoard;
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////
public class Application{
    public static void main(String[] args) {
        Factory fac1 = new Factory(67,9,10,1);
        System.out.println(fac1.getIron());
        System.out.println(fac1.getCopper());
        System.out.println(fac1.getSilver());

        System.out.println(fac1.getGold());
        System.out.println(fac1.getCircuitBoard());
        fac1.buildCircuitBoard(500000);
        fac1.buildCircuitBoard(850000);
        System.out.println(fac1.getIron());
        System.out.println(fac1.getCopper());
        System.out.println(fac1.getSilver());
        System.out.println(fac1.getGold());
        System.out.println(fac1.getCircuitBoard());
    }
}