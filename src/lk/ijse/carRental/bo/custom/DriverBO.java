/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.bo.custom;

import lk.ijse.carRental.bo.SuperBO;
import lk.ijse.carRental.dto.DriverDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Nethadun PC
 */
public interface DriverBO extends SuperBO{
    public boolean addDriver(DriverDTO driver)throws ClassNotFoundException,SQLException;
    public boolean updateDriver(DriverDTO driver)throws SQLException,ClassNotFoundException;
    public boolean deleteDriver(String driver_Id)throws SQLException,ClassNotFoundException;
    public DriverDTO searchDriver(String driver_Id)throws SQLException,ClassNotFoundException;
    public ArrayList<DriverDTO>getAllDriver()throws ClassNotFoundException,SQLException;
}
