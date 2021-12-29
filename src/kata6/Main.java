package kata6;

import java.util.ArrayList;
import java.util.Scanner;
import toys.*;

public class Main {

    public static void main(String[] args) {
        ToyBusiness business = new ToyBusiness();
        
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Helicopter> helicopters = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);
        String line = "";
        while (!"exit".equals(line)) {
            line = input.nextLine();
            
            
            switch (line) {
                case "car":
                    cars.add(business.createCar());
                    // Comprobación funcionalidad
                    System.out.print("Built Cars: ");
                    for (int i = 0; i < cars.size(); i++) {
                        System.out.print(cars.get(i).getSerialNumber());
                        if (i!=cars.size()-1) {System.out.print(", ");}
                    }
                    System.out.println("");
                    break;
                case "helicopter":
                    helicopters.add(business.createrHelicopter());
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
            }
            
        }
        
    }
    
}
