/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.dao.custom.impl;

import lk.ijse.carRental.dao.CrudUtill;
import lk.ijse.carRental.dao.custom.VehicleDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.carRental.model.Vehicle;

/**
 *
 * @author Nethadun PC
 */
public class VehicleDAOImpl implements VehicleDAO{

    @Override
    public void getLastID() throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getLastOwner() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void curdTest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Vehicle vehi) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("insert into vehicle values(?,?,?,?,?,?)", vehi.getVehicle_Id(),vehi.getOwner_Id(),vehi.getVehicle_Type_Id(),vehi.getColour(),vehi.getRent(),vehi.getNo_Pass());
    }

    @Override
    public boolean update(Vehicle vehi) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("update vehicle set owner_Id=?,vehicle_Type_Id=?,colour=?,rent=?,no_Pass=? where vehicle_Id=?", vehi.getOwner_Id(),vehi.getVehicle_Type_Id(),vehi.getColour(),vehi.getRent(),vehi.getNo_Pass(),vehi.getVehicle_Id());
    }

    @Override
    public boolean delete(String vehicle_Id) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("delete from vehicle where vehicle_Id=?",vehicle_Id);
    }

    @Override
    public ArrayList<Vehicle> getAll() throws ClassNotFoundException, SQLException {
        ResultSet rst=CrudUtill.executeQuery("select * from vehicle");
        ArrayList<Vehicle> allVehicle=new ArrayList();
        while(rst.next()){
            allVehicle.add(new Vehicle(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getDouble(5),rst.getInt(6)));
        }
        return allVehicle;
    }

    @Override
    public void test() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vehicle search(String vehicleId) throws ClassNotFoundException, SQLException {
        ResultSet rst=CrudUtill.executeQuery("select * from vehicle where vehicle_Id=?", vehicleId);
        Vehicle vehicle=null;
        while(rst.next()){
            vehicle=new Vehicle(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getDouble(5),rst.getInt(6));
        }
        return vehicle;
    }

    

    

    

    
    
}
