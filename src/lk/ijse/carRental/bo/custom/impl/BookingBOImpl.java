/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.bo.custom.impl;

import lk.ijse.carRental.bo.custom.BookingBO;
import lk.ijse.carRental.dao.DAOFactory;
import lk.ijse.carRental.dao.custom.BookDAO;
import lk.ijse.carRental.dao.custom.MakePaymentDAO;
import lk.ijse.carRental.db.DBConnection;
import lk.ijse.carRental.dto.BookingDTO;
import lk.ijse.carRental.dto.MakePaymentDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.carRental.model.Booking;
import lk.ijse.carRental.model.Customer;
import lk.ijse.carRental.model.MakePayment;

/**
 *
 * @author Nethadun PC
 */
public class BookingBOImpl implements BookingBO {

    BookDAO book = (BookDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOType.BOOKING);
    MakePaymentDAO makepayment = (MakePaymentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOType.MAKEPAYMENT);

    @Override
    public boolean booking(BookingDTO b) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        try {
            connection.setAutoCommit(false);
            boolean add = book.add(new Booking(b.getBook_Id(), b.getCust_Id(), b.getRent_Start_Date(), b.getRent_End_Date(), b.getVehicle_Id(), b.getBook_Type(), b.getDriver_Id(), b.getCurrent_Milege()));
            if (add) {

                boolean makePaymentAded = makepayment.add(b.getAllMakePayment());
                if (!makePaymentAded) {
                    connection.rollback();
                    return false;
                } else {
                    connection.commit();
                    return true;
                }

            } else {
                connection.rollback();
                return false;
            }
        } finally {
            connection.setAutoCommit(true);
        }
    }

    @Override
    public ArrayList<Customer> searchCustomerBooks(String text) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
