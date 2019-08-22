/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.dao.custom.impl;

import lk.ijse.carRental.dao.CrudUtill;
import lk.ijse.carRental.dao.custom.CustomerDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.carRental.model.Customer;

/**
 *
 * @author Nethadun PC
 */
public class CustomerDAOImpl implements CustomerDAO{

    
    @Override
    public boolean add(Customer customer) throws ClassNotFoundException, SQLException{
            return CrudUtill.executeUpdate("insert into customer values(?,?,?,?,?,?)", customer.getCust_Id(),customer.getCust_Name(),customer.getCust_Address(),customer.getCust_NIC(),customer.getCust_Driv_Lic(),customer.getCust_Mobile_Num());
        
    }

    @Override
    public boolean update(Customer customer) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("update customer set cust_Name=?,cust_Address=?,cust_NIC=?,cust_Driv_Lic=?,cust_Mobile_Num=? where cust_Id=?", customer.getCust_Name(),customer.getCust_Address(),customer.getCust_NIC(),customer.getCust_Driv_Lic(),customer.getCust_Mobile_Num(),customer.getCust_Id());
    }

    @Override
    public boolean delete(String custId) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("delete from customer where cust_Id = ?", custId);
    }

    @Override
    public ArrayList<Customer> getAll() throws SQLException, ClassNotFoundException {
         ResultSet rst=CrudUtill.executeQuery("select * from customer");
         ArrayList<Customer> allCustomer=new ArrayList();
         while(rst.next()){
             allCustomer.add(new Customer(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getInt(6)));
         }
         return allCustomer;        
    }

    @Override
    public void curdTest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public void getLastCustomer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer search(String custId) throws ClassNotFoundException, SQLException {
        ResultSet rst=CrudUtill.executeQuery("select * from customer where cust_Id=?", custId);
        Customer customer=null;
        while(rst.next()){
            customer=new Customer(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getInt(6));
        }
        return customer;
    }

    

         
}
