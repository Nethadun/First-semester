/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.controller;

import lk.ijse.carRental.bo.BOFactory;
import lk.ijse.carRental.bo.custom.DriverBO;
import lk.ijse.carRental.dto.DriverDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Nethadun PC
 */
public class DriverController {
    static DriverBO bo=(DriverBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.DRIVER);
    
    public static boolean addDriver(DriverDTO driver)throws ClassNotFoundException,SQLException{
        return bo.addDriver(driver);
    }
    public static boolean updateDriver(DriverDTO driver) throws SQLException, ClassNotFoundException{
        return bo.updateDriver(driver);
    }
    public static boolean deleteDriver(String driver_Id) throws SQLException, ClassNotFoundException{
        return bo.deleteDriver(driver_Id);
    }
    public static ArrayList<DriverDTO>getAllDriver() throws ClassNotFoundException, SQLException{
        return bo.getAllDriver();
    }
    public static DriverDTO searchDriver(String driverId) throws SQLException, ClassNotFoundException{
        return bo.searchDriver(driverId);
    }
}
