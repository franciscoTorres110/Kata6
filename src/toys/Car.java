package toys;

public class Car {
    
    final private int serialNumber;
    final private String type="car";

    public Car(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    public int getSerialNumber() {
        return serialNumber;
    }

    public String getType() {
        return type;
    }
    
    public void pack(){
        System.out.printf("Packing '%s' '%d'\n",this.type,this.serialNumber);
    }
    
    public void label(){
        System.out.printf("Labelling '%s' '%d'\n",this.type,this.serialNumber);
    }
    
}
