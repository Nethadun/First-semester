/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.bo.custom;

import lk.ijse.carRental.bo.SuperBO;
import lk.ijse.carRental.dto.VehicleTypeDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Nethadun PC
 */
public interface VehicleTypeBO extends SuperBO{
    public boolean addVehicleType(VehicleTypeDTO type)throws ClassNotFoundException,SQLException;
    public boolean updatevehicleType(VehicleTypeDTO type)throws SQLException,ClassNotFoundException;
    public boolean deleteVehicletype(String vehicle_Type_Id)throws SQLException,ClassNotFoundException;
    public ArrayList<VehicleTypeDTO>getAllVehicleType()throws ClassNotFoundException,SQLException;
    public VehicleTypeDTO searchVehicleType(String vehicle_Type_Id)throws SQLException,ClassNotFoundException;
}
