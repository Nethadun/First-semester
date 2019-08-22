/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.dao.custom.impl;

import lk.ijse.carRental.dao.CrudUtill;
import lk.ijse.carRental.dao.custom.OwnerDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.carRental.model.Owner;

/**
 *
 * @author Nethadun PC
 */
public class OwnerDAOImpl implements OwnerDAO{

    @Override
    public boolean add(Owner owner) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("insert into owner values(?,?,?,?,?)", owner.getOwner_Id(),owner.getOwner_Name(),owner.getOwner_Address(),owner.getOwner_NIC(),owner.getOwner_Mob());
    }

    @Override
    public boolean update(Owner owner) throws ClassNotFoundException, SQLException {
         return CrudUtill.executeUpdate("update owner set owner_Name=?,owner_Address=?,owner_NIC=?,owner_Mob=? where owner_Id=?", owner.getOwner_Name(), owner.getOwner_Address(), owner.getOwner_NIC(),owner.getOwner_Mob(),owner.getOwner_Id());
    }

    @Override
    public boolean delete(String owner_Id) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("delete from owner where owner_Id = ?", owner_Id);
    }

    @Override
    public ArrayList<Owner> getAll() throws ClassNotFoundException, SQLException {
        ResultSet rst=CrudUtill.executeQuery("select * from owner");
        ArrayList<Owner> allOwner=new ArrayList();
        while(rst.next()){
            allOwner.add(new Owner(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getInt(5)));
        }
        return allOwner;
    }

    @Override
    public void test() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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
    public Owner search(String owner_Id) throws ClassNotFoundException, SQLException {
        ResultSet rst=CrudUtill.executeQuery("select * from owner where owner_Id=?", owner_Id);
        Owner owner=null;
        while(rst.next()){
            owner=new Owner(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getInt(5));
        }
        return owner;
    }
    
}
