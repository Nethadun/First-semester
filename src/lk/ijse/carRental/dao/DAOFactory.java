/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.dao;

import lk.ijse.carRental.bo.custom.impl.BookingBOImpl;
import lk.ijse.carRental.bo.custom.impl.DriverBOImpl;
import lk.ijse.carRental.bo.custom.impl.VehicleBOImpl;
import lk.ijse.carRental.dao.custom.impl.BookDAOImpl;
import lk.ijse.carRental.dao.custom.impl.CustomerDAOImpl;
import lk.ijse.carRental.dao.custom.impl.DriverDAOImpl;
import lk.ijse.carRental.dao.custom.impl.MakePayemntDAOImpl;
import lk.ijse.carRental.dao.custom.impl.OwnerDAOImpl;
import lk.ijse.carRental.dao.custom.impl.VehicleDAOImpl;
import lk.ijse.carRental.dao.custom.impl.VehicleTypeDAOImpl;
import lk.ijse.carRental.model.Customer;

/**
 *
 * @author Nethadun PC
 */
public class DAOFactory {
    private static DAOFactory daoFactory;

    public DAOFactory() {
    }
    
    public static DAOFactory getInstance(){
        if(daoFactory==null){
            daoFactory=new DAOFactory();
        }
        return daoFactory;
    }
    public enum DAOType{
        CUSTOMER,OWNER,VEHICLE,VEHICLETYPE,DRIVER,BOOKING,MAKEPAYMENT
    }
    public SuperDAO getDAO(DAOType types){
    switch(types){
        case CUSTOMER:
            return new CustomerDAOImpl();
        case OWNER:
            return  new OwnerDAOImpl();
        case VEHICLE:
            return new VehicleDAOImpl();
        case VEHICLETYPE:
            return new VehicleTypeDAOImpl();
        case DRIVER:
            return new DriverDAOImpl();
        case BOOKING:
            return new BookDAOImpl();
        case MAKEPAYMENT:
            return new MakePayemntDAOImpl();
            default:
                return null;
        }
    }
}
