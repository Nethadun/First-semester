/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.dao.custom.impl;

import lk.ijse.carRental.dao.CrudUtill;
import lk.ijse.carRental.dao.custom.VehicleTypeDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.carRental.model.VehicleType;

/**
 *
 * @author Nethadun PC
 */
public class VehicleTypeDAOImpl implements VehicleTypeDAO{

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
    public boolean add(VehicleType type) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("insert into vehicle_type values(?,?,?)", type.getVehicle_Type_Id(),type.getVehicle_Type(),type.getVehicle_Category());
    }

    @Override
    public boolean update(VehicleType type) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("update vehicle_type set vehicle_Type=?,vehicle_Category=? where vehicle_Type_Id=?", type.getVehicle_Type(),type.getVehicle_Category(),type.getVehicle_Type_Id());
    }

    @Override
    public boolean delete(String vehicle_Type_Id) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("delete from vehicle_type where vehicle_Type_Id=?", vehicle_Type_Id);
    }

    @Override
    public ArrayList<VehicleType> getAll() throws ClassNotFoundException, SQLException {
        ResultSet rst=CrudUtill.executeQuery("select * from vehicle_type");
        ArrayList<VehicleType> allType=new ArrayList<>();
        while(rst.next()){
            allType.add(new VehicleType(rst.getString(1),rst.getString(2),rst.getString(3)));
        }
        return allType;
    }

    @Override
    public void test() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VehicleType search(String vehicle_Type_Id) throws ClassNotFoundException, SQLException {
        ResultSet rst=CrudUtill.executeQuery("select * from vehicle_Type where vehicle_Type_Id=?", vehicle_Type_Id);
        VehicleType type=null;
        while(rst.next()){
            type=new VehicleType(rst.getString(1),rst.getString(2),rst.getString(3));
        }
        return type;
    }
    
    
}
