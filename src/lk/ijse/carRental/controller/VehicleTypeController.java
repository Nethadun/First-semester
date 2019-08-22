/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.controller;

import lk.ijse.carRental.bo.BOFactory;
import lk.ijse.carRental.bo.custom.VehicleTypeBO;
import lk.ijse.carRental.dto.VehicleTypeDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Nethadun PC
 */
public class VehicleTypeController {
    static VehicleTypeBO bo=(VehicleTypeBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.VEHICLETYPE);
    
    public static boolean addVehicleType(VehicleTypeDTO type) throws ClassNotFoundException, SQLException{
        return bo.addVehicleType(type);
    }
    public static boolean updateVehicleType(VehicleTypeDTO type) throws SQLException, ClassNotFoundException{
        return bo.updatevehicleType(type);
    }
    public static boolean deletevehicleType(String vehicle_Type_Id) throws SQLException, ClassNotFoundException{
        return bo.deleteVehicletype(vehicle_Type_Id);
    }
    public static ArrayList<VehicleTypeDTO> getAllVehicleType() throws ClassNotFoundException, SQLException{
        return bo.getAllVehicleType();
    }
    public static VehicleTypeDTO searchVehicle(String vehicle_Type_Id) throws SQLException, ClassNotFoundException{
        return bo.searchVehicleType(vehicle_Type_Id);
    }
}
