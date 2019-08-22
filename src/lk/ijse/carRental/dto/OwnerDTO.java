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
public class OwnerDTO {
    private String owner_Id;
    private String owner_Name; 
    private String owner_Address; 
    private String owner_NIC; 
    private int owner_Mob;

    public OwnerDTO() {
    }

    public OwnerDTO(String owner_Id, String owner_Name, String owner_Address, String owner_NIC, int owner_Mob) {
        this.owner_Id = owner_Id;
        this.owner_Name = owner_Name;
        this.owner_Address = owner_Address;
        this.owner_NIC = owner_NIC;
        this.owner_Mob = owner_Mob;
    }

    public String getOwner_Id() {
        return owner_Id;
    }

    public void setOwner_Id(String owner_Id) {
        this.owner_Id = owner_Id;
    }

    public String getOwner_Name() {
        return owner_Name;
    }

    public void setOwner_Name(String owner_Name) {
        this.owner_Name = owner_Name;
    }

    public String getOwner_Address() {
        return owner_Address;
    }

    public void setOwner_Address(String owner_Address) {
        this.owner_Address = owner_Address;
    }

    public String getOwner_NIC() {
        return owner_NIC;
    }

    public void setOwner_NIC(String owner_NIC) {
        this.owner_NIC = owner_NIC;
    }

    public int getOwner_Mob() {
        return owner_Mob;
    }

    public void setOwner_Mob(int owner_Mob) {
        this.owner_Mob = owner_Mob;
    }
    
    
}
