/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quan_ly_khach_san_Controller;

import java.sql.ResultSet;
import java.util.ArrayList;
import quan_ly_khach_san_Model.Database;
import quan_ly_khach_san_Model.Room;

/**
 *
 * @author Admin
 */
public class Quan_ly_phong_Controller {
    public ArrayList DanhSachPhong(){
        Database database = new Database();
        ArrayList<Room> list = new ArrayList<Room>();
        String [] cols = {};
        ResultSet roomList = database.Index("room", cols);
        try{
            while (roomList.next()){
                list.add(new Room(roomList.getString(1),roomList.getInt(2),roomList.getInt(3),roomList.getString(4),roomList.getInt(5),roomList.getInt(6)));
//                System.out.println(roomList.getString("equipments"));
            }
        }catch(Exception e){
            System.out.println("ERROR CONNECTION");
        }
        return list;
    }
}
