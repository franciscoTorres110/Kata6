package business;

import toyproducts.Toy;
import toyproducts.models.AmericanHelicopterToy;
import toyproducts.models.AmericanCarToy;
import toys.SerialNumberGenerator;

public abstract class ToyBusiness {
    final protected SerialNumberGenerator generator=new SerialNumberGenerator();
    
    public abstract Toy createToy(String type);
    
}
