/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.dto;

/**
 *
 * @author Nethadun PC
 */
public class VehicleTypeDTO {
    private String vehicle_Type_Id;
    private String vehicle_Type;
    private String vehicle_Category;

    public VehicleTypeDTO() {
    }

    public VehicleTypeDTO(String vehicle_Type_Id, String vehicle_Type, String vehicle_Category) {
        this.vehicle_Type_Id = vehicle_Type_Id;
        this.vehicle_Type = vehicle_Type;
        this.vehicle_Category = vehicle_Category;
    }

    public String getVehicle_Type_Id() {
        return vehicle_Type_Id;
    }

    public void setVehicle_Type_Id(String vehicle_Type_Id) {
        this.vehicle_Type_Id = vehicle_Type_Id;
    }

    public String getVehicle_Type() {
        return vehicle_Type;
    }

    public void setVehicle_Type(String vehicle_Type) {
        this.vehicle_Type = vehicle_Type;
    }

    public String getVehicle_Category() {
        return vehicle_Category;
    }

    public void setVehicle_Category(String vehicle_Category) {
        this.vehicle_Category = vehicle_Category;
    }
    
    
}
