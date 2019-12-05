/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quan_ly_khach_san_view;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.awt.GridBagConstraints;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import quan_ly_khach_san_Controller.Quan_ly_phong_Controller;
import quan_ly_khach_san_Model.Room;



/**
 *
 * @author thaibinh
 */
public class Quan_ly_khach_san extends Application {
    static AnchorPane root;
    static List<Pane> grid=new ArrayList<Pane>();
    private static int idx_cur=0;
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Hệ thống quản lý khách sạn Pari Deli");
        root = (AnchorPane)FXMLLoader.load(getClass().getResource("FXML.fxml"));
        
        grid.add((Pane)FXMLLoader.load(getClass().getResource("Dang_nhap.fxml")));
        grid.add((Pane)FXMLLoader.load(getClass().getResource("Quan_ly_nhan_vien_v1.fxml")));
        grid.add((Pane)FXMLLoader.load(getClass().getResource("Quan_ly_v1.fxml")));
        root.getChildren().add(grid.get(0));
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
         quan_ly_khach_san_Controller.Quan_ly_phong_Controller r = new Quan_ly_phong_Controller();
//        ArrayList<Room> mList =  r.DanhSachPhongTrong();
//        for (int i = 0; i < mList.size(); i++){
//            System.out.println(mList.get(i).getStatus());
//        }
        r.DatPhong("101","tuan", 2,  "2019-12-31 22:38:00");
//        r.TraPhong("106","2019-12-05 08:40:41");

//        System.out.println("ID Hotel " + r.getIdHotel("101"));
        System.out.println("TEST TUAN");

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    public static Pane getPane(int idx)
    {
        return grid.get(idx);
    }
    public static void setPane(int idx)
    {
        root.getChildren().remove(grid.get(idx_cur));
        root.getChildren().add(grid.get(idx));
        idx_cur=idx;
    }
}
