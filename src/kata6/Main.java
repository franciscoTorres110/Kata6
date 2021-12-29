package kata6;

import java.util.Scanner;
import toys.Car;
import toys.SerialNumberGenerator;

public class Main {

    public static void main(String[] args) {
        SerialNumberGenerator generator = new SerialNumberGenerator();
        
        Scanner input = new Scanner(System.in);
        String line = "";
        while (!"exit".equals(line)) {
            line = input.nextLine();
            
            if (!"exit".equals(line)){
                Car car = new Car(generator.next());
                car.pack();
                car.label();
            }
        }
        
    }
    
}
