package branches;

import business.ToyBusiness;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AmericanHelicopterToy;

public class AmericanToyBusiness extends ToyBusiness{

    @Override
    public Toy createToy(String type){
        switch (type) {
            case "car":
                AmericanCarToy car = new AmericanCarToy(generator.next());
                car.pack();
                car.label();
                return car;
            case "helicopter":
                AmericanHelicopterToy hel = new AmericanHelicopterToy(generator.next());
                hel.pack();
                hel.label();
                return hel;
            default:
                return null;
        }
    }
    
}
