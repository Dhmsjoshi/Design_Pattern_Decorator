package Design_Pattern_Decorator;

public class OrangeCone implements IceCream{
    private IceCream iceCream;

    public OrangeCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public OrangeCone() {
    }

    @Override
    public int getCost() {
        if(iceCream==null){
            return 30;
        }else{
            return iceCream.getCost()+30;
        }

    }

    @Override
    public String getDescription() {
        if(iceCream==null){
            return " Orange Cone ";
        }else{
            return iceCream.getDescription()+" Orange Cone ";
        }

    }
}
