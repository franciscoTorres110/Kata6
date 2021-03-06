package factories.regionalfactories;

import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AmericanSubmarineToy;

public class AmericanSubmarineToyFactory extends ToyFactory{

    @Override
    public Toy createToy(int serialNumber){
        return new AmericanSubmarineToy(serialNumber);
    }
    
}
