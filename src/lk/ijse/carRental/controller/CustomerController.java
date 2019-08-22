/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.controller;

import lk.ijse.carRental.bo.BOFactory;
import lk.ijse.carRental.bo.custom.CustomBO;
import lk.ijse.carRental.dao.CrudUtill;
import lk.ijse.carRental.dto.CustomerDTO;
import lk.ijse.carRental.generater.IDGenerater;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.carRental.model.Customer;


/**
 *
 * @author Nethadun PC
 */
public class CustomerController {
    
    static CustomBO bo=(CustomBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.CUSTOMER);
        
        
    public static boolean addCustomer(CustomerDTO cust) throws ClassNotFoundException, SQLException{
        return bo.addCustomer(cust);
    }
    public static boolean updateCustomer(CustomerDTO cust) throws ClassNotFoundException, SQLException{
        return bo.updateCustomer(cust);
    }
    public static boolean deleteCustomer(String custId) throws ClassNotFoundException, SQLException{
       return bo.deleteCustomer(custId);
    }
    public static ArrayList<CustomerDTO> getAllCustomer() throws ClassNotFoundException, SQLException{
        return bo.getAllCustomers();
    }
    public static CustomerDTO searchCustomer(String custId) throws ClassNotFoundException, SQLException{
        return bo.searchCustomer(custId);
    }
    
        
}

