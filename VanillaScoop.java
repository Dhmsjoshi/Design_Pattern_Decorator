package Design_Pattern_Decorator;

public class VanillaScoop implements IceCream{ //Can't be base only a topping
    private IceCream iceCream;

    public VanillaScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
            return iceCream.getCost()+70;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription()+" Vanilla Scoop ";

    }


}
