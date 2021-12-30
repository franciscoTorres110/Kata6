package factories;

public class SerialNumberGenerator {
    
    private int serialNumber=0;
    
    public int next(){
        return this.serialNumber++;
    }
    
}
