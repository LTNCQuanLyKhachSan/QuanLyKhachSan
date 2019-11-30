/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quan_ly_khach_san_Model;

/**
 *
 * @author Admin
 */
public class Room {
    private String id;
    private int type;
    private int price;
    private String equipment;
    private int status;
    private int maxPeople;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public Room(String id, int type, int price, String equipment, int status, int maxPeople) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.equipment = equipment;
        this.status = status;
        this.maxPeople = maxPeople;
    }

    public Room() {
    }
    
    
}
