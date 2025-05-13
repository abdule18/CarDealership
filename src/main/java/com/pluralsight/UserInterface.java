package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Dealership dealership;
    private static Console console = new Console();

    public UserInterface(Dealership dealership) {
        this.dealership = dealership;
    }

    private void init(){
        String fileName = "inventory.csv";
        DealershipFileManager manager = new DealershipFileManager(fileName);
        this.dealership = manager.getDealership();
    }

    private void displayVehicles(ArrayList<Vehicle> vehicles){
        for (Vehicle v: vehicles){
            System.out.println("displaying all vehicles: " + v.getFormattedTransactionText());
        }
    }

    public void display() {
        init();

        String promptUser =
                "1. Get by Price\n" +
                "2. Get by Make and Model\n" +
                "3. Get by Year\n" +
                "4. Get by Color\n" +
                "5. Get by Mileage\n" +
                "6. Get by Vehicle Type\n" +
                "7. Get All Vehicles\n" +
                "8. Add Vehicle\n" +
                "9. Remove Vehicle\n" +
                "0. Exit\n";
        int option;
        do {
            option = console.promptForInt(promptUser);

            switch (option){
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMileageRequest();
                    break;
                case 6:
                    processGetByVehicleTypeRequest();
                    break;
                case 7:
                    processGetAllVehiclesRequest();
                    break;
                case 8:
                    processAddVehicleRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }

        } while (option != 0);
    }

    public void processGetByPriceRequest() {
    }
    public void processGetByMakeModelRequest() {

    }
    public void processGetByYearRequest() {

    }
    public void processGetByColorRequest() {

    }
    public void processGetByMileageRequest() {

    }
    public void processGetByVehicleTypeRequest() {

    }
    public void processGetAllVehiclesRequest() {

    }
    public void processAddVehicleRequest() {

    }
    public void processRemoveVehicleRequest() {

    }
}
