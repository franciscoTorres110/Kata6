package toys;

public class ToyBusiness {
    final private SerialNumberGenerator generator=new SerialNumberGenerator();
    
    public Car createCar(){
        Car car = new Car(generator.next());
        car.pack();
        car.label();
        return car;
    }
    
    public Helicopter createrHelicopter(){
        Helicopter hel = new Helicopter(generator.next());
        hel.pack();
        hel.label();
        return hel;
    }
}
