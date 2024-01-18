package Design_Pattern_Decorator;

public class VanillaCone implements IceCream{
    private IceCream iceCream;

    public VanillaCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public VanillaCone() {
    }

    @Override
    public int getCost() {
        if(iceCream==null){
            return 35;
        }else{
            return iceCream.getCost()+35;
        }

    }

    @Override
    public String getDescription() {
        if(iceCream==null){
            return " Vanilla Cone ";
        }else{
            return iceCream.getDescription()+ " Vanilla Cone ";
        }

    }
}
