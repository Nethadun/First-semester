/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.dao.custom.impl;

import lk.ijse.carRental.dao.CrudUtill;
import lk.ijse.carRental.dao.custom.DriverDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.carRental.model.Driver;

/**
 *
 * @author Nethadun PC
 */
public class DriverDAOImpl implements DriverDAO{

    @Override
    public void getLastID() throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getLastDriver() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void curdTest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Driver driver) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("insert into driver values(?,?,?,?,?)", driver.getDriver_Id(),driver.getDriver_Name(),driver.getDriver_Licence(),driver.getDriver_Age(),driver.getDriver_Address());
    }

    @Override
    public boolean update(Driver driver) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("update driver set driver_Name=?,driver_Licence=?,driver_Age=?,driver_Address=? where driver_Id=?", driver.getDriver_Name(),driver.getDriver_Licence(),driver.getDriver_Age(),driver.getDriver_Address(),driver.getDriver_Id());
    }

    @Override
    public boolean delete(String driver_Id) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("delete from driver where driver_Id=?", driver_Id);
    }

    @Override
    public ArrayList<Driver> getAll() throws ClassNotFoundException, SQLException {
        ResultSet rst=CrudUtill.executeQuery("select * from driver");
        ArrayList<Driver> allDriver=new ArrayList();
        while(rst.next()){
            allDriver.add(new Driver(rst.getString(1),rst.getString(2),rst.getString(3),rst.getInt(4),rst.getString(5)));
        }
        return allDriver;
    }

    @Override
    public void test() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Driver search(String driver_Id) throws ClassNotFoundException, SQLException {
        ResultSet rst=CrudUtill.executeQuery("select * from driver where driver_Id=?", driver_Id);
        Driver driver=null;
        while(rst.next()){
            driver=new Driver(rst.getString(1),rst.getString(2),rst.getString(3),rst.getInt(4),rst.getString(5));
        }
        return driver;
    }
    
}
