/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quan_ly_khach_san_Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
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
        String table = "classroom";
        String [] cols = {};
        String [] colsWhere = {};
        Vector valuesWhere = new Vector();
        ResultSet roomList = database.Index(table, cols, colsWhere, valuesWhere);
        try{
            while (roomList.next()){
                list.add(new Room(roomList.getString(1),roomList.getInt(2),roomList.getInt(3),roomList.getInt(4),roomList.getInt(5)));
            }
        }catch(Exception e){
            System.out.println("ERROR CONNECTION");
        }
        return list;
    }
    public ArrayList DanhSachPhongTrong(){
        Database database = new Database();
        ArrayList<Room> emptyList = new ArrayList<Room>();
        String table = "classroom";
        String [] cols = {};
        String [] colsWhere = {"status_classroom"};
        Vector valuesWhere = new Vector();
        valuesWhere.add(0);
        
        ResultSet roomList = database.Index(table, cols, colsWhere, valuesWhere);
        try{
            while (roomList.next()){
                emptyList.add(new Room(roomList.getString(1),roomList.getInt(2),roomList.getInt(3),roomList.getInt(4),roomList.getInt(5)));
            }
        }catch(Exception e){
            System.out.println("ERROR CONNECTION");
        }
        return emptyList;    
    }
    public int getIdHotel(String idRoom){
        String table = "classroom";
        String [] cols = {"link_hotel"};
        String [] colsWhere = {"identity_classroom"};
        Vector valuesWhere = new Vector();
        valuesWhere.add(idRoom);
        Database database = new Database();
        ResultSet item = database.Index(table, cols, colsWhere, valuesWhere);
        try{
            while(item.next()){
                return item.findColumn(cols[0]);
            }
        }catch(SQLException e){
            System.out.println("ERROR ID HOTEL");
        }
        return -1;
    }
    public boolean DatPhong(String idRoom, String idEmployee, int idCustomer, String timeStart ){
    /**
     * Mô tả    : Thực hiện đặt phòng cho khách hàng
     * Chức năng: Thay đổi trạng thái status_classroom từ 0 -> 1
     *            Thêm lịch sử đặt phòng ở bảng Coupon
     *            Thời gian endtime ban đầu mặc định lấy bằng starttime
     * Yêu cầu  : Để thực hiện đặt phòng thành công, cần phải kiểm tra phòng đó còn trồng hay không (status_classroom == 0)
     */ 
        // Table ClassRoom
        String table1 = "classroom";
        String [] cols1 = {"status_classroom"};
        Vector values1 = new Vector();
        values1.add(1);
        String [] colsWhere1 = {"identity_classroom","status_classroom"};
        Vector valuesWhere1 = new Vector();
        valuesWhere1.add(idRoom);
        valuesWhere1.add(0);
        String table2 = "coupon";
        String [] cols2 = {"timestart", "timeend", "link_hotel", "link_classroom", "link_customer", "link_employee", "status_coupon"};
        int couponStatus = 0;
        int idHotel = getIdHotel(idRoom);
        Vector values2 = new Vector();
//        values2.add(idCoupon);
        values2.add(timeStart);
        values2.add(timeStart);
        values2.add(idHotel);
        values2.add(idRoom);
        values2.add(idCustomer);
        values2.add(idEmployee);
        values2.add(couponStatus);
        // Cập nhật CSDL
        Database database = new Database();
        if (database.Update(table1, cols1, values1, colsWhere1, valuesWhere1) && database.Insert(table2, cols2, values2)){
            System.out.println("ORDER ROOM SUCCESSFULLY");
            return true;
        }
        System.out.println("ORDER ROOM UNSUCCESSFULLY");
        return false;   
    }
    public boolean TraPhong(String idRoom, String time){
    /**
     * Mô tả    : Thực hiện tra phong
     * Chức năng: Thay đổi trạng thái status_classroom từ 1 -> 0
     *            Thêm thời gian tra phong vao coupon để tính hóa đơn
     * Yêu cầu  : Để thực hiện đặt phòng thành công
     */ 
        String table = "coupon";
        String [] cols = {"timeend"};
        String [] colsWhere = {"link_classroom"};
        Vector values = new Vector();
        values.add(time);
        Vector valuesWhere = new Vector();
        valuesWhere.add(idRoom);
        valuesWhere.add(0);
        //
        String table1 = "classroom";
        String [] cols1 = {"status_classroom"};
        Vector values1 = new Vector();
        values1.add(0);
        String [] colsWhere1 = {"identity_classroom"};
        Vector valuesWhere1 = new Vector();
        valuesWhere1.add(idRoom);
        //
        Database database = new Database();
        if(database.Update(table, cols, values, colsWhere, valuesWhere) && database.Update(table1, cols1, values1, colsWhere1, valuesWhere1)){
            System.out.println("CHECK OUT SUCCESSFULLY");
            return true;
        }else {
            System.out.println("CHECK OUT UNSUCCESSFULLY");
            return false;
        }
    }
}
