/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.controller;

import lk.ijse.carRental.bo.BOFactory;
import lk.ijse.carRental.bo.custom.VehicleBO;
import lk.ijse.carRental.dao.CrudUtill;
import lk.ijse.carRental.dto.VehicleDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Nethadun PC
 */
public class VehicleController {
    static VehicleBO bo=(VehicleBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.VEHICLE);
    
    public static boolean addVehicle(VehicleDTO vehi) throws ClassNotFoundException, SQLException{
        return bo.addVehicle(vehi);
    }
    public static boolean updateVehicle(VehicleDTO vehi) throws SQLException, ClassNotFoundException{
        return bo.updateVehicle(vehi);
    }
    public static boolean deleteVehicle(String vehicle_Id) throws SQLException, ClassNotFoundException{
        return bo.deleteVehicle(vehicle_Id);
    }
    public static ArrayList<VehicleDTO> getAllVehicle() throws ClassNotFoundException, SQLException{
        return bo.getAllVehicle();
    }
    public static VehicleDTO searchVehicle(String vehicle_Id)throws SQLException,ClassNotFoundException{
        return bo.searchVehicle(vehicle_Id);
    }
            
    
}
