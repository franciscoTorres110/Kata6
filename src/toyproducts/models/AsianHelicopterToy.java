package toyproducts.models;

import toyproducts.Toy;

public class AsianHelicopterToy implements Toy{
    
    final private int serialNumber;
    final private String type="helicopter";

    public AsianHelicopterToy(int serialNumber) {
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
        return "AsianHelicopterToy{" + "serialNumber=" + serialNumber + '}';
    }
    
}
