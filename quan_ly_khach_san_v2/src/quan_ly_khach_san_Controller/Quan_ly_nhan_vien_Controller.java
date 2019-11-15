/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quan_ly_khach_san_Controller;


import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.image.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author thaibinh
 */
public class Quan_ly_nhan_vien_Controller implements Initializable{
   
    @FXML
    private Pane trangChu_pane;
    @FXML
    private Pane thongTinNhanVien_pane;
    @FXML
    private Pane luongThuong_pane;
    @FXML
    private Pane lichLamViec_pane;
    @FXML
    private Stage stage;
    
    @FXML 
    private ImageView anhPhong_ImageView;
    @FXML private ChoiceBox loaiPhong_ChoiceBox;
    @FXML private ChoiceBox trangThai_ChoiceBox;
    @FXML private ChoiceBox tang_ChoiceBox;
    @FXML private ChoiceBox phong_ChoiceBox;
    @FXML private Label soPhongTrong_Label;
    @FXML private Pane chon_Pane;
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
       // label.setText("Hello World!");
    }
    @FXML
    private void trangChu_Click(ActionEvent event) {
        luongThuong_pane.setVisible(false);
        thongTinNhanVien_pane.setVisible(false);
        luongThuong_pane.setVisible(false);
        trangChu_pane.setVisible(true);
       
        
    }
    @FXML
    private void thongTinNhanVien_Click(ActionEvent event) {
        trangChu_pane.setVisible(false);
        luongThuong_pane.setVisible(false);
        lichLamViec_pane.setVisible(false);
        thongTinNhanVien_pane.setVisible(true);
    }
    @FXML
    private void luongThuong_Click(ActionEvent event) {
       
        thongTinNhanVien_pane.setVisible(false);
        trangChu_pane.setVisible(false);
        luongThuong_pane.setVisible(true);
        lichLamViec_pane.setVisible(false);
    }
    @FXML
    private void lichLamViec_Click(ActionEvent event) {
       
        thongTinNhanVien_pane.setVisible(false);
        trangChu_pane.setVisible(false);
        luongThuong_pane.setVisible(false);
        lichLamViec_pane.setVisible(true);
    }
    @FXML
    private void dangXuat_Click(ActionEvent event) throws Exception {
       
      /*  File file = new File("image/phong3.jpg");
       trangChu_pane.setVisible(true);
       System.out.println(file.toURI().toString());
        Image image=new Image(file.toURI().toString());
        System.out.println(image.getWidth());
        anhPhong_ImageView.setImage(image);
        anhPhong_ImageView.setVisible(true);*/
    }
    @FXML
    private void loaiPhong_Click(ActionEvent event) throws Exception {
       
       
    }
    @FXML
    private void trangThai_Click(ActionEvent event) throws Exception {
       
       
    }
    @FXML
    private void tang_Click(ActionEvent event) throws Exception {
       
       
    }
    @FXML
    private void phong_Click(ActionEvent event) throws Exception {
       
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    

   
}
