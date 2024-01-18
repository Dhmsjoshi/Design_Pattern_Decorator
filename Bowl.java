package Design_Pattern_Decorator;

public class Bowl implements IceCream{//Only a base

    public Bowl() {
    }

    @Override
    public int getCost() {
        return 50;
    }

    @Override
    public String getDescription() {
        return " Bowl ";
    }
}
