package kata6;

import java.util.ArrayList;
import java.util.Scanner;
import toys.Car;
import toys.Helicopter;
import toys.SerialNumberGenerator;

public class Main {

    public static void main(String[] args) {
        SerialNumberGenerator generator = new SerialNumberGenerator();
        
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Helicopter> helicopters = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);
        String line = "";
        while (!"exit".equals(line)) {
            line = input.nextLine();
            
            
            switch (line) {
                case "car":
                    Car car = new Car(generator.next());
                    car.pack();
                    car.label();
                    cars.add(car);
                    // Comprobación funcionalidad
                    System.out.print("Built Cars: ");
                    for (int i = 0; i < cars.size(); i++) {
                        System.out.print(cars.get(i).getSerialNumber());
                        if (i!=cars.size()-1) {System.out.print(", ");}
                    }
                    System.out.println("");
                    break;
                case "helicopter":
                    Helicopter hel = new Helicopter(generator.next());
                    hel.pack();
                    hel.label();
                    helicopters.add(hel);
                    // Comprobación funcionalidad
                    System.out.print("Built Helicopters: ");
                    for (int i = 0; i < helicopters.size(); i++) {
                        System.out.print(helicopters.get(i).getSerialNumber());
                        if (i!=helicopters.size()-1) {System.out.print(", ");}
                    }
                    System.out.println("");
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Command unknown!");
                    break;
            }
            
        }
        
    }
    
}
