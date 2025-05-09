package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManager {

    private String fileName;

    public DealershipFileManager(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Dealership getDealership(){

        //create a dealership
        Dealership d = new Dealership("mydealrship", "123 street", "555-555-5555");
        d.addVehicle(new Vehicle(12, 2004, "Jeep", "CJ", "SUV", "Red", 50000, 15000));
        //create a bunch of vehicles.
        // add each vehicle to the dealership

        // return the fully constructed dealership object for use in the program.


        FileReader fr = null;
        try {
            fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null){
                String[] parts = line.split("\\|");

                if (parts.length != 8) continue;

                int vin = Integer.parseInt(parts[0].trim());
                int year = Integer.parseInt(parts[1].trim());
                String make = parts[2].trim();
                String model = parts[3].trim();
                String vehicleType =  parts[4].trim();
                String color = parts[5].trim();
                int odometer = Integer.parseInt(parts[6].trim());
                double price = Double.parseDouble(parts[7].trim());

                d.addVehicle(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file...");
        }
        return d;
    }

    public void saveDealership(){

    }
}
