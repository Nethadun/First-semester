/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.controller;

import lk.ijse.carRental.bo.BOFactory;
import lk.ijse.carRental.bo.custom.BookingBO;
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
public class BookingController {
    static BookingBO bo=(BookingBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.BOOK);
    
    public static boolean booking(BookingDTO booking)throws ClassNotFoundException,SQLException{
        return bo.booking(booking);
    }
    public static ArrayList<Customer>searchCustomerBooks(String text)throws ClassNotFoundException,SQLException{
        return bo.searchCustomerBooks(text);
    }
}
