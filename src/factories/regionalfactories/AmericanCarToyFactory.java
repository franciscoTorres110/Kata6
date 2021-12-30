package factories.regionalfactories;

import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;

public class AmericanCarToyFactory extends ToyFactory{

    @Override
    public Toy createToy(int serialNumber){
        return new AmericanCarToy(serialNumber);
    }
    
}
