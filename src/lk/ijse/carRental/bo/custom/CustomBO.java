/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.bo.custom;

import lk.ijse.carRental.bo.SuperBO;
import lk.ijse.carRental.dto.CustomerDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Nethadun PC
 */
public interface CustomBO extends SuperBO{
    public boolean addCustomer(CustomerDTO cust)throws ClassNotFoundException,SQLException;
    public boolean updateCustomer(CustomerDTO cust)throws SQLException,ClassNotFoundException;
    public boolean deleteCustomer(String custId)throws SQLException,ClassNotFoundException;
    public CustomerDTO searchCustomer(String custID)throws SQLException,ClassNotFoundException;
    public  ArrayList<CustomerDTO> getAllCustomers()throws ClassNotFoundException,SQLException;
    
}
