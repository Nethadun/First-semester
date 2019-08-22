/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.dao.custom;

import lk.ijse.carRental.dao.CrudDAO;
import java.sql.SQLException;
import lk.ijse.carRental.model.Booking;

/**
 *
 * @author Nethadun PC
 */
public interface BookDAO extends CrudDAO<Booking, String>{
    public String getLastBook()throws ClassNotFoundException,SQLException;
    public boolean add(Booking booking,String book_Id,String cust_Id,String rent_Start_Date,String rent_End_Date,String vehicle_Id,String book_Type,String driver_Id,int current_Milege);
    
}
