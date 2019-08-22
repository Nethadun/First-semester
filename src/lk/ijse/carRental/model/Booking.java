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
public class Booking {
    private String book_Id;
    private String cust_Id;
    private String rent_Start_Date;
    private String rent_End_Date;
    private String vehicle_Id;
    private String book_Type;
    private String driver_Id;
    private int current_Milege;

    public Booking() {
    }

    public Booking(String book_Id, String cust_Id, String rent_Start_Date, String rent_End_Date, String vehicle_Id, String book_Type, String driver_Id, int current_Milege) {
        this.book_Id = book_Id;
        this.cust_Id = cust_Id;
        this.rent_Start_Date = rent_Start_Date;
        this.rent_End_Date = rent_End_Date;
        this.vehicle_Id = vehicle_Id;
        this.book_Type = book_Type;
        this.driver_Id = driver_Id;
        this.current_Milege = current_Milege;
    }

    public String getBook_Id() {
        return book_Id;
    }

    public void setBook_Id(String book_Id) {
        this.book_Id = book_Id;
    }

    public String getCust_Id() {
        return cust_Id;
    }

    public void setCust_Id(String cust_Id) {
        this.cust_Id = cust_Id;
    }

    public String getRent_Start_Date() {
        return rent_Start_Date;
    }

    public void setRent_Start_Date(String rent_Start_Date) {
        this.rent_Start_Date = rent_Start_Date;
    }

    public String getRent_End_Date() {
        return rent_End_Date;
    }

    public void setRent_End_Date(String rent_End_Date) {
        this.rent_End_Date = rent_End_Date;
    }

    public String getVehicle_Id() {
        return vehicle_Id;
    }

    public void setVehicle_Id(String vehicle_Id) {
        this.vehicle_Id = vehicle_Id;
    }

    public String getBook_Type() {
        return book_Type;
    }

    public void setBook_Type(String book_Type) {
        this.book_Type = book_Type;
    }

    public String getDriver_Id() {
        return driver_Id;
    }

    public void setDriver_Id(String driver_Id) {
        this.driver_Id = driver_Id;
    }

    public int getCurrent_Milege() {
        return current_Milege;
    }

    public void setCurrent_Milege(int current_Milege) {
        this.current_Milege = current_Milege;
    }
    
    
}
