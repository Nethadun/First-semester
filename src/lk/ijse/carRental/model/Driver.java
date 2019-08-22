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
public class Driver {
    private String driver_Id;
    private String driver_Name;
    private String driver_Licence;
    private int driver_Age;
    private String driver_Address;

    public Driver() {
    }

    public Driver(String driver_Id, String driver_Name, String driver_Licence, int driver_Age, String driver_Address) {
        this.driver_Id = driver_Id;
        this.driver_Name = driver_Name;
        this.driver_Licence = driver_Licence;
        this.driver_Age = driver_Age;
        this.driver_Address = driver_Address;
    }

    public String getDriver_Id() {
        return driver_Id;
    }

    public void setDriver_Id(String driver_Id) {
        this.driver_Id = driver_Id;
    }

    public String getDriver_Name() {
        return driver_Name;
    }

    public void setDriver_Name(String driver_Name) {
        this.driver_Name = driver_Name;
    }

    public String getDriver_Licence() {
        return driver_Licence;
    }

    public void setDriver_Licence(String driver_Licence) {
        this.driver_Licence = driver_Licence;
    }

    public int getDriver_Age() {
        return driver_Age;
    }

    public void setDriver_Age(int driver_Age) {
        this.driver_Age = driver_Age;
    }

    public String getDriver_Address() {
        return driver_Address;
    }

    public void setDriver_Address(String driver_Address) {
        this.driver_Address = driver_Address;
    }
    
    
}
