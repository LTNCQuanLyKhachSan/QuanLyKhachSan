/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quan_ly_khach_san_Model;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author Admin
 */
public class Database {
    private Connection connection;
    private Statement statement;
    public void Connection(){
        try {
            this.connection = (Connection) DriverManager.getConnection("jdbc:mysql://us-cdbr-iron-east-05.cleardb.net/heroku_02c080a2422d233?" + 
                    "useUnicode=true&characterEncoding=utf-8","be19d79672911a","b79ded18");
            // Do something with connection
            this.statement = (Statement) connection.createStatement(); 
            System.out.println("Connected successfully");
        } catch (SQLException ex){
            // Handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState:" + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
    public ResultSet Index(String table, String [] cols, String [] colsWhere, Vector valueWhere){
        Connection();
        ResultSet resultSet = null;
        // Khởi tạo đối tượng statement với connection là đối tượng đã kết nối tới CSDL
        String sql = "SELECT ";
        // Đọan code này thực hiện "viết" câu lệnh truy vấn theo 2 trường hợp có tên cột hoặc không có tên cột.
        if(cols == null || cols.length == 0){
            sql += "* FROM";
        }else{
            for(int i = 0 ; i < cols.length; i++){
                sql += "`" + cols[i] + "`, ";
            }
            sql += ";";
            sql = sql.replace("`, ;", "` FROM");
        }
        sql += " " + table;
        if(colsWhere.length != 0){
            sql += (" WHERE ");

            for(int i = 0; i < colsWhere.length; i++){
                sql += "`" + colsWhere[i] + "` = '" + valueWhere.elementAt(i) + "' AND ";
            }
            sql += ";";
            sql = sql.replace("' AND ;", "'");
            
        }
        System.out.println(sql);
        try {
            // Thực thi truy vấn thông qua statement và đưa kết quả trả về cho resultSet
            resultSet = statement.executeQuery(sql);
        } catch (SQLException e) {
            return null;
        }
        return resultSet;
    }
    
    public boolean Insert(String table, String [] cols, Vector vecto){
        Connection();
        try {
            String sql = "INSERT INTO " + table ;
            if(cols.length > 0){
                sql += "( ";
                for(int i = 0 ; i < cols.length; i++){
                    sql += " `" + cols[i] + "`, ";
                }
                sql += ")";
                sql = sql.replace("`, )", "` )");
            }
            sql += " VALUES(";
            for(int i = 0; i < vecto.size(); i++){
                sql += "'" + vecto.elementAt(i).toString() + "',";
            }
            sql += ")";
            sql = sql.replace("',)", "')");
            System.out.println(sql); 
            // Thực hiện lệnh chèn dư liệu
            if(statement.executeUpdate(sql) >= 1){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean Update(String table, String[] cols, Vector value, String[] colsWhere, Vector valueWhere){
        Connection();
        try {
            String sql = "UPDATE " + table + " SET ";
            for(int i = 0 ; i < cols.length; i++){
                sql += "`" + cols[i] + "` = '" + value.elementAt(i) + "', ";
            }
            sql += ";";
            sql = sql.replace("', ;", "' WHERE ");
             
            for(int i = 0 ; i < colsWhere.length; i++){
                sql += "`" + colsWhere[i] + "` = '" + valueWhere.elementAt(i) + "' AND ";
            }
            sql += ";";
            sql = sql.replace("' AND ;", "'");
            System.out.println(sql);
            statement.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
     
    public boolean Delete(String table, String[] colsWhere, Vector valueWhere){
        Connection();
        try {
            String sql = "DELETE FROM" + table;
             
            if( colsWhere.length > 0){
                sql += " WHERE ";
                for(int i = 0 ; i < colsWhere.length; i++){
                    sql += "`" + colsWhere[i] + "` = '" + valueWhere.elementAt(i) + "' AND ";
                }
                sql += ";";
                sql = sql.replace("' AND ;", "'");
            }
            statement.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
