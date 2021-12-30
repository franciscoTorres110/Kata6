package branches;

import business.ToyBusiness;
import toyproducts.Toy;
import toyproducts.models.AsianCarToy;
import toyproducts.models.AsianHelicopterToy;

public class AsianToyBusiness extends ToyBusiness{

    @Override
    public Toy createToy(String type){
        switch (type) {
            case "car":
                AsianCarToy car = new AsianCarToy(generator.next());
                car.pack();
                car.label();
                return car;
            case "helicopter":
                AsianHelicopterToy hel = new AsianHelicopterToy(generator.next());
                hel.pack();
                hel.label();
                return hel;
            default:
                return null;
        }
    }
    
}
