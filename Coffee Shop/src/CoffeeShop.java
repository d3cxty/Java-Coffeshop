public class CoffeeShop {
    String Name;
    int PrepTime;
    
    public void makeOrder(String Name , int PrepTime){
        this.Name = Name;
        this.PrepTime = PrepTime;
    }

    public void GetOrder(){
        System.out.println("Ur order was"+ Name + "it will take " + PrepTime);
    }
    public boolean isQuick(){
        return PrepTime <= 5;

    }

}
