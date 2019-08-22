/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.dto;

/**
 *
 * @author Nethadun PC
 */
public class CustomerDTO {
    private String cust_Id;
    private String cust_Name;
    private String cust_Address;
    private String cust_NIC;
    private String cust_Driv_Lic;
    private int cust_Mobile_Num;

    public CustomerDTO() {
    }

    public CustomerDTO(String cust_Id, String cust_Name, String cust_Address, String cust_NIC, String cust_Driv_Lic, int cust_Mobile_Num) {
        this.cust_Id = cust_Id;
        this.cust_Name = cust_Name;
        this.cust_Address = cust_Address;
        this.cust_NIC = cust_NIC;
        this.cust_Driv_Lic = cust_Driv_Lic;
        this.cust_Mobile_Num = cust_Mobile_Num;
    }

    public CustomerDTO(String cust_Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCust_Id() {
        return cust_Id;
    }

    public void setCust_Id(String cust_Id) {
        this.cust_Id = cust_Id;
    }

    public String getCust_Name() {
        return cust_Name;
    }

    public void setCust_Name(String cust_Name) {
        this.cust_Name = cust_Name;
    }

    public String getCust_Address() {
        return cust_Address;
    }

    public void setCust_Address(String cust_Address) {
        this.cust_Address = cust_Address;
    }

    public String getCust_NIC() {
        return cust_NIC;
    }

    public void setCust_NIC(String cust_NIC) {
        this.cust_NIC = cust_NIC;
    }

    public String getCust_Driv_Lic() {
        return cust_Driv_Lic;
    }

    public void setCust_Driv_Lic(String cust_Driv_Lic) {
        this.cust_Driv_Lic = cust_Driv_Lic;
    }

    public int getCust_Mobile_Num() {
        return cust_Mobile_Num;
    }

    public void setCust_Mobile_Num(int cust_Mobile_Num) {
        this.cust_Mobile_Num = cust_Mobile_Num;
    }
    
    
}
