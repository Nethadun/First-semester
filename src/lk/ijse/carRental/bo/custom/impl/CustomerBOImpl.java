/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.bo.custom.impl;

import lk.ijse.carRental.bo.custom.CustomBO;
import lk.ijse.carRental.dao.DAOFactory;
import lk.ijse.carRental.dao.custom.CustomerDAO;
import lk.ijse.carRental.dto.CustomerDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.carRental.model.Customer;

/**
 *
 * @author Nethadun PC
 */
public class CustomerBOImpl implements CustomBO{
    
    CustomerDAO dao=(CustomerDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOType.CUSTOMER);

    @Override
    public boolean addCustomer(CustomerDTO custm)throws ClassNotFoundException,SQLException{
        return dao.add(new Customer(custm.getCust_Id(),custm.getCust_Name(),custm.getCust_Address(),custm.getCust_NIC(),custm.getCust_Driv_Lic(),custm.getCust_Mobile_Num()));
    }

    @Override
    public boolean updateCustomer(CustomerDTO custm)throws SQLException,ClassNotFoundException{
         return dao.update(new Customer(custm.getCust_Id(),custm.getCust_Name(),custm.getCust_Address(),custm.getCust_NIC(),custm.getCust_Driv_Lic(),custm.getCust_Mobile_Num()));
    }

    @Override
    public boolean deleteCustomer(String custId)throws SQLException,ClassNotFoundException{
         return dao.delete(custId);
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomers()throws ClassNotFoundException,SQLException{
        ArrayList<Customer>all=dao.getAll();
        ArrayList<CustomerDTO> allCustomer=new ArrayList<>();
        for (Customer customer : all) {
            allCustomer.add(new CustomerDTO(customer.getCust_Id(),customer.getCust_Name(),customer.getCust_Address(),customer.getCust_NIC(),customer.getCust_Driv_Lic(),customer.getCust_Mobile_Num()));
            
        }
        return allCustomer;
    }

    @Override
    public CustomerDTO searchCustomer(String custID) throws SQLException, ClassNotFoundException {
        Customer search=dao.search(custID);
        return new CustomerDTO(search.getCust_Id(),search.getCust_Name(),search.getCust_Address(),search.getCust_NIC(),search.getCust_Driv_Lic(),search.getCust_Mobile_Num());
    }
    
}
