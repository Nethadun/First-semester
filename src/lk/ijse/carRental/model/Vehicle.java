/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.model;

/**
 *
 * @author Nethadun PC
 */
public class Vehicle {
    private String vehicle_Id;
    private String owner_Id;
    private String vehicle_Type_Id;
    private String colour;
    private double rent;
    private int no_Pass;

    public Vehicle() {
    }

    public Vehicle(String vehicle_Id, String owner_Id, String vehicle_Type_Id, String colour, double rent, int no_Pass) {
        this.vehicle_Id = vehicle_Id;
        this.owner_Id = owner_Id;
        this.vehicle_Type_Id = vehicle_Type_Id;
        this.colour = colour;
        this.rent = rent;
        this.no_Pass = no_Pass;
    }

    public String getVehicle_Id() {
        return vehicle_Id;
    }

    public void setVehicle_Id(String vehicle_Id) {
        this.vehicle_Id = vehicle_Id;
    }

    public String getOwner_Id() {
        return owner_Id;
    }

    public void setOwner_Id(String owner_Id) {
        this.owner_Id = owner_Id;
    }

    public String getVehicle_Type_Id() {
        return vehicle_Type_Id;
    }

    public void setVehicle_Type_Id(String vehicle_Type_Id) {
        this.vehicle_Type_Id = vehicle_Type_Id;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public int getNo_Pass() {
        return no_Pass;
    }

    public void setNo_Pass(int no_Pass) {
        this.no_Pass = no_Pass;
    }

    
    
}
