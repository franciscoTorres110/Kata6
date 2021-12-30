package toyproducts.models;

import toyproducts.Toy;

public class AmericanCarToy implements Toy{
    
    final private int serialNumber;
    final private String type="car";

    public AmericanCarToy(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    @Override
    public int getSerialNumber() {
        return serialNumber;
    }
    
    @Override
    public void pack(){
        System.out.printf("Packing '%s' '%d'\n",this.type,this.serialNumber);
    }
    
    @Override
    public void label(){
        System.out.printf("Labelling '%s' '%d'\n",this.type,this.serialNumber);
    }

    @Override
    public String toString() {
        return "AmericanCarToy{" + "serialNumber=" + serialNumber + '}';
    }
    
}
