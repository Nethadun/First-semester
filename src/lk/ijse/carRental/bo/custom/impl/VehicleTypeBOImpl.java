/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.bo.custom.impl;

import lk.ijse.carRental.bo.custom.VehicleTypeBO;
import lk.ijse.carRental.dao.DAOFactory;
import lk.ijse.carRental.dao.custom.VehicleTypeDAO;
import lk.ijse.carRental.dto.VehicleTypeDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.carRental.model.VehicleType;

/**
 *
 * @author Nethadun PC
 */
public class VehicleTypeBOImpl implements VehicleTypeBO{
    
    VehicleTypeDAO dao=(VehicleTypeDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOType.VEHICLETYPE);

    @Override
    public boolean addVehicleType(VehicleTypeDTO type) throws ClassNotFoundException, SQLException {
        return dao.add(new VehicleType(type.getVehicle_Type_Id(),type.getVehicle_Type(),type.getVehicle_Category()));
    }

    @Override
    public boolean updatevehicleType(VehicleTypeDTO type) throws SQLException, ClassNotFoundException {
        return dao.update(new VehicleType(type.getVehicle_Type_Id(),type.getVehicle_Type(),type.getVehicle_Category()));
    }

    @Override
    public boolean deleteVehicletype(String vehicle_Type_Id) throws SQLException, ClassNotFoundException {
        return dao.delete(vehicle_Type_Id);
    }

    @Override
    public ArrayList<VehicleTypeDTO> getAllVehicleType() throws ClassNotFoundException, SQLException {
        ArrayList<VehicleType> all=dao.getAll();
        ArrayList<VehicleTypeDTO> allType=new ArrayList<>();
        for (VehicleType vehicleType : all) {
            allType.add(new VehicleTypeDTO(vehicleType.getVehicle_Type_Id(),vehicleType.getVehicle_Type(),vehicleType.getVehicle_Category()));
        }
        return allType;
    }

    @Override
    public VehicleTypeDTO searchVehicleType(String vehicle_Type_Id) throws SQLException, ClassNotFoundException {
        VehicleType search=dao.search(vehicle_Type_Id);
        return new VehicleTypeDTO(search.getVehicle_Type_Id(),search.getVehicle_Type(),search.getVehicle_Category());
    }
    
}
