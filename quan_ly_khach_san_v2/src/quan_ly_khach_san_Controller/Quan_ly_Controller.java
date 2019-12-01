/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quan_ly_khach_san_Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author thaibinh
 */
public class Quan_ly_Controller implements Initializable {

    @FXML
    private Button dangXuat_btn;
    @FXML
    private Button quanLyPhong_btn;
    @FXML
    private Button quanLyNhanVien_btn;
    @FXML
    private Button quanLyKhachHang_btn;
    @FXML
    private Button hieuQuaKinhDoanh_btn;
    @FXML 
    private Pane quanLyPhong_Pane;
    @FXML
    private Pane quanLyNhanVien_Pane;
    @FXML
    private Pane thongTinKhachHang_Pane;
    @FXML
    private Pane hieuQuaKinhDoanh_Pane;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        quanLyPhong_Pane.setVisible(true);
       quanLyNhanVien_Pane.setVisible(false);
       thongTinKhachHang_Pane.setVisible(false);
       hieuQuaKinhDoanh_Pane.setVisible(false);
    }    
    @FXML
    private void dangXuat_Click(ActionEvent event) throws Exception {
       
        quan_ly_khach_san_view.Quan_ly_khach_san.setPane(0);
    }
     @FXML
    private void trangThietBi_Click(ActionEvent event) throws Exception {
       
               StackPane secondaryLayout = new StackPane();
                AnchorPane a=new AnchorPane();
                a.getChildren().add((Pane)FXMLLoader.load(getClass().getResource("Trang_thiet_bi.fxml")));
                secondaryLayout.getChildren().add(a);
                Scene secondScene = new Scene(secondaryLayout,590,400);
                // Một cửa sổ mới (Stage)
                Stage newWindow = new Stage();
              //  newWindow.setTitle("Trang Thiết Bị");
                newWindow.setScene(secondScene);
                // Sét đặt vị trí cho cửa sổ thứ 2.
                // Có vị trí tương đối đối với cửa sổ chính.
                newWindow.setX(200);
                newWindow.setY(50);
                newWindow.show();
                
    }
    @FXML
    private void quanLyPhong_Click(ActionEvent event) throws Exception {
       quanLyPhong_Pane.setVisible(true);
       quanLyNhanVien_Pane.setVisible(false);
       thongTinKhachHang_Pane.setVisible(false);
       hieuQuaKinhDoanh_Pane.setVisible(false);
       
     
    }
    @FXML
    private void quanLyNhanVien_Click(ActionEvent event) throws Exception {
       quanLyPhong_Pane.setVisible(false);
       quanLyNhanVien_Pane.setVisible(true);
       thongTinKhachHang_Pane.setVisible(false);
       hieuQuaKinhDoanh_Pane.setVisible(false);
       
     
    }
    @FXML
    private void thongTinKhachHang_Click(ActionEvent event) throws Exception {
       quanLyPhong_Pane.setVisible(false);
       quanLyNhanVien_Pane.setVisible(false);
       thongTinKhachHang_Pane.setVisible(true);
       hieuQuaKinhDoanh_Pane.setVisible(false);
       
     
    }
    @FXML
    private void hieuQuaKinhDoanh_Click(ActionEvent event) throws Exception {
       quanLyPhong_Pane.setVisible(false);
       quanLyNhanVien_Pane.setVisible(false);
       thongTinKhachHang_Pane.setVisible(false);
       hieuQuaKinhDoanh_Pane.setVisible(true);
       
     
    }
    @FXML
    private void taoHoaDon_Click(ActionEvent event) throws Exception {
        System.out.println("click");
        AnchorPane root;
        root = (AnchorPane)FXMLLoader.load(getClass().getClassLoader().getResource("quan_ly_khach_san_view/Tao_hoa_don.fxml"));
        Stage st = new Stage();
        st.setTitle("My New Stage Title");
        st.setScene(new Scene(root));
        st.show();
     
    }
    
}
