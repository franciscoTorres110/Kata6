package toyproducts.models;

import toyproducts.Toy;

public class HelicopterToy implements Toy{
    
    final private int serialNumber;
    final private String type="helicopter";

    public HelicopterToy(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    @Override
    public int getSerialNumber() {
        return serialNumber;
    }

    public String getType() {
        return type;
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
        return "HelicopterToy{" + "serialNumber=" + serialNumber + '}';
    }
    
}
