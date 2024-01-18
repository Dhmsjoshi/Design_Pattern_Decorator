package Design_Pattern_Decorator;

public class ChocolateChip implements IceCream{
    private IceCream iceCream;

    public ChocolateChip(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
            return iceCream.getCost()+40;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription()+" Choco chips ";
    }
}
