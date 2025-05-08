package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max){
        ArrayList<Vehicle> result = new ArrayList<Vehicle>();

        //loop through vehicles and add any mathcing vehicle to result...
        for(Vehicle v : inventory){
            if(v.getPrice() >= min && v.getPrice() <= max){
                result.add(v);
            }
        }

        return result;
    }

    public ArrayList<Vehicle> getVehicleByMakeModel(String make, String model){
        return null;
    }

    public ArrayList<Vehicle> getVehicleByYear(int min, int max){
        return null;
    }

    public ArrayList<Vehicle> getVehicleByColor(String color){
        return null;
    }

    public ArrayList<Vehicle> getVehicleByMileage(int min, int max){
        return null;
    }

    public ArrayList<Vehicle> getVehicleByType(String vehicleType){
        return null;
    }

    public ArrayList<Vehicle> getAllVehicles(){
        return null;
    }

    public void addVehicle(Vehicle vehicle){
        this.inventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        this.inventory.remove(vehicle);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
