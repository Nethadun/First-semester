/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.bo.custom.impl;

import lk.ijse.carRental.bo.custom.VehicleBO;
import lk.ijse.carRental.dao.DAOFactory;
import lk.ijse.carRental.dao.custom.VehicleDAO;
import lk.ijse.carRental.dto.VehicleDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.carRental.model.Vehicle;

/**
 *
 * @author Nethadun PC
 */
public class VehicleBOImpl implements VehicleBO{
    
    VehicleDAO dao=(VehicleDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOType.VEHICLE);

    @Override
    public boolean addVehicle(VehicleDTO vehi) throws ClassNotFoundException, SQLException {
        return dao.add(new Vehicle(vehi.getVehicle_Id(),vehi.getOwner_Id(),vehi.getVehicle_Type_Id(),vehi.getColour(),vehi.getRent(),vehi.getNo_Pass()));
    }

    @Override
    public boolean updateVehicle(VehicleDTO vehi) throws SQLException, ClassNotFoundException {
        return dao.update(new Vehicle(vehi.getVehicle_Id(),vehi.getOwner_Id(),vehi.getVehicle_Type_Id(),vehi.getColour(),vehi.getRent(),vehi.getNo_Pass()));
    }

    @Override
    public boolean deleteVehicle(String vehicle_Id) throws SQLException, ClassNotFoundException {
         return dao.delete(vehicle_Id);
    }

    @Override
    public ArrayList<VehicleDTO> getAllVehicle() throws ClassNotFoundException, SQLException {
         ArrayList<Vehicle> all=dao.getAll();
         ArrayList<VehicleDTO> allVehicle=new ArrayList<>();
         for (Vehicle vehicle : all) {
            allVehicle.add(new VehicleDTO(vehicle.getVehicle_Id(),vehicle.getOwner_Id(),vehicle.getVehicle_Type_Id(),vehicle.getColour(),vehicle.getRent(),vehicle.getNo_Pass()));
        }
         return allVehicle;
    }

    @Override
    public VehicleDTO searchVehicle(String vehicle_Id) throws SQLException, ClassNotFoundException {
        Vehicle search=dao.search(vehicle_Id);
        return new VehicleDTO(search.getVehicle_Id(),search.getOwner_Id(),search.getVehicle_Type_Id(),search.getColour(),search.getRent(),search.getNo_Pass());
    }

   
    
}
