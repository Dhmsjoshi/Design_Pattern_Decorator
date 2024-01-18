package Design_Pattern_Decorator;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream =new ChocolateChip(
                                new ChocolateScoop(
                                    new VanillaScoop(
                                        new VanillaCone(
                                            new ChocolateChip(
                                                new ChocolateCone())))));


        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDescription());


    }

}

//Icecream -> ChocolateCone -> [10, Chocolate Cone]
//Icecream -> VanillaCone -> [30, Vanilla scoop] ->
// new Cost & Description -> [40, Chocolate Cone + Vanilla scoop]

//Icecream -> ChocolateChip -> [30, Chocolate chips]
// new Cost & Description -> [70, Chocolate Cone + Vanilla scoop + Chocolate chips]

// A cone -> has to be base, It can be  topping also: ex-> VanillaCone + ChocolateSyrup + ChocolateCone
//But anything else can't be the base.(ex: Chocolate syrup can't be the base)

//(Consider every item as icecream)
// Base ->  There was no icecream prior to it, first part of icecream.
//Topping -> There was some icecream (Base) prior to it.