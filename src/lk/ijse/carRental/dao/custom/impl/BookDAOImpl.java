/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.dao.custom.impl;

import lk.ijse.carRental.dao.CrudUtill;
import lk.ijse.carRental.dao.custom.BookDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.carRental.model.Booking;

/**
 *
 * @author Nethadun PC
 */
public class BookDAOImpl implements BookDAO{

    @Override
    public String getLastBook() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Booking booking, String book_Id, String cust_Id, String rent_Start_Date, String rent_End_Date, String vehicle_Id, String book_Type, String driver_Id, int current_Milege) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void curdTest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Booking booking) throws ClassNotFoundException, SQLException {
         return CrudUtill.executeUpdate("insert into booking values(?,?,?,?,?,?,?,?)", booking.getBook_Id(),booking.getCust_Id(),booking.getRent_Start_Date(),booking.getRent_End_Date(),booking.getVehicle_Id(),booking.getBook_Type(),booking.getDriver_Id(),booking.getCurrent_Milege());
    }

    @Override
    public boolean update(Booking booking) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("update booking set cust_Id=?,rent_Start_Date=?,rent_End_Date=?,vehicle_Id=?,book_Type=?,driver_Id=?,current_Milege=? where book_Id=?", booking.getCust_Id(),booking.getRent_Start_Date(),booking.getRent_End_Date(),booking.getVehicle_Id(),booking.getBook_Type(),booking.getDriver_Id(),booking.getCurrent_Milege(),booking.getBook_Id());
    }

    @Override
    public boolean delete(String bookId) throws ClassNotFoundException, SQLException {
         return CrudUtill.executeUpdate("delete from booking where book_Id=?", bookId);
    }

    @Override
    public ArrayList<Booking> getAll() throws ClassNotFoundException, SQLException {
        ResultSet rst=CrudUtill.executeQuery("select * from booking");
        ArrayList<Booking> allBooks=new ArrayList<>();
        while(rst.next()){
            allBooks.add(new Booking(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7),rst.getInt(8)));
        }
        return allBooks;
    }

    @Override
    public Booking search(String t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void test() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
