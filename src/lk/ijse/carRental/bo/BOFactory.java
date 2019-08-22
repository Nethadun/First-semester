/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.bo;

import lk.ijse.carRental.bo.custom.impl.BookingBOImpl;
import lk.ijse.carRental.bo.custom.impl.CustomerBOImpl;
import lk.ijse.carRental.bo.custom.impl.DriverBOImpl;
import lk.ijse.carRental.bo.custom.impl.OwnerBOImpl;
import lk.ijse.carRental.bo.custom.impl.VehicleBOImpl;
import lk.ijse.carRental.bo.custom.impl.VehicleTypeBOImpl;

/**
 *
 * @author Nethadun PC
 */
public class BOFactory {
    private static BOFactory bOFactory;

    public BOFactory() {
    }
    
    public static BOFactory getInstance(){
        if(bOFactory==null){
            bOFactory=new BOFactory();
        }
        return bOFactory;
    }
    public enum BOTypes{
        CUSTOMER,OWNER,VEHICLE,VEHICLETYPE,DRIVER,BOOK
    }
    public SuperBO getBO(BOTypes types){
        switch (types){
            case CUSTOMER:
                return new CustomerBOImpl();
            case OWNER:
                return new OwnerBOImpl();
            case VEHICLE:
                return new VehicleBOImpl();
            case VEHICLETYPE:
                return new VehicleTypeBOImpl();
            case DRIVER:
                return new DriverBOImpl();
            case BOOK:
                return new BookingBOImpl();
                default:
                    return null;
        }
    }
}
