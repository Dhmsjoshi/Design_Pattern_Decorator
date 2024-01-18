package Design_Pattern_Decorator;

public class ChocolateScoop implements IceCream {

    private IceCream iceCream;

    public ChocolateScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
            return iceCream.getCost()+65;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription()+" Chocolate Scoop ";
    }
}
