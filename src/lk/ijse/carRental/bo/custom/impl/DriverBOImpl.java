/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.bo.custom.impl;

import lk.ijse.carRental.bo.custom.DriverBO;
import lk.ijse.carRental.dao.DAOFactory;
import lk.ijse.carRental.dao.custom.DriverDAO;
import lk.ijse.carRental.dto.DriverDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.carRental.model.Driver;

/**
 *
 * @author Nethadun PC
 */
public class DriverBOImpl implements DriverBO{
    
    DriverDAO dao=(DriverDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOType.DRIVER);

    @Override
    public boolean addDriver(DriverDTO driver) throws ClassNotFoundException, SQLException {
        return dao.add(new Driver(driver.getDriver_Id(),driver.getDriver_Name(),driver.getDriver_Licence(),driver.getDriver_Age(),driver.getDriver_Address()));
    }

    @Override
    public boolean updateDriver(DriverDTO driver) throws SQLException, ClassNotFoundException {
        return dao.update(new Driver(driver.getDriver_Id(),driver.getDriver_Name(),driver.getDriver_Licence(),driver.getDriver_Age(),driver.getDriver_Address()));
    }

    @Override
    public boolean deleteDriver(String driver_Id) throws SQLException, ClassNotFoundException {
        return dao.delete(driver_Id);
    }

    @Override
    public ArrayList<DriverDTO> getAllDriver() throws ClassNotFoundException, SQLException {
        ArrayList<Driver> all=dao.getAll();
        ArrayList<DriverDTO> allDriver=new ArrayList<>();
        for (Driver driver : all) {
            allDriver.add(new DriverDTO(driver.getDriver_Id(),driver.getDriver_Name(),driver.getDriver_Licence(),driver.getDriver_Age(),driver.getDriver_Address()));
        }
        return allDriver;
    }

    @Override
    public DriverDTO searchDriver(String driver_Id) throws SQLException, ClassNotFoundException {
         Driver search=dao.search(driver_Id);
         return new DriverDTO(search.getDriver_Id(),search.getDriver_Name(),search.getDriver_Licence(),search.getDriver_Age(),search.getDriver_Address());
    }
    
}
