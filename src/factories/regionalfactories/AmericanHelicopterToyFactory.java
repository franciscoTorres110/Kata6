package factories.regionalfactories;

import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AmericanHelicopterToy;

public class AmericanHelicopterToyFactory extends ToyFactory{

    @Override
    public Toy createToy(int serialNumber){
        return new AmericanHelicopterToy(serialNumber);
    }
    
}
