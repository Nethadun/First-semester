/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.bo.custom;

import lk.ijse.carRental.bo.SuperBO;
import lk.ijse.carRental.dto.BookingDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.carRental.model.Booking;
import lk.ijse.carRental.model.Customer;
import lk.ijse.carRental.model.MakePayment;

/**
 *
 * @author Nethadun PC
 */
public interface BookingBO extends SuperBO{
    public boolean booking(BookingDTO book)throws ClassNotFoundException,SQLException;
    public ArrayList<Customer> searchCustomerBooks(String text)throws ClassNotFoundException,SQLException;
    
}
