package factories;

import toyproducts.Toy;

public abstract class ToyFactory {

    public Toy produceToy(int serialNumber) {
        Toy toy = this.createToy(serialNumber);
        toy.pack();
        toy.label();
        return toy;
    }
    
    protected abstract Toy createToy(int serialNumber);
    
}
