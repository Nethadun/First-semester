/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.bo.custom;

import lk.ijse.carRental.bo.SuperBO;
import lk.ijse.carRental.dto.VehicleDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Nethadun PC
 */
public interface VehicleBO extends SuperBO{
    public boolean addVehicle(VehicleDTO vehi)throws ClassNotFoundException, SQLException;
    public boolean updateVehicle(VehicleDTO vehi)throws SQLException,ClassNotFoundException;
    public boolean deleteVehicle(String vehicle_Id)throws SQLException,ClassNotFoundException;
    public ArrayList<VehicleDTO> getAllVehicle()throws ClassNotFoundException,SQLException;
    public VehicleDTO searchVehicle(String vehicle_Id)throws SQLException,ClassNotFoundException;
}
