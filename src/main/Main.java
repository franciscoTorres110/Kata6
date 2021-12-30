package main;

import business.ToyBusiness;
import factories.regionalfactories.AmericanCarToyFactory;
import factories.regionalfactories.AmericanSubmarineToyFactory;
import factories.regionalfactories.AsianHelicopterToyFactory;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproducts.Toy;

public class Main {

    public static void main(String[] args) {
        ToyBusiness business = new ToyBusiness();
        business.add("car", new AmericanCarToyFactory());
        business.add("helicopter", new AsianHelicopterToyFactory());
        business.add("submarine", new AmericanSubmarineToyFactory());
        ArrayList<Toy> toys = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);
        String line = "";
        while (!"exit".equals(line)) {
            line = input.nextLine();
            
            
            switch (line) {
                case "car":
                case "helicopter":
                case "submarine":
                    toys.add(business.produceToy(line));
                    
                    // Comprobación funcionalidad
                    System.out.println(
                            "Built toys: "+toys.stream()
                                    .map(c -> c.toString())
                                    .collect(Collectors.joining(", ")));
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
