package Design_Pattern_Decorator;

public class ChocolateCone implements IceCream{// Can be base Or a Topping
    private IceCream iceCream;

    public ChocolateCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public ChocolateCone() {
    }

    @Override
    public int getCost() {
        if(iceCream==null){
            return 40;
        }else{
            return iceCream.getCost()+40;
        }

    }

    @Override
    public String getDescription() {
        if(iceCream==null){
            return " Chocolate Cone ";
        }else{
            return iceCream.getDescription()+ " Chocolate Cone ";
        }

    }
}
