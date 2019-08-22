/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.dao.custom;

import lk.ijse.carRental.dao.CrudDAO;
import java.sql.SQLException;
import lk.ijse.carRental.model.Driver;

/**
 *
 * @author Nethadun PC
 */
public interface DriverDAO extends CrudDAO<Driver, String>{
    public void getLastID()throws SQLException ,ClassNotFoundException;
    public void getLastDriver();
}
